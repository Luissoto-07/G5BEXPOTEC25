package controlador;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conexion {
    
    public static void main(String[] args) {
        Connection conn = null; // Inicializamos la conexión en null
        try {
            String cadena = "jdbc:postgresql://aws-0-us-east-2.pooler.supabase.com:6543/postgres?user=postgres.jlsjnbcqyogtmfycjmqr&password=12345";
            conn = DriverManager.getConnection(cadena);
            System.out.println("Conectado a la base de datos");
        } catch (SQLException e) {
            System.out.println("Error al conectar a la base de datos: " + e.getMessage());
        } finally {
            // Cerrar la conexión si está abierta
            if (conn != null) {
                try {
                    conn.close();
                    System.out.println("Conexión cerrada");
                } catch (SQLException e) {
                    System.out.println("Error al cerrar la conexión: " + e.getMessage());
                }
            }
        }
    }
}
