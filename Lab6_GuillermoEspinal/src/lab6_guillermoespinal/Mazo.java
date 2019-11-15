/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6_guillermoespinal;

import java.util.ArrayList;

/**
 *
 * @author admin
 */
public class Mazo {
    int coste;
    ArrayList <Cartas>cartas= new ArrayList();

    public Mazo() {
        //mate yooo
        //coste=cartas.get(coste);
    }

    public int getCoste() {
        return coste;
    }

    public void setCoste(int coste) {
        this.coste = coste;
    }

    public ArrayList<Cartas> getCarta() {
        return cartas;
    }

    public void setCartas(ArrayList<Cartas> carta) {
        this.cartas = carta;
    }
    //solo setiar una carta
    public void setCarta(Cartas carta){
        this.cartas.add(carta);
    }
   

    @Override
    public String toString() {
        return "Mazo{" + "coste=" + coste + ", carta=" + cartas + '}';
    }
    
    
}
