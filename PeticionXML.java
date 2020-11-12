/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.retrofitaemet;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.simplexml.SimpleXmlConverterFactory;

/**
 *
 * @author FPMananaA
 */
public class PeticionXML {
    private static ComunicacionPedirClima clase_llamante;

    public PeticionXML(ComunicacionPedirClima clase_llamante) {
        this.clase_llamante = clase_llamante;
    }
    
    public static void pedirClimaAEMET()
    {
         String base="http://www.aemet.es/xml/municipios/";
        
    Retrofit retrofit = new Retrofit.Builder()
    .baseUrl(base).addConverterFactory(SimpleXmlConverterFactory.create())
    .build();
    ServicioPideClima servicio=retrofit.create(ServicioPideClima.class);
    Call<ClaseRaiz> llamada=servicio.pedirClima();
    llamada.enqueue(new Callback<ClaseRaiz>() {
             @Override
             public void onResponse(Call<ClaseRaiz> call, Response<ClaseRaiz> rspns) {
                 //Llamar a método que estará en la clase que me llamó.
                 //Quiero que PeticionXML me valga tal cual
                 //ClasePrincipal.imprimirDatos(rspns.body());
                 clase_llamante.mostrarDatos(rspns.body());
             }

             @Override
             public void onFailure(Call<ClaseRaiz> call, Throwable thrwbl) {
                 System.out.println("ERROR: "+thrwbl.getMessage());
             }
    });
    }
    public interface ComunicacionPedirClima{
        public void mostrarDatos(ClaseRaiz r);
    }
}
