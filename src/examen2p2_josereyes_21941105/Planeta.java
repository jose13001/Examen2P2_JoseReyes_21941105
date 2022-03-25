/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2p2_josereyes_21941105;

import java.io.Serializable;

/**
 *
 * @author josec
 */
public class Planeta implements Serializable{
    private String nombre;
    private int tamano;
    private int peso;
    private int X;
    private int Y;

    public Planeta() {
    }

    public Planeta(String nombre, int tamano, int peso, int X, int Y) {
        this.nombre = nombre;
        this.tamano = tamano;
        this.peso = peso;
        this.X = X;
        this.Y = Y;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTamano() {
        return tamano;
    }

    public void setTamano(int tamano) {
        this.tamano = tamano;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getX() {
        return X;
    }

    public void setX(int X) {
        this.X = X;
    }

    public int getY() {
        return Y;
    }

    public void setY(int Y) {
        this.Y = Y;
    }

    @Override
    public String toString() {
        return  nombre;
    }
    
    
}
