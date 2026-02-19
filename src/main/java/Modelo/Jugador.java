/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author 71T3
 */
public class Jugador {

    private String nombre;
    private int mejorTiempo;

    public Jugador() {
    }
    

    public Jugador(String nombre, int mejorTiempo) {
        this.nombre = nombre;
        this.mejorTiempo = mejorTiempo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getMejorTiempo() {
        return mejorTiempo;
    }

    public void setMejorTiempo(int mejorTiempo) {
        this.mejorTiempo = mejorTiempo;
    }

  

   
}
