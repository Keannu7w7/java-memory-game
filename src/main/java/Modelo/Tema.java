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
public class Tema {
    private int id;
    private String nombre;
    private ImageIcon img;

    public Tema() {
    }

    public Tema(int id, String nombre, ImageIcon img) {
        this.id = id;
        this.nombre = nombre;
        this.img = img;
    }

    public ImageIcon getImg() {
        return img;
    }

    public void setImg(ImageIcon img) {
        this.img = img;
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
    
    
}
