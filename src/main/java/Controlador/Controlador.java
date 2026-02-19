/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.ImgDAO;
import Modelo.Juego;
import Modelo.Jugador;
import Modelo.JugadorDAO;
import Modelo.Nivel;
import Modelo.Tarjeta;
import Modelo.Tema;
import Modelo.TemasDAO;
import Modelo.Tiempo;
import Vista.Menu;
import Vista.VJuego;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import Vista.PrimeraV;

/**
 *
 * @author 71T3
 */
public class Controlador implements ActionListener {

    private ImgDAO dao;
    private Juego juego;
    private Jugador player;
    private Nivel niv;
    private Tiempo tiempo;
    private Menu menu;
    private VJuego ventanaj;
    private TemasDAO tdao;
    private Tarjeta primera = null;
    private Tarjeta segunda = null;
    private JButton btnPrimero;
    private JButton btnSegundo;
    private JugadorDAO jdao;
    private PrimeraV priV;

    public Controlador(ImgDAO dao, Juego juego, Jugador player, Nivel niv, TemasDAO tdao, Tiempo tiempo, Menu menu, VJuego ventanaj, JugadorDAO jdao, PrimeraV priV) {
        this.dao = dao;
        this.juego = juego;
        this.player = player;
        this.niv = niv;
        this.tiempo = tiempo;
        this.menu = menu;
        this.ventanaj = ventanaj;
        this.tdao = tdao;
        this.jdao = jdao;
        this.priV = priV;

        this.menu.getOp1().addActionListener(this);
        this.menu.getOp2().addActionListener(this);
        this.menu.getOp3().addActionListener(this);
        this.menu.getOp4().addActionListener(this);
        this.menu.getOp5().addActionListener(this);
        this.menu.getOp6().addActionListener(this);
        this.menu.getOp7().addActionListener(this);
        this.menu.getOp8().addActionListener(this);
        this.ventanaj.getBack().addActionListener(this);
        this.ventanaj.getReset().addActionListener(this);
        this.priV.getContinuar().addActionListener(this);
        this.menu.getPlay().addActionListener(this);
        this.menu.getVolver().addActionListener(this);

        menu.ocultarTodo();

        ventanaj.setControlador(this);
        cargarImagenesMenu();

    }

    private void comprobarPar() {

        if (primera == null || segunda == null) {
            return;
        }

        Timer timer = new Timer(500, e -> {

            if (primera.esParDe(segunda)) {
                primera.setEncontrada(true);
                segunda.setEncontrada(true);
                verificarVictoria();
            } else {
                primera.ocultar();
                segunda.ocultar();
                btnPrimero.setIcon(new ImageIcon("C:/Users/71T3/Documents/NetBeansProjects/ProyectoFinal/reverso.png"));
                btnSegundo.setIcon(new ImageIcon("C:/Users/71T3/Documents/NetBeansProjects/ProyectoFinal/reverso.png"));
            }

            primera = null;
            segunda = null;
            btnPrimero = null;
            btnSegundo = null;

        });

        timer.setRepeats(false);
        timer.start();

    }

    private void verificarVictoria() {

        boolean gano = true;

        for (Tarjeta t : juego.getTarjetas()) {
            if (!t.isEncontrada()) {
                gano = false;
                break;
            }
        }

        if (gano) {
            if (niv.isTiempo()) {

                tiempo.detener();
                int tiempoUsado = niv.getSegundos() - tiempo.getSegundosRestantes();

                jdao.guardarOActualizar(player.getNombre(), tiempoUsado);

                int mejorPersonal = jdao.obtenerMejorTiempoPersonal(player.getNombre());
                String mejorGlobal = jdao.obtenerMejorGlobal();

                JOptionPane.showMessageDialog(ventanaj, "¡GANASTE EL NIVEL EXPERTO!\n\n" + "️ Tiempo actual: " + Tiempo.formatearTiempo(tiempoUsado) + " \n" + " Tu mejor récord: " + Tiempo.formatearTiempo(mejorPersonal) + " s\n\n" + "Récord global:\n" + mejorGlobal);
                ventanaj.dispose();
                priV.setVisible(true);
                menu.getButtonGroup1().clearSelection();
                priV.getNombre().setText("");
                priV.getCode().setText("");

            } else {
                JOptionPane.showMessageDialog(ventanaj, "¡Ganaste el nivel!");
                ventanaj.dispose();
                priV.setVisible(true);
                menu.getButtonGroup1().clearSelection();
                priV.getNombre().setText("");
                priV.getCode().setText("");

            }
        }
    }

