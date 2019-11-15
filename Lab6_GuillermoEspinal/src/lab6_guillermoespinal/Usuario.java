
package lab6_guillermoespinal;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Date;


public class Usuario {
   String nombre;
   String apellido;
   String usuario;
   String contra;
   Date fecha;
   int edad;
   Color colorfav;
   ArrayList<Mazo> mazos = new ArrayList();

    public Usuario() {
    }

    public Usuario(String nombre, String apellido, String usuario, String contra, Date fecha, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.usuario = usuario;
        this.contra = contra;
        this.fecha = fecha;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public ArrayList<Mazo> getMazos() {
        return mazos;
    }

    public void setMazos(ArrayList<Mazo> mazos) {
        this.mazos = mazos;
    }

    @Override
    public String toString() {
        // ya vamos a ver aqui
        return "Usuario{" + "usuario=" + usuario + ", contra=" + contra + '}';
    }
   
}
