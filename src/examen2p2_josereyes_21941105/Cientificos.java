/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2p2_josereyes_21941105;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author josec
 */
public class Cientificos implements Serializable{
    String nombre;
    ArrayList<Planeta>planetas=new ArrayList();

    public Cientificos(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Planeta> getPlanetas() {
        return planetas;
    }

    public void setPlanetas(ArrayList<Planeta> planetas) {
        this.planetas = planetas;
    }

    @Override
    public String toString() {
        return  nombre;
    }
    
    

    
    
    
}