    private void cargarImagenesMenu() {

        ArrayList<Tema> temas = tdao.obtenerTemas();

        for (int i = 0; i < temas.size(); i++) {
            Tema t = temas.get(i);

            Image imgt = t.getImg().getImage().getScaledInstance(205, 205, Image.SCALE_SMOOTH);

            ImageIcon icon = new ImageIcon(imgt);

            switch (t.getNombre().toLowerCase()) {

                case "animales":
                    menu.getAnimalitos().setIcon(icon);
                    break;

                case "pokemon":
                    menu.getPoke().setIcon(icon);
                    break;

                case "formula1":
                    menu.getFormula1().setIcon(icon);
                    break;

                case "dinosaurios":
                    menu.getDinos().setIcon(icon);
                    break;

                case "anime":
                    menu.getAnime().setIcon(icon);
                    break;
                case "secreto":
                    menu.getSecreto().setIcon(icon);
                    break;

                case "escudos":
                    menu.getFutbol().setIcon(icon);
                    break;

                case "paisaje":
                    menu.getPaisaje().setIcon(icon);
                    break;
            }
        }
    }

    private void iniciarJuego() {
        if (tiempo != null) {
            tiempo.detener();
        }
        ArrayList<Tarjeta> tarjetas = dao.obtenerPares(juego.getTematica().getId(), niv.getCantidadPares());

        System.out.println("Tarjetas recibidas: " + tarjetas.size());

        juego.setTarjetas(tarjetas);
        ventanaj.crearTablero(tarjetas);
        ventanaj.setVisible(true);

        menu.setVisible(false);
        if (niv.isTiempo()) {
            tiempo = new Tiempo(niv.getSegundos(), () -> ventanaj.actualizarTiempo(tiempo.getTiempoFormateado()), () -> {
                JOptionPane.showMessageDialog(ventanaj, " Tiempo agotado\n Has perdido el nivel EXPERTO");
                ventanaj.dispose();
                menu.setVisible(true);

            }
            );

            tiempo.iniciar();
        }

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource().equals(menu.getOp1())) {
            juego.setTematica(tdao.obtenerTemaPorNombre("Animales"));
        }

        if (e.getSource().equals(menu.getOp2())) {
            juego.setTematica(tdao.obtenerTemaPorNombre("Pokemon"));
        }

        if (e.getSource().equals(menu.getOp3())) {
            juego.setTematica(tdao.obtenerTemaPorNombre("Formula1"));
        }

        if (e.getSource().equals(menu.getOp4())) {
            juego.setTematica(tdao.obtenerTemaPorNombre("Dinosaurios"));
        }

        if (e.getSource().equals(menu.getOp5())) {
            juego.setTematica(tdao.obtenerTemaPorNombre("Secreto"));
        }
        if (e.getSource().equals(menu.getOp6())) {
            juego.setTematica(tdao.obtenerTemaPorNombre("Escudos"));
        }
        if (e.getSource().equals(menu.getOp7())) {
            juego.setTematica(tdao.obtenerTemaPorNombre("Anime"));
        }
        if (e.getSource().equals(menu.getOp8())) {
            juego.setTematica(tdao.obtenerTemaPorNombre("Paisaje"));
        }

        if (e.getSource().equals(priV.getContinuar())) {
            if (priV.getNombre().getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Porfavor debe de ingresar un nombre para poder jugar");
            } else {
                if (priV.getCode().getText().equals("NENAS")) {
                    JOptionPane.showMessageDialog(null, "HAS ENCONTRADO UN SECRETO");
                    priV.dispose();
                    priV.getRango().setSelectedItem("17++");
                    menu.setLocationRelativeTo(null);
                    menu.getSecreto().setVisible(true);
                    menu.getIop5().setVisible(true);
                    menu.getOp5().setVisible(true);
                    menu.crearTarjetas();
                    menu.setLocationRelativeTo(null);
                    menu.setVisible(true);
                }
                priV.dispose();
                menu.setLocationRelativeTo(null);

                if (priV.getRango().getSelectedItem().toString().equals("8-12")) {
                    menu.getPokemon().setVisible(true);
                    menu.getIop2().setVisible(true);
                    menu.getOp2().setVisible(true);

                    menu.getAnimalitos().setVisible(true);
                    menu.getIop1().setVisible(true);
                    menu.getOp1().setVisible(true);
                    menu.crearTarjetas();

                }

                if (priV.getRango().getSelectedItem().toString().equals("13-17")) {
                    menu.getDinos().setVisible(true);
                    menu.getIop4().setVisible(true);
                    menu.getOp4().setVisible(true);

                    menu.getFutbol().setVisible(true);
                    menu.getIop6().setVisible(true);
                    menu.getOp6().setVisible(true);
                    menu.crearTarjetas();

                }

                if (priV.getRango().getSelectedItem().toString().equals("17++")) {
                    menu.getAnime().setVisible(true);
                    menu.getIop7().setVisible(true);
                    menu.getOp7().setVisible(true);

                    menu.getPaisaje().setVisible(true);
                    menu.getIop8().setVisible(true);
                    menu.getOp8().setVisible(true);
                    menu.crearTarjetas();

                }
                menu.crearTarjetas();
                menu.setLocationRelativeTo(null);
                menu.setVisible(true);

            }
        }

