/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany._transporte_aviao_e_navio;

/**
 *
 * @author Matheus
 */
public class Navio extends Transporte{
    protected double profundidadeMax;
    
    public double getMaxProfundidade(){
        return this.profundidadeMax;
    }
    
    public void setMaxProfundidade(double profundidade){
        this.profundidadeMax = profundidade;
    }
    
    @Override
    public void mostrarInformacoes(){
        System.out.println("Capacidade: "+this.capacidade+"\nAltura Max em metros: "+this.profundidadeMax);
    }  
}
