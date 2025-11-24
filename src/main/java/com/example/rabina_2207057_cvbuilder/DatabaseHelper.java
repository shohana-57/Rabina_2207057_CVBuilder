package com.example.rabina_2207057_cvbuilder;

import java.sql.Connection;
import java.util.List;

public class DatabaseHelper {
    private static final String DB_URL = "jdbc:sqlite:sample.db";
    private static Connection connection;

    public static List<CVNode> getAllSamples() {
        return List.of();
    }

    public static void updateSample(CVNode node) {
    }

    public static void deleteSample(int id) {
    }
}
