package dev.woc.analytics.data;

import dev.woc.analytics.AnalyticsPlugin;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataManager {
    private static Connection connection;

    public static void connect(String dbUrl) {
        String connURI = "jdbc:sqlite:" + dbUrl;
        try {
            connection = DriverManager.getConnection(connURI);
            AnalyticsPlugin.INSTANCE.getLogger().info(String.format("Connect database at '%s'.", dbUrl));
        } catch (SQLException e) {
            AnalyticsPlugin.INSTANCE.getLogger().severe(String.format("Failed to connect database at '%s'.", dbUrl));
        }
    }

}
