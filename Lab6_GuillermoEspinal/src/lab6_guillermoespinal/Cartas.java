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
public class Cartas {
 //contendran Nombre, Daño, Puntos de Vida, Objetivo(Aereos, Terrestres o Aereos y Terrestres), 
    //Velocidad (Alta, Media y Baja)y Coste de Elixir. 
    //Pueden Comun, Especial, Epica y Legendaria.   
    String nombre;
    int dano;
    int puntosvida;
    String objetivo;
    String velocidad;
    String tipo;
    int costo;
    Cartas carta;//vamos a ver si lo ocupamos

    public Cartas() {
    }

    public Cartas(String nombre, int dano, int puntosvida, String objetivo, String velocidad, String tipo) {
        this.nombre = nombre;
        this.dano = dano;
        this.puntosvida = puntosvida;
        this.objetivo = objetivo;
        this.velocidad = velocidad;
        this.tipo = tipo;
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
        return "Cartas{" + "nombre=" + nombre + ", \ndano=" + dano + ", \npuntosvida=" + puntosvida + ", \nobjetivo=" + objetivo + ", \nvelocidad=" + velocidad + ", \ntipo=" + tipo + '}';
    }
    
}
