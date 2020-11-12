/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.retrofitaemet;

/**
 *
 * @author FPMananaA
 */
public class ClasePrincipal implements PeticionXML.ComunicacionPedirClima{
    public static void main(String[] args) {
        PeticionXML p=new PeticionXML(new ClasePrincipal());
        PeticionXML.pedirClimaAEMET();
    }
    public static void imprimirDatos(ClaseRaiz r)
    {
        System.out.println("DATOS: "+r);
    }

    @Override
    public void mostrarDatos(ClaseRaiz r) {
        System.out.println("DATOS: "+r);
    }
}
