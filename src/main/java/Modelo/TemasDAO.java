/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.io.File;
import java.io.FileInputStream;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.ImageIcon;

/**
 *
 * @author 71T3
 */
public class TemasDAO {

   public ArrayList<Tema> obtenerTemas() {
       
        ArrayList<Tema> lista = new ArrayList<>();

        String sql = "SELECT id, nombre, imagen FROM tematicas";

        try (Connection c = ConexionBD.conectar(); PreparedStatement ps = c.prepareStatement(sql);
                ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                int id = rs.getInt("id");
                String nombre = rs.getString("nombre");

                byte[] bytes = rs.getBytes("imagen");
                ImageIcon img = new ImageIcon(bytes);

                Tema t = new Tema(id, nombre, img);
                lista.add(t);
            }

        } catch (Exception e) {
            System.out.println("Error cargando temáticas");
        }

        return lista;
    }
    
    
    public void guardarTema(String nombre, File imagenTema) {

        String sql = """
        INSERT INTO tematicas (nombre, imagen)
        VALUES (?, ?)
    """;

        try ( Connection con = ConexionBD.conectar(); PreparedStatement ps = con.prepareStatement(sql); FileInputStream fis = new FileInputStream(imagenTema)) {

            ps.setString(1, nombre);
            ps.setBinaryStream(2, fis, (int) imagenTema.length());

            ps.executeUpdate();
            System.out.println("Tema guardado correctamente");

        } catch (Exception e) {
            System.out.println("Error al guardar tema"+e);
           
        }
    }
    
    public Tema obtenerTemaPorNombre(String nombreBuscado) {

    String sql = "SELECT id, nombre, imagen FROM tematicas WHERE LOWER(nombre) = LOWER(?)";

    try (
        Connection c = ConexionBD.conectar();
        PreparedStatement ps = c.prepareStatement(sql)
    ) {

        ps.setString(1, nombreBuscado);

        try (ResultSet rs = ps.executeQuery()) {

            if (rs.next()) {
                int id = rs.getInt("id");
                String nombre = rs.getString("nombre");

                byte[] bytes = rs.getBytes("imagen");
                ImageIcon img = new ImageIcon(bytes);

                return new Tema(id, nombre, img);
            }
        }

    } catch (Exception e) {
        System.out.println("Error obteniendo tema por nombre"+e);
       
    }

    return null;
}

}
