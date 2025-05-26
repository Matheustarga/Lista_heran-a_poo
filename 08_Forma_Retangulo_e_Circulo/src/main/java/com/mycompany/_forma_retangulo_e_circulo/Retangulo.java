/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany._forma_retangulo_e_circulo;

/**
 *
 * @author Matheus
 */
public class Retangulo extends Forma{
    protected double base;
    protected double altura;
    
    public double getBase(){
        return this.base;
    }
    public void setBase(double base){
        this.base = base;
    }
    public double getAltura(){
        return this.altura;
    }
    public void setAltura(double altura){
        this.altura = altura;
    }
    
    @Override
    public void calcularArea(){
        double calculo = this.base * this.altura;
        System.out.println("A area do retangulo de base = "+this.base+" e altura igual = "+this.altura+" é igual a : "+calculo);
    }
    
    
}
