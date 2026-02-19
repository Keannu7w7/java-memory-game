/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import javax.swing.ImageIcon;

/**
 *
 * @author 71T3
 */
public class Tarjeta {
    private int id;
    private String nombre;
    private ImageIcon imagen;
    private boolean descubierta;
    private boolean encontrada;

    public Tarjeta() {
    }

    public Tarjeta(int id, ImageIcon imagen) {
        this.id = id;
        this.imagen = imagen;
        
    }
    
     public void voltear() {
        descubierta = true;
    }

    public void ocultar() {
        descubierta = false;
    }
    
    public boolean esParDe(Tarjeta otra) {
    return this.id == otra.id;
}

    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ImageIcon getImagen() {
        return imagen;
    }

    public void setImagen(ImageIcon imagen) {
        this.imagen = imagen;
    }

    public boolean isDescubierta() {
        return descubierta;
    }

    public void setDescubierta(boolean descubierta) {
        this.descubierta = descubierta;
    }

    public boolean isEncontrada() {
        return encontrada;
    }

    public void setEncontrada(boolean encontrada) {
        this.encontrada = encontrada;
    }
    
    
    
    
}
