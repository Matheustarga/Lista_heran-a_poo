/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany._ingresso_ingressovip_e_ingressonormal;

/**
 *
 * @author Matheus
 */
public class Ingesso {    
    protected  double valor;
        
    public double getValor(){
        return valor;
    }
    public void setValor(double valor){
        this.valor = valor;
    }
    public void imprimirValor(int quantidade){
        System.out.println("O valor do Ingresso é : R$"+(this.valor*quantidade));
    }
 
}
