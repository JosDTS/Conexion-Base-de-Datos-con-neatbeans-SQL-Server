/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pruebasql;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 * Clase principal PruebaSQL.
 * Contiene el método principal para ejecutar el programa.
 * @author Jocelyn
 */
public class PruebaSQL {

   /**
     * Método principal para ejecutar la aplicación.
     * 
     * @param args Argumentos de la línea de comandos.
     * @throws SQLException si ocurre un error en la consulta SQL.
     * @throws ClassNotFoundException si el driver de la base de datos no se encuentra.
     */
    
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        // TODO code application logic here
//        
//        try{
//            Statement sql =Conexion.getConexion().createStatement();
//            String consulta = "select * from personas;";
//            ResultSet resultado = sql.executeQuery(consulta);
//            while (resultado.next()){
//                System.out.println(resultado.getString(2));
//            }
//        }catch(SQLException ex){
//         JOptionPane.showMessageDialog(null, ex.toString());
//         }
          Conexion con = new Conexion ();
          
          // Obtener la lista de personas desde la base de datos
          ArrayList<Persona> personas = con.getPersonas();
          
          // Imprimir cada persona en la consola
          for (Persona persona : personas) {
            
            System.out.println(persona.toString());
        }
          
    }
    
    
    
}
