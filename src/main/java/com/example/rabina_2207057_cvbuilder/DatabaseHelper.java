package com.example.rabina_2207057_cvbuilder;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
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

    public static List<CVNode> getAllSamples() {
        return List.of();
    }

    public static void updateSample(CVNode node) {
    }

    public static void deleteSample(int id) {
    }
}
