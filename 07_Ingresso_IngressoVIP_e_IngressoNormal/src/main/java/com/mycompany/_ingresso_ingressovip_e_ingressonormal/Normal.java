/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany._ingresso_ingressovip_e_ingressonormal;

/**
 *
 * @author Matheus
 */
public class Normal extends Ingesso{
    protected  double valorN;
        
    public double getValorNormal(){
        return valorN;
    }
    public void setValorNormal(double valorNormal){
        this.valorN = valorNormal;
    }
    @Override
    public void imprimirValor(int quantidade){
        System.out.println("O valor do Ingresso Vip é : R$"+(this.valorN*quantidade));
    } 
}
