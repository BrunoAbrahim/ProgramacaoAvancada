package com.unicesumar.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Database {
    private static final String DB_URL = "jdbc:sqlite:unicesumar.db";

    public static Connection getConnection() throws SQLException {
        Connection conn = DriverManager.getConnection(DB_URL);
        createTables(conn);
        return conn;
    }

    private static void createTables(Connection conn) {
        try (Statement stmt = conn.createStatement()) {
            // Criação da tabela de produtos
            String createProducts = "CREATE TABLE IF NOT EXISTS products (" +
                    "uuid TEXT PRIMARY KEY, " +
                    "name TEXT NOT NULL, " +
                    "price REAL NOT NULL)";
            stmt.execute(createProducts);

            // Criação da tabela de usuários
            String createUsers = "CREATE TABLE IF NOT EXISTS users (" +
                    "uuid TEXT PRIMARY KEY, " +
                    "name TEXT NOT NULL, " +
                    "email TEXT NOT NULL, " +
                    "password TEXT NOT NULL)";

            stmt.execute(createUsers);

        } catch (SQLException e) {
            throw new RuntimeException("Erro ao criar tabelas", e);
        }
    }
}
