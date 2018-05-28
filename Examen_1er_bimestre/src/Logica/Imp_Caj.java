/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import clases.Cajero;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author lenovo
 */
public class Imp_Caj {
    public static ArrayList<Cajero> ImportarCajeros(){   
        ArrayList<Cajero> ArrayCajeros = new ArrayList<Cajero>();
        File f = new File("C:\\Users\\lenovo\\OneDrive\\universidad\\programacion avanzada\\Examen_1er_bimestre\\Document\\cajeros.txt");        
        StringTokenizer st;
        Scanner entrada = null;
        String sCadena;
        try {
            entrada = new Scanner(f);
            while (entrada.hasNext()) {            
                sCadena = entrada.nextLine();
                st = new StringTokenizer(sCadena, ",");
                while (st.hasMoreTokens()){
                    Cajero objTmpCli = new Cajero(st.nextToken(),st.nextToken(),st.nextToken(),st.nextToken());
                    ArrayCajeros.add(objTmpCli);
                }
            }                      
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } finally {
            entrada.close();
        }
        return ArrayCajeros;
    }    
}
