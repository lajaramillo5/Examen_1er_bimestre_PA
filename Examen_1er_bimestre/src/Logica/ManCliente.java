/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import clases.Cliente;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author lenovo
 */
public class ManCliente {
     public Cliente CrearCliente(String cedula, String nombres, String apellido) {
        Cliente ObjetCliente = new Cliente(cedula, nombres, apellido);
        return ObjetCliente;
    }
    
    public Cliente BuscarCliente(ArrayList<Cliente> ArrayClientes1, String Cedula) {
        // LOS PARAMETROS SON EL ARRAY CON LOS CLIENTES Y UNA CEDULA PARA BUSCAR EL CLIENTE
        Cliente objAux = new Cliente();
        for (Cliente ObjetCli : ArrayClientes1) {// RECORRER EL ARRAYLIST
            String strCe = ObjetCli.getCedula().trim();
            if (strCe.equals(Cedula.trim())) //PREGUNTAR POR CADA OBJETO
            {
                objAux = ObjetCli;
            }
        }
        return objAux; //RETORNARA UN objeto VACIO EN EL CASO DE NO EXISTIR
    }
    public static void GuardarClientes(ArrayList<Cliente> ArrayClientes) throws IOException{
        File f = new File("C:\\Users\\lenovo\\OneDrive\\universidad\\programacion avanzada\\Examen_1er_bimestre\\Document\\clientes.txt");
        FileWriter fw = new FileWriter(f);
        BufferedWriter bw = new BufferedWriter(fw);
        for (Cliente objCli : ArrayClientes){
            bw.write(objCli.getCedula()+",");
            bw.write(objCli.getNombre()+",");
            bw.write(objCli.getApellido()+"\n");
        }
        bw.close();
        fw.close();
    }
    public boolean ComprobarCliente(ArrayList<Cliente> ArrayClientes, String Cedula){
        boolean aux = false;
        for (Cliente objCli : ArrayClientes){
            String strCe = objCli.getCedula().trim();
            if (strCe.equals(Cedula.trim())){
                aux = true;
            }
        }
        return aux;
    }
}
