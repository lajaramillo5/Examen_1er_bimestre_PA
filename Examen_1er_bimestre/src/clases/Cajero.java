/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author lenovo
 */
public class Cajero {
    String Cedula;
    String Id_Cajero;
    String Nombre;
    String Apellido;
    Transferencia Transferencias;

    public Cajero() {
    }

    public Cajero(String Cedula, String Id_Cajero, String Nombre, String Apellido) {
        this.Cedula = Cedula;
        this.Id_Cajero = Id_Cajero;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
    }
    

    public Cajero(String Cedula, String Id_Cajero, String Nombre, String Apellido, Transferencia Transferencias) {
        this.Cedula = Cedula;
        this.Id_Cajero = Id_Cajero;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Transferencias = Transferencias;
    }

    public String getCedula() {
        return Cedula;
    }

    public String getId_Cajero() {
        return Id_Cajero;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public Transferencia getTransferencias() {
        return Transferencias;
    }

    public void setCedula(String Cedula) {
        this.Cedula = Cedula;
    }

    public void setId_Cajero(String Id_Cajero) {
        this.Id_Cajero = Id_Cajero;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public void setTransferencias(Transferencia Transferencias) {
        this.Transferencias = Transferencias;
    }

    @Override
    public String toString() {
        return "Cajero{" + "Cedula=" + Cedula + ", Id_Cajero=" + Id_Cajero + ", Nombre=" + Nombre + ", Apellido=" + Apellido + ", Transferencias=" + Transferencias + '}';
    }
    

}
