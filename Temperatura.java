/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.retrofitaemet;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

/**
 *
 * @author FPMananaA
 */
@Root(strict=false)
public class Temperatura {
    
    @Element
    private int minima;
    @Element
    private int maxima;

    public int getMinima() {
        return minima;
    }

    public void setMinima(int minima) {
        this.minima = minima;
    }

    public int getMaxima() {
        return maxima;
    }

    public void setMaxima(int maxima) {
        this.maxima = maxima;
    }

    @Override
    public String toString() {
        return "Temperatura{" + "minima=" + minima + ", maxima=" + maxima + '}';
    }
    
    
}
