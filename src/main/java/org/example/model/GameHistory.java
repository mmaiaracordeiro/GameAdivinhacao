package org.example.model;

import org.example.util.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class GameHistory {
    private int userId;
    private int attempts;
    private int hits;
    private int misses;

    // Getters and Setters

    public static void saveGameHistory(int userId, int attempts, int hits, int misses) {
        Connection conn = DBConnection.getConnection();
        try {
            String sql = "INSERT INTO GameHistory (user_id, attempts, hits, misses) VALUES (?, ?, ?, ?)";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, userId);
            stmt.setInt(2, attempts);
            stmt.setInt(3, hits);
            stmt.setInt(4, misses);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
