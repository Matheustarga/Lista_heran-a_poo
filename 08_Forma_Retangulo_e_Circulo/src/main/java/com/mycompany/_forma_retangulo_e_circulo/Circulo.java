/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany._forma_retangulo_e_circulo;

/**
 *
 * @author Matheus
 */
public class Circulo extends Forma {
    protected double raio;
    
    public double getRaio (){
        return this.raio;
    }
    public void setRaio (double raio){
        this.raio = raio;
    }
    @Override
    public void calcularArea(){
        double calculo = 3.14 * Math.pow(raio, 2);
        System.out.println("A area do circulo de raio = "+this.raio+" é igual a : "+calculo);
    }
    
    
    
}
