/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany._conta_contacorrente_e_contapoupanca;

/**
 *
 * @author Matheus
 */
public class Poupanca extends Conta {
    protected double rendMensal;
    
    
    public double getRendTaxa(){
        return this.rendMensal;
    }
    public void setRendTaxa(double rendMensal){
        this.rendMensal = rendMensal;
    } 
}
