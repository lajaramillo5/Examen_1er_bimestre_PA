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
public class Cuenta {

    String Numero;
    int Opcion; //[1]cuenta ahorros 
               // [2]cuenta corriente
    double Saldo;
    Cliente Cliente;
    Transferencia Transferencia;

    public Cuenta() {
    }

    public Cuenta(String Numero, int Opcion, double Saldo, Cliente Cliente) {
        this.Numero = Numero;
        this.Opcion = Opcion;
        this.Saldo = Saldo;
        this.Cliente = Cliente;
    }
    

    public Cuenta(String Numero, int Opcion, double Saldo, Cliente Cliente, Transferencia Transferencia) {
        this.Numero = Numero;
        this.Opcion = Opcion;
        this.Saldo = Saldo;
        this.Cliente = Cliente;
        this.Transferencia = Transferencia;
    }

    public String getNumero() {
        return Numero;
    }

    public int getOpcion() {
        return Opcion;
    }

    public double getSaldo() {
        return Saldo;
    }

    public Cliente getCliente() {
        return Cliente;
    }

    public Transferencia getTransferencia() {
        return Transferencia;
    }

    public void setNumero(String Numero) {
        this.Numero = Numero;
    }

    public void setOpcion(int Opcion) {
        this.Opcion = Opcion;
    }

    public void setSaldo(double Saldo) {
        this.Saldo = Saldo;
    }

    public void setCliente(Cliente Cliente) {
        this.Cliente = Cliente;
    }

    public void setTransferencia(Transferencia Transferencia) {
        this.Transferencia = Transferencia;
    }

    @Override
    public String toString() {
        return "Cuenta{" + "Numero=" + Numero + ", Opcion=" + Opcion + ", Saldo=" + Saldo + ", Cliente=" + Cliente + ", Transferencia=" + Transferencia + '}';
    }
    
}
