/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import clases.Cliente;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author lenovo
 */
public class Imp_Clie {
    public static ArrayList<Cliente> ImportarClientes(){   
        ArrayList<Cliente> ArrayClientes = new ArrayList<Cliente>();
        File f = new File("C:\\Users\\lenovo\\OneDrive\\universidad\\programacion avanzada\\Examen_1er_bimestre\\Document\\clientes.txt");        
        StringTokenizer st;
        Scanner entrada = null;
        String sCadena;
        try {
            entrada = new Scanner(f);
            while (entrada.hasNext()) {            
                sCadena = entrada.nextLine();
                st = new StringTokenizer(sCadena, ",");
                while (st.hasMoreTokens()){
                    Cliente objTmpCli = new Cliente(st.nextToken(),st.nextToken(),st.nextToken());
                    ArrayClientes.add(objTmpCli);
                }
            }                      
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } finally {
            entrada.close();
        }
        return ArrayClientes;
    }    
         
    public static void GuardaArchivoCliente(ArrayList<Cliente> ArrayClientes) throws FileNotFoundException, IOException{
        File f = new File("C:\\Users\\lenovo\\OneDrive\\universidad\\programacion avanzada\\Examen_1er_bimestre\\Document\\Clientes.txt");
        FileWriter fw = new FileWriter(f,false);
        BufferedWriter bw = new BufferedWriter(fw);
        for (Cliente objCli : ArrayClientes) { //RECORRER EL ARRAY LIST Y GRABAR POR CADA OBJETO
            bw.write(objCli.getCedula()+",");
            bw.write(objCli.getNombre()+",");
            bw.write(objCli.getApellido()+"\n");
        }
        bw.close();
        fw.close();
    }
}
