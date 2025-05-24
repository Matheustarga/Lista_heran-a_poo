/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany._empregado_gerente_e_desenvolvedor;

/**
 *
 * @author m.targa
 */
public class Desenvolvedor extends Empregado {
    protected int horaExtra;
    
    
    public double getExtra(){
        return this.horaExtra;
    }
    public void setExtra(int extra){
        this.horaExtra = extra;
    }
    
    
    @Override
    public void calcularSalario(){
        
        double calc_sal = this.salarioBase + ((this.salarioBase/220)*1.5)*this.horaExtra;
        System.out.println("Salario total para Desenvolvedor: R$- " + calc_sal);
    }
    
    
}
