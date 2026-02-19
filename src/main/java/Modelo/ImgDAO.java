/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.sql.*;
import java.util.Collections;
import javax.swing.ImageIcon;

/**
 *
 * @author 71T3
 */
public class ImgDAO {

    public ArrayList<Tarjeta> obtenerPares(int idTematica, int pares) {

        ArrayList<Tarjeta> lista = new ArrayList<>();

        String sql = """
            SELECT id, imagen
            FROM imagenes
            WHERE tematica_id = ?
            ORDER BY RAND()
            LIMIT ?
        """;

        try (Connection c = ConexionBD.conectar(); PreparedStatement ps = c.prepareStatement(sql)) {

            ps.setInt(1, idTematica);
            ps.setInt(2, pares);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("id");
                byte[] img = rs.getBytes("imagen");

                ImageIcon icon = new ImageIcon(img);

                lista.add(new Tarjeta(id, icon));
                lista.add(new Tarjeta(id, icon));
            }

            Collections.shuffle(lista);

        } catch (SQLException e) {
            System.out.println("NO se pudo TRAer o crear pares");
        }

        return lista;
    }

    

    public void guardarImagenesDeCarpeta(int idTematica, String rutaCarpeta) {

        File carpeta = new File(rutaCarpeta);
        File[] archivos = carpeta.listFiles();

        if (archivos == null) {
            System.out.println("La carpeta está vacía o no existe");
            return;
        }

        String sql = """
        INSERT INTO imagenes (tematica_id, nombre, imagen)
        VALUES (?, ?, ?)
    """;

        try (Connection con = ConexionBD.conectar(); PreparedStatement ps = con.prepareStatement(sql)) {

            for (File archivo : archivos) {

                if (!archivo.isFile()) {
                    continue;
                }

                try (FileInputStream fis = new FileInputStream(archivo)) {

                    ps.setInt(1, idTematica);
                    ps.setString(2, archivo.getName());
                    ps.setBinaryStream(3, fis, (int) archivo.length());
                    ps.executeUpdate();
                    
                    System.out.println("Guardada: " + archivo.getName());
                }
            }

        } catch (Exception e) {
            System.out.println("Error al guardar imágenes");

        }
    }

}
