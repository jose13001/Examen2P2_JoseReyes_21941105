/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2p2_josereyes_21941105;

import java.io.Serializable;
import java.util.Random;

/**
 *
 * @author josec
 */
public abstract class Planeta implements Serializable{
     int tamano;
     int peso;
    String nombre;
     int X;
     int Y;
     Random r=new Random();

    public Planeta() {
    }

    public Planeta(int tamano, int peso,String nombre, int X, int Y) {   
        this.tamano = tamano;
        this.peso = peso;
        this.nombre = nombre;
        this.X = X;
        this.Y = Y;
    }
    
    public boolean probabilidad(int porcentaje){
        int num=r.nextInt(100);
        return num<=porcentaje;
    }
    
    public abstract Planeta colision (Planeta planeta2);

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
