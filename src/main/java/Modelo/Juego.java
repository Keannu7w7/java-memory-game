/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.ArrayList;

/**
 *
 * @author 71T3
 */
public class Juego {

    private Nivel nivel;
    private Tema tematica;
    private ArrayList<Tarjeta> tarjetas;
    private int paresDesc;

    public boolean parEncontrado(Tarjeta t1, Tarjeta t2) {
        return t1.getId() == t2.getId();
    }

    public ArrayList<Tarjeta> getTarjetas() {
        return tarjetas;
    }

    public void setTarjetas(ArrayList<Tarjeta> tarjetas) {
        this.tarjetas = tarjetas;
    }

    public void incrementarPar() {
        paresDesc++;
    }

    public boolean juegoTerminado() {
        return paresDesc == nivel.getCantidadPares();
    }

    public Nivel getNivel() {
        return nivel;
    }

    public void setNivel(Nivel nivel) {
        this.nivel = nivel;
    }

    public Tema getTematica() {
        return tematica;
    }

    public void setTematica(Tema tematica) {
        this.tematica = tematica;
    }

    public int getParesDesc() {
        return paresDesc;
    }

    public void setParesDesc(int paresDesc) {
        this.paresDesc = paresDesc;
    }

}
