/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany._empregado_gerente_e_desenvolvedor;

/**
 *
 * @author m.targa
 */
public class Gerente extends Empregado {
    protected double bonus;
    
    public double getBonus(){
        return this.bonus;
    }
    public void setBonus(double bonus){
        this.bonus = bonus;
    }
    
    @Override
    public void calcularSalario(){
        double calc_sal = this.salarioBase+this.bonus;
        System.out.println("Salario total para Gerente: R$-" + calc_sal);
    } 
}
