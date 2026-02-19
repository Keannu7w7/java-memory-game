/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import javax.swing.Timer;




/**
 *
 * @author 71T3
 */
public class Tiempo  {
    private int segundosRestantes;
    private Timer timer;
    private Runnable alTerminar;
    private Runnable alActualizar;

    public Tiempo() {
    }
    

    public Tiempo(int segundos, Runnable alActualizar, Runnable alTerminar) {
        this.segundosRestantes = segundos;
        this.alActualizar = alActualizar;
        this.alTerminar = alTerminar;

        timer = new Timer(1000, e -> {
            segundosRestantes--;

            if (alActualizar != null) {
                alActualizar.run();
            }

            if (segundosRestantes <= 0) {
                detener();
                if (alTerminar != null) {
                    alTerminar.run();
                }
            }
        });
    }

    public void iniciar() {
        timer.start();
    }

    public void detener(){
    if(timer != null){
        timer.stop();
    }
}


    public int getSegundosRestantes() {
        return segundosRestantes;
    }

    public static String formatearTiempo(int totalSegundos) {

    int minutos = totalSegundos / 60;
    int segundos = totalSegundos % 60;

    return String.format("%02d:%02d", minutos, segundos);
}

    
    public String getTiempoFormateado() {
        int min = segundosRestantes / 60;
        int seg = segundosRestantes % 60;
        return String.format("%02d:%02d", min, seg);
    }
}



