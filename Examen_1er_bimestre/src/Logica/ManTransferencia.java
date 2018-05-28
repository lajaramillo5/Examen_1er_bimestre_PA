/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import clases.Cajero;
import clases.Cliente;
import clases.Cuenta;
import clases.Transferencia;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author lenovo
 */
public class ManTransferencia {
     public Transferencia CrearTransaccion(Cliente cliente, Cajero cajero, Cuenta cuenta,ArrayList<Transferencia> ArrayTransacciones){ 
        int aux = ArrayTransacciones.size()+1;

        Transferencia objTra = new Transferencia (aux, cliente, cajero, cuenta);
        return objTra;
    }
    public static void GuardaTransaccion(ArrayList<Transferencia> ArrayTransacciones) throws FileNotFoundException, IOException{
        // SE DEBE MANTENER LA MISMA ESTRUCTURA DEL ARCHIVO DE ENTRADA PARA QUE FUNCIONE
        // LO DEBEN COMPLETAR UDS.
        File f = new File("C:\\Users\\lenovo\\OneDrive\\universidad\\programacion avanzada\\Examen_1er_bimestre\\Document\\transaccion.txt");
        FileWriter fw = new FileWriter(f,false);
        BufferedWriter bw = new BufferedWriter(fw);
        for (Transferencia objTra : ArrayTransacciones) { //RECORRER EL ARRAY LIST Y GRABAR POR CADA OBJETO
            bw.write(objTra.getId_transaccion()+",");
            bw.write(objTra.getCliente().getCedula()+",");
            bw.write(objTra.getCajero().getId_Cajero()+",");
            bw.write(objTra.getCuenta().getNumero()+"\n");
        }
        bw.close();
        fw.close();
    }
}
