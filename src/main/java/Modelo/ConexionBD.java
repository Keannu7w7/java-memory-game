/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;
import java.sql.*;

/**
 *
 * @author 71T3
 */
public class ConexionBD {
    
    
    private Connection Conexion;
    
    private static String url= "jdbc:mysql://localhost:3306/juego_memoria";
    private static String user ="root";
    private static String password="mysql2026matt";
    
   

    public static Connection conectar(){
        Connection con=null;
        
        try {
            con = DriverManager.getConnection(url, user, password);
            System.out.println("Coneccion exitosa");
        } catch (SQLException ex) {
            System.out.println("Error en la conexion local "+ ex);
            
        }
        return con;
    }
    

    
    
}
