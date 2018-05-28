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
public class Transferencia {
     int Id_transaccion;
    Cliente Cliente;
    Cajero Cajero;
    Cuenta Cuenta;

    public Transferencia() {
    }

    public Transferencia(int Id_transaccion, Cliente Cliente, Cajero Cajero, Cuenta Cuenta) {
        this.Id_transaccion = Id_transaccion;
        this.Cliente = Cliente;
        this.Cajero = Cajero;
        this.Cuenta = Cuenta;
    }

    public int getId_transaccion() {
        return Id_transaccion;
    }

    public Cliente getCliente() {
        return Cliente;
    }

    public Cajero getCajero() {
        return Cajero;
    }

    public Cuenta getCuenta() {
        return Cuenta;
    }

    public void setId_transaccion(int Id_transaccion) {
        this.Id_transaccion = Id_transaccion;
    }

    public void setCliente(Cliente Cliente) {
        this.Cliente = Cliente;
    }

    public void setCajero(Cajero Cajero) {
        this.Cajero = Cajero;
    }

    public void setCuenta(Cuenta Cuenta) {
        this.Cuenta = Cuenta;
    }

    @Override
    public String toString() {
        return "Transferencia{" + "Id_transaccion=" + Id_transaccion + ", Cliente=" + Cliente + ", Cajero=" + Cajero + ", Cuenta=" + Cuenta + '}';
    }
    
}
