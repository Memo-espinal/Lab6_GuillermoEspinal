
package lab6_guillermoespinal;


public class Minipekka  extends Cartas{

    public Minipekka() {
        // se ingresa el dano y los puntos de vida 
        
    }

    public Minipekka(/*String nombre,*/ int dano, int puntosvida/*, String objetivo, String velocidad, String tipo*/) {
        super.nombre="Minipekka";
        super.dano=dano;
        super.puntosvida=puntosvida;
        super.velocidad="Alta";
        super.objetivo="Terrestres";
        super.tipo="Especial";
        super.costo=4;
         super.carta=new Minipekka();
        
        //super(nombre, dano, puntosvida, objetivo, velocidad, tipo);
    }
    //Minipekka (Especial): Velocidad Alta yObjetivos Terrestres.Cuesta 4 de elixi

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

    @Override
    public String toString() {
        return "Minipekka{" + '}';
    }
    
    
    
}
