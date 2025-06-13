package com.netflix.util.conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conexion {
    
    private static final String URL = "jdbc:mysql://localhost:3306/nProyect";
    private static final String USUARIO = "root";
    private static final String PASSWORD = "colin143";
    
    public static Connection getConnection() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(URL, USUARIO, PASSWORD);
        } catch (SQLException e) {
            System.out.println("Error de conexión: " + e.getMessage());
        }
        return conn;
    }
}
