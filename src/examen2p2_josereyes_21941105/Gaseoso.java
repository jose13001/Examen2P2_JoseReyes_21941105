/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2p2_josereyes_21941105;

import java.util.Random;
import java.io.Serializable;

/**
 *
 * @author josec
 */
public class Gaseoso extends Planeta implements Serializable{
    Random r=new Random();

    public Gaseoso() {
    }

    public Gaseoso(int tamano, int peso, String nombre, int X, int Y) {
        super(tamano, peso, nombre, X, Y);
    }

    

    @Override
    public Planeta colision(Planeta planeta2) {
        
    }


    
    
}
