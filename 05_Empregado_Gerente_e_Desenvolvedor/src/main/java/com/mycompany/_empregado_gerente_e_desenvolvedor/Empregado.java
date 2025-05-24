/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany._empregado_gerente_e_desenvolvedor;

/**
 *
 * @author m.targa
 */
public class Empregado {
    protected  String nome;
    protected  double salarioBase;
    
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public double getSalarioBase(){
        return salarioBase;
    }
    public void setSalarioBase(double salarioBase){
        this.salarioBase = salarioBase;
    }
    
    public void calcularSalario(){
        double calc_sal = this.salarioBase;        
    }
}
