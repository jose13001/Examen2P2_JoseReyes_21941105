/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2p2_josereyes_21941105;

import java.util.Random;
import java.io.Serializable;
import javax.swing.JOptionPane;

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
         if(probabilidad(20)){
           String nuevoPlaneta=JOptionPane.showInputDialog(null,"Ponle nombre al nuevo planeta");
           int Peso=(this.peso+planeta2.peso)/2;
           int size=(this.tamano+planeta2.tamano)/2;
           int x=(this.X+planeta2.X)/2;
           int y=(this.Y+planeta2.Y)/2;
           return new Gaseoso(size,Peso,nuevoPlaneta,x,y);
       }
       return null;
    }


    
    
}
