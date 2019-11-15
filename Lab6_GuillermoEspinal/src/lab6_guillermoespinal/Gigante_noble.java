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
public class Gigante_noble extends Cartas {

    public Gigante_noble() {
    }

    public Gigante_noble(/*String nombre,*/ int dano, int puntosvida/*, String objetivo, String velocidad, String tipo*/) {
        super.nombre="Gigante noble";
        super.dano=dano;
        super.puntosvida=puntosvida;
        super.velocidad="Media";
        super.objetivo="Terrestres";
        super.tipo="Comun";
        super.costo=6;
         super.carta=new Gigante_noble();
       // super(nombre, dano, puntosvida, objetivo, velocidad, tipo);
    }
//   /Gigante Noble(Comun):Velocidad Media y Objetivos Terrestres.Cuesta 6 de Elixir.
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

    public Cartas getCarta() {
        return carta;
    }

    public void setCarta(Cartas carta) {
        this.carta = carta;
    }

    @Override
    public String toString() {
        return "Gigante_noble{" + '}';
    }
    
    
}
