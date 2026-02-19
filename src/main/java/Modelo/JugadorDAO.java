/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.*;

/**
 *
 * @author 71T3
 */
public class JugadorDAO {

    public int obtenerMejorTiempoPersonal(String nombre) {

        String sql = "SELECT mejor_tiempo FROM jugadores WHERE nombre = ? AND nivel = 'EXPERTO'";

        try (Connection con = ConexionBD.conectar(); PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, nombre);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                return rs.getInt("mejor_tiempo");
            }

        } catch (SQLException e) {
            System.out.println("ERROR al traer mejor tPersonal"+e);
        }

        return -1;
    }

    public String obtenerMejorGlobal() {

        String sql = """
        SELECT nombre, mejor_tiempo 
        FROM jugadores 
        WHERE nivel = 'EXPERTO'
        ORDER BY mejor_tiempo ASC 
        LIMIT 1
    """;

        try (Connection con = ConexionBD.conectar(); PreparedStatement ps = con.prepareStatement(sql);
                ResultSet rs = ps.executeQuery()) {

            if (rs.next()) {
                return rs.getString("nombre") + " - " + Tiempo.formatearTiempo(rs.getInt("mejor_tiempo")) + " s";
            }

        } catch (SQLException e) {
            System.out.println("ERROR al traer mejor tGlobal"+e);
        }

        return "Sin récord";
    }

    public void guardarOActualizar(String nombre, int nuevoTiempo) {

        String select = "SELECT mejor_tiempo FROM jugadores WHERE nombre = ?";
        String insert = "INSERT INTO jugadores (nombre, nivel, mejor_tiempo) VALUES (?, 'EXPERTO', ?)";
        String update = "UPDATE jugadores SET mejor_tiempo = ? WHERE nombre = ?";

        try (Connection con = ConexionBD.conectar()) {

            PreparedStatement ps = con.prepareStatement(select);
            ps.setString(1, nombre);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                int tiempoActual = rs.getInt("mejor_tiempo");

                if (tiempoActual == 0 || nuevoTiempo < tiempoActual) {
                    PreparedStatement up = con.prepareStatement(update);
                    up.setInt(1, nuevoTiempo);
                    up.setString(2, nombre);
                    up.executeUpdate();
                }

            } else {
                PreparedStatement ins = con.prepareStatement(insert);
                ins.setString(1, nombre);
                ins.setInt(2, nuevoTiempo);
                ins.executeUpdate();
            }

        } catch (SQLException e) {
            System.out.println("ERROR al guardad/actualizar tiempos "+e);
        }
    }
}
