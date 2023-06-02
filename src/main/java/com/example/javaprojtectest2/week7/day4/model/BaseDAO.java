package com.example.javaprojtectest2.week7.day4.model;

import java.sql.*;
import java.util.Map;

import static java.lang.System.getenv;

public class BaseDAO {
    protected Connection conn = null;
    protected Statement smt = null;
    protected PreparedStatement psmt = null;
    protected ResultSet rs = null;

    protected void getConn() throws ClassNotFoundException, SQLException {
        Map<String, String> env = getenv();
        String dbHost = env.get("DB_HOST");
        String dbUser = env.get("DB_USER");
        String dbPassword = env.get("DB_PASSWORD");

        Class.forName("com.mysql.cj.jdbc.Driver");

        try {
            conn = DriverManager.getConnection(
                    "jdbc:mysql://" + dbHost + "/likelion", dbUser, dbPassword
            );
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    protected void close() {
        try {
            if (rs != null) rs.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            if (smt != null) smt.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            if (psmt != null) psmt.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            if (conn != null) conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
