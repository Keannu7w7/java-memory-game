/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author 71T3
 */
public class Nivel {
    private String nombre;
    private int cantidadPares;
    private boolean tiempo;
    private int segundos;

    public Nivel() {
    }

    public Nivel(String nombre, int cantidadPares, boolean tiempo, int segundos) {
        this.nombre = nombre;
        this.cantidadPares = cantidadPares;
        this.tiempo = tiempo;
        this.segundos = segundos;
    }

    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidadPares() {
        return cantidadPares;
    }

    public void setCantidadPares(int cantidadPares) {
        this.cantidadPares = cantidadPares;
    }

    public boolean isTiempo() {
        return tiempo;
    }

    public void setTiempo(boolean tiempo) {
        this.tiempo = tiempo;
    }

    public int getSegundos() {
        return segundos;
    }

    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }
    
    
    
}
