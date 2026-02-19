/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.proyectofinal;

import Controlador.Controlador;
import Modelo.ImgDAO;
import Modelo.Juego;
import Modelo.Jugador;
import Modelo.JugadorDAO;
import Modelo.Nivel;
import Modelo.TemasDAO;
import Modelo.Tiempo;
import Vista.Menu;
import Vista.PrimeraV;
import Vista.VJuego;
import java.io.File;
import javax.swing.JOptionPane;

/**
 *
 * @author 71T3
 */
public class ProyectoFinal {

    public static void main(String[] args) {
       
            try {
                Juego j = new Juego();
                Jugador ju = new Jugador();
                Nivel n = new Nivel();
                Tiempo t = new Tiempo();
                Menu m = new Menu();
                VJuego ventanaj = new VJuego();
                PrimeraV pv = new PrimeraV();
                ImgDAO idao = new ImgDAO();
                TemasDAO td = new TemasDAO();
                JugadorDAO jdao = new JugadorDAO();
                Controlador controlador = new Controlador(
                        idao, j, ju, n, td, t, m, ventanaj, jdao, pv
                );

                pv.setLocationRelativeTo(null);
                pv.setVisible(true);

            } catch (Exception ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(null,   "Error iniciando el sistema.\n"   + "Probablemente la base de datos no está conectada.", "Error", JOptionPane.ERROR_MESSAGE);
            }

        /*
        (Guardamos Imagenes de tarjetas )
         ImgDAO dao = new ImgDAO();

        dao.guardarImagenesDeCarpeta(
                5, // id temática (Animales)
                "C:/Users/71T3/Desktop/Tematicas/Iconos/MathiasPOLNITORICO"
        );
       
        
        (Guardamos Imagenes del Menu en MySQL)
        TemasDAO tDao = new TemasDAO();
        File img = new File("C:/Users/71T3/Desktop/Tematicas/querico.png");
        
        tDao.guardarTema("Secreto",img );
         */
    }
}
