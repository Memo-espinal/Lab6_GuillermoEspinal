/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6_guillermoespinal;

/**
 *
 * @author admin
 */
public class Montapuerco extends Cartas{

    public Montapuerco() {
    }
    
    //Montapuerco (Especial):Velocidad Alta y Objetivos Terrestres.Cuesta 4 de Elixir.

    public Montapuerco(/*String nombre,*/ int dano, int puntosvida/*, String objetivo, String velocidad, String tipo*/) {
         super.nombre="Montapuerco";
        super.dano=dano;
        super.puntosvida=puntosvida;
        super.velocidad="Alta";
        super.objetivo="Terrestres";
        super.tipo="Especial";
        super.costo=4;
         super.carta=new Montapuerco();
       // super(nombre, dano, puntosvida, objetivo, velocidad, tipo);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDano() {
        return dano;
    }

    public void setDano(int dano) {
        this.dano = dano;
    }

    public int getPuntosvida() {
        return puntosvida;
    }

    public void setPuntosvida(int puntosvida) {
        this.puntosvida = puntosvida;
    }

    public String getObjetivo() {
        return objetivo;
    }

    public void setObjetivo(String objetivo) {
        this.objetivo = objetivo;
    }

    public String getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(String velocidad) {
        this.velocidad = velocidad;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    @Override
    public String toString() {
        return "Montapuerco{" + super.nombre+'}';
    }
    
    
}
