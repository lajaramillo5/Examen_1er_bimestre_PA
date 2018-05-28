/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import clases.Cajero;
import java.util.ArrayList;

/**
 *
 * @author lenovo
 */
public class ManCajero {
      public Cajero CrearCajero(String cedula, String id_cajero, String nombre, String apellido){
        Cajero ObjetCajero = new Cajero(cedula, id_cajero, nombre, apellido);
        return ObjetCajero;
    }
        public Cajero BuscarCajero(ArrayList<Cajero> ArrayCajeros, String id_cajero) {
        // LOS PARAMETROS SON EL ARRAY CON LOS CLIENTES Y UNA CEDULA PARA BUSCAR EL CLIENTE
        Cajero objAux = new Cajero();
        for (Cajero ObjetoCaj : ArrayCajeros) {// RECORRER EL ARRAYLIST
            String strCe = ObjetoCaj.getId_Cajero().trim();
            if (strCe.equals(id_cajero.trim())) //PREGUNTAR POR CADA OBJETO
            {
                objAux = ObjetoCaj;
            }
        }
        return objAux; //RETORNARA UN objeto VACIO EN EL CASO DE NO EXISTIR
    }
}
