/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.retrofitaemet;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 *
 * @author FPMananaA
 */
public interface ServicioPideClima {
    @GET("localidad_28079.xml")
    Call<ClaseRaiz> pedirClima();
}
