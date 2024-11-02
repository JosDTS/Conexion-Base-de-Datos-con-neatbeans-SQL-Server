/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pruebasql;

import java.sql.Connection; 
import java.sql.DriverManager;
import java.sql.SQLException; 
import java.util.ArrayList;
import java.sql.PreparedStatement; 
import java.sql.ResultSet; 
import java.util.Date;
/**
 * @author Jocelyn
 */

/**
 * Clase Conexion.
 * Gestiona la conexión a una base de datos SQL Server y facilita la obtención de datos de la tabla "personas".
 */



public class Conexion {

     /**
     * Método estático para establecer y obtener la conexión a la base de datos.
     * 
     * @return Connection - una conexión a la base de datos, o null si no se puede conectar.
     */
    public static Connection getConexion() {
        
         // URL de conexión con parámetros de autenticación y configuraciones
        String conexionUrl = "jdbc:sqlserver://localhost:1433;"
                + "database=ConexionSQLNet;user=ConexionSQL;"
                + "password=1234Jbmz;loginTimeout=30;"
                + "trustServerCertificate=true";
       try {
            
             // Cargar el driver JDBC para SQL Server
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            // Establecer y retornar la conexión a la base de datos
            return DriverManager.getConnection(conexionUrl);
        } catch (ClassNotFoundException ex) {
            System.out.println("Error: Driver no encontrado");
            ex.printStackTrace();
            return null;
        } catch (SQLException ex) {
            System.out.println("Error: No se pudo establecer la conexión");
            ex.printStackTrace();
          return null; 
    }
    
}
    
     /**
     * Método para obtener una lista de objetos Persona desde la base de datos.
     * 
     * @return ArrayList<Persona> - una lista de objetos Persona obtenidos de la base de datos.
     * @throws SQLException - si ocurre un error en la consulta SQL.
     * @throws ClassNotFoundException - si el driver de la base de datos no se encuentra.
     */
    
    public ArrayList<Persona> getPersonas() throws SQLException, ClassNotFoundException {
          // Cargar el driver JDBC para SQL Server
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        ArrayList<Persona> personas = new ArrayList<>();
        // Consulta SQL para obtener los datos de la tabla "personas"
        
         String consulta = "select * from personas;";
        try (Connection con = getConexion();
                PreparedStatement cstmt = con.prepareStatement(consulta);
                ResultSet rs = cstmt.executeQuery()) {

            // Procesar los resultados de la consulta
            while (rs.next()) {
                int cedula = rs.getInt("cedula");
                String nombre = rs.getString("nombre");
                String apellido_1 = rs.getString("apellido_1"); 
                String apellido_2 = rs.getString("apellido_2"); 
                Date fecha_nacimiento = rs.getDate("fecha_Nacimiento");
                
                // Crear un nuevo objeto Persona y agregarlo a la lista

                Persona persona = new Persona(cedula, nombre, apellido_1, apellido_2, fecha_nacimiento);
                personas.add(persona);
            }
        } catch (SQLException ex) {
            System.out.println("Error al obtener provincias: " + ex.getMessage());
            throw ex;
        }
        return personas;
        }
}