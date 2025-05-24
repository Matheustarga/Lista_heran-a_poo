/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany._ingresso_ingressovip_e_ingressonormal;

/**
 *
 * @author Matheus
 */
public class Vip extends Ingesso {
    protected  double valorVip;
        
    public double getValorVip(){
        return valorVip;
    }
    public void setValorVip(double valorVip){
        this.valorVip = valorVip;
    }
    @Override
    public void imprimirValor(int quantidade){        
        System.out.println("O valor do Ingresso Vip é : R$"+(this.valorVip*quantidade));
    } 
}
