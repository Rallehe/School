package se.yrgo.databaser;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class App {
    private static final Logger logger = Logger.getLogger(App.class.getName());

    public static void main(String[] args) {
        String userName = System.getenv("DB_USERNAME");
        String password = System.getenv("DB_PASSWORD");
        String host = System.getenv("DB_HOST");
        String url = String.format("jdbc:mysql://%s/dbHighscore", host);

        // We need to connect to the database ourselves using JDBC
        try (Connection conn = DriverManager.getConnection(url, userName, password)) {

            listData(conn);
            //removeAverage(conn);
            listData(conn);
            printTopScore(conn);
            // connected to the dbHighscore database
            logger.info("We are connected to the database");

        } catch (SQLException ex) {
            logger.log(Level.SEVERE, "Some lousy SQL went wrong.", ex);
        }
    }

    public static void listData(Connection conn) throws SQLException {
        final String query = "SELECT fldScore, fldName FROM tblHighscore";

        try (Statement stmt = conn.createStatement()) {
            ResultSet rs = stmt.executeQuery(query);

            while (rs.next()) {
                int score = rs.getInt("fldScore");
                String name = rs.getString("fldName");
                System.out.printf("%d %s%n", score, name);
            }
        }

    }

    public static void printTopScore(Connection conn) throws SQLException {
        final String query = "SELECT fldScore, fldName FROM tblHighscore ORDER BY fldScore DESC LIMIT 1";

        try (PreparedStatement stmt = conn.prepareStatement(query)) {
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                int score = rs.getInt("fldScore");
                String name = rs.getString("fldName");
                System.out.printf("%s has the highscore with a total of: %d%n", name, score);
            }
        }
    }

    public static void addHighscore(String name, int score, Connection conn) throws SQLException {
        final String query = "INSERT INTO tblHighscore (fldName, fldScore) VALUES (?, ?)";

        try (PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, name);
            stmt.setInt(2, score);
            stmt.executeUpdate();
        }
    }
/* 
    public static void removeAverage(Connection conn) {
        try {
            double averageScore = getAverageScore(conn);
            removeScoresBelow(averageScore, conn);

        } catch (SQLException ex) {
            logger.log(Level.WARNING, "Unable to remove from highscore", ex);
        }
    }

    public static double getAverageScore(Connection conn) throws SQLException {
        final String query = "SELECT AVG(fldScore) FROM tblHighscore;";

        try (PreparedStatement stmt = conn.prepareStatement(query)) {
            ResultSet result = stmt.executeQuery();
            if (result.next()) {
                return result.getDouble(1);
            }

            throw new IllegalStateException("No highscore in the database");
        }
    }

    public static void removeScoresBelow(double score, Connection conn) throws SQLException {
        final String query = "DELETE FROM tblHighscore WHERE fldScore < ?;";

        try (PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setDouble(1, score);
            stmt.executeUpdate();
        }
    }*/
}
