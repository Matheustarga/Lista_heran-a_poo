/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany._transporte_aviao_e_navio;

/**
 *
 * @author Matheus
 */
public class Transporte {
    protected double capacidade;
    
    public double getCapacidade(){
        return capacidade;
    }
    
    public void setCapacidade(double capacidade){
        this.capacidade = capacidade;
    }
    
    public void mostrarInformacoes(){
        System.out.println("Capacidade");
    }
    
}
