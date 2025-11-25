package com.example.rabina_2207057_cvbuilder;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DatabaseHelper {
    private static final String DB_URL = "jdbc:sqlite:CV_Database.db";
    private static Connection connection;

    private static final String CREATE_TABLE_SQL =
            "CREATE TABLE IF NOT EXISTS sample_nodes (" +
                    "id INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT," +
                    "json_data TEXT NOT NULL" +
                    ");";

    public static void initDatabase() throws SQLException {
        try {
            if(connection == null || connection.isClosed()) {
                connection = DriverManager.getConnection(DB_URL);
                createTable();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    private static void createTable() {
        try {
            PreparedStatement statement = connection.prepareStatement(CREATE_TABLE_SQL);
            statement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static List<CVNode> getAllSamples() throws SQLException {
        List<CVNode> result = new ArrayList<>();
        String sql = "SELECT * FROM sample_nodes ORDER BY id ASC";

        try (PreparedStatement statement = connection.prepareStatement(sql);
             ResultSet rs = statement.executeQuery()) {
            while (rs.next()) {
                int id = rs.getInt("id");
                String jsonData = rs.getString("json_data");
                JsonUtil obj=new JsonUtil(jsonData);
                String fullname = obj.getString("fullname");
                result.add(new CVNode(id, fullname, jsonData));
            }
        }
        return result;
    }

    public static void updateSample(CVNode node) throws SQLException {
        String json = JsonUtil.toJson(
                node.getFullName(),
                node.getFatherName(),
                node.getMotherName(),
                node.getEmail(),
                node.getAddress(),
                node.getContactNumber(),
                node.getDateofBirth(),
                node.getExam1(),
                node.getB1(),
                node.getFG1(),
                node.getGPA1(),
                node.getY1(),
                node.getExam2(),
                node.getB2(),
                node.getG2(),
                node.getGPA2(),
                node.getY2(),
                node.getExam3(),
                node.getU1(),
                node.getD1(),
                node.getCGPA1(),
                node.getY3(),
                node.getExam4(),
                node.getU2(),
                node.getD2(),
                node.getCGPA2(),
                node.getY4()

                );
        String sql = "UPDATE sample_nodes SET json_data = ? WHERE id = ?";

        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, json);
            statement.setInt(2, node.getId());
            statement.executeUpdate();
        }
    }

    public static void deleteSample(int id) {
    }
}
