
package lab6_guillermoespinal;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.tree.DefaultTreeModel;


public class Usuario {
   String nombre;
   String apellido;
   String usuario;
   String contra;
   Date fecha;
   int edad;
   Color colorfav;
   //ArrayList<Mazo> mazos = new ArrayList();
   Mazo mazo1= new Mazo();
   Mazo mazo2= new Mazo();
   Mazo mazo3= new Mazo();
   Clan clan ;
    DefaultTreeModel modelo ;

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

   /* public ArrayList<Mazo> getMazos() {
        return mazos;
    }

    public void setMazos(ArrayList<Mazo> mazos) {
        this.mazos = mazos;
    }*/

    public Color getColorfav() {
        return colorfav;
    }

    public void setColorfav(Color colorfav) {
        this.colorfav = colorfav;
    }

    public Mazo getMazo1() {
        return mazo1;
    }

    public void setMazo1(Mazo mazo1) {
        this.mazo1 = mazo1;
    }

    public Mazo getMazo2() {
        return mazo2;
    }

    public void setMazo2(Mazo mazo2) {
        this.mazo2 = mazo2;
    }

    public Mazo getMazo3() {
        return mazo3;
    }

    public void setMazo3(Mazo mazo3) {
        this.mazo3 = mazo3;
    }

    public Clan getClan() {
        return clan;
    }

    public void setClan(Clan clan) {
        this.clan = clan;
    }

    public DefaultTreeModel getModelo() {
        return modelo;
    }

    public void setModelo(DefaultTreeModel modelo) {
        this.modelo = modelo;
    }
    
    

    @Override
    public String toString() {
        // ya vamos a ver aqui
        return nombre;//"Usuario{" + "usuario=" + usuario + ", contra=" + contra + '}';
    }
   
}