        if (e.getSource().equals(menu.getPlay())) {
            if (menu.getButtonGroup1().getSelection() == null) {
                JOptionPane.showMessageDialog(null, "Porfavor Debe Seleccionar una Tematica");
            } else {
                menu.dispose();
                ventanaj.setLocationRelativeTo(null);
                ventanaj.getPlayer().setText(priV.getNombre().getText().toString());
                player.setNombre(priV.getNombre().getText().trim());

                int mejor = jdao.obtenerMejorTiempoPersonal(player.getNombre());

                if (mejor == -1) {
                    ventanaj.getBestTime().setText("Sin récord");
                } else {
                    ventanaj.getBestTime().setText(Tiempo.formatearTiempo(mejor));
                }

                ventanaj.getTema().setText(menu.getButtonGroup1().getSelection().getActionCommand());
                ventanaj.getLevel().setText(priV.getDificultad().getSelectedItem().toString());

                String dif = priV.getDificultad().getSelectedItem().toString();
                switch (dif) {
                    case "Facil":
                        ventanaj.getTime().setVisible(false);
                        ventanaj.getBestTime().setVisible(false);
                        ventanaj.getT().setVisible(false);
                        ventanaj.getBt().setVisible(false);
                        niv.setNombre("PRINCIPIANTE");
                        niv.setCantidadPares(6);
                        niv.setTiempo(false);
                        iniciarJuego();
                        break;
                    case "Medio":
                        ventanaj.getTime().setVisible(false);
                        ventanaj.getBestTime().setVisible(false);
                        ventanaj.getT().setVisible(false);
                        ventanaj.getBt().setVisible(false);
                        niv.setNombre("INTERMEDIO");
                        niv.setCantidadPares(12);
                        niv.setTiempo(false);
                        iniciarJuego();
                        break;
                    case "Experto":
                        ventanaj.getTime().setVisible(true);
                        ventanaj.getBestTime().setVisible(true);
                        ventanaj.getT().setVisible(true);
                        ventanaj.getBt().setVisible(true);
                        niv.setNombre("EXPERTO");
                        niv.setCantidadPares(18);
                        niv.setSegundos(300);
                        niv.setTiempo(true);
                        iniciarJuego();
                        break;
                    default:
                        break;
                }
            }
        }

        if (e.getSource() instanceof JButton && ((JButton) e.getSource()).getClientProperty("tarjeta") != null) {
            if (segunda != null) {
                return;
            }
            JButton btn = (JButton) e.getSource();
            Tarjeta t = (Tarjeta) btn.getClientProperty("tarjeta");

            if (t.isEncontrada() || t.isDescubierta()) {
                return;
            }

            btn.setIcon(t.getImagen());
            t.voltear();

            if (primera == null) {
                primera = t;
                btnPrimero = btn;
            } else {
                segunda = t;
                btnSegundo = btn;
                comprobarPar();
            }
        }

        if (e.getSource()
                .equals(ventanaj.getBack())) {
            System.out.println("ventna sii");
            ventanaj.dispose();
            priV.setVisible(true);
            menu.getButtonGroup1().clearSelection();
            priV.getNombre().setText("");
            priV.getCode().setText("");
            menu.ocultarTodo();
            juego.setTematica(null);

        }

        if (e.getSource()
                .equals(menu.getVolver())) {
            System.out.println("ventna sii");
            menu.dispose();
            priV.setVisible(true);
            menu.getButtonGroup1().clearSelection();
            priV.getNombre().setText("");
            priV.getCode().setText("");
            menu.ocultarTodo();
            juego.setTematica(null);

        }

        if (e.getSource().equals(ventanaj.getReset())) {
            iniciarJuego();
        }

    }

}
