/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany._conta_contacorrente_e_contapoupanca;

/**
 *
 * @author Matheus
 */
public class Conta {
    protected int numeroConta;
    protected double saldo;
    
    public int getNumeroConta(){
        return this.numeroConta;
    }
    public void setNumeroConta(int numero){
        this.numeroConta = numero;
    }
    public double getSaldo(){
        return this.saldo;
    }
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }
    
    public void depositar(double valor){
        this.saldo += valor;
    }
    public void sacar(double valor){
        this.saldo -= valor;
    }    
    
    
}
