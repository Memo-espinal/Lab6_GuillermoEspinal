
package lab6_guillermoespinal;

import java.util.ArrayList;


public class Clan {
    //Clan: Tendránnombre, lista de miembros, fecha de creación, usuario lídery tipo (Bronce, Plata, Oro y Legendario).
    String nombre;
    ArrayList<Usuario> miembros = new ArrayList();
    Usuario lider;
    String tipo ;

    public Clan(String nombre, Usuario lider, String tipo) {
        this.nombre = nombre;
        this.lider = lider;
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Usuario> getMiembros() {
        return miembros;
    }

    public void setMiembros(ArrayList<Usuario> miembros) {
        this.miembros = miembros;
    }
    //agregadion de solo un miembro
    public void setMiembro(Usuario user) {
        this.miembros.add(user);
    }

    public Usuario getLider() {
        return lider;
    }

    public void setLider(Usuario lider) {
        this.lider = lider;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Clan{" + "\nnombre=" + nombre + ", \nmiembros=" + miembros + ", \nlider=" + lider + ", \ntipo=" + tipo + '}';
    }
    
}
