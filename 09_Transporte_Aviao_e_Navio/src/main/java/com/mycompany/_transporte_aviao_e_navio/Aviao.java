/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany._transporte_aviao_e_navio;

/**
 *
 * @author Matheus
 */
public class Aviao extends Transporte {
    protected double maxAltitude;
    
    public double getMaxAltitude(){
        return this.maxAltitude;
    }
    
    public void setMaxAltitude(double altitude){
        this.maxAltitude = altitude;
    }
    
    @Override
    public void mostrarInformacoes(){
        System.out.println("Capacidade: "+this.capacidade+"\nAltura Max em metros: "+this.maxAltitude);
    }
    
    
}
