/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany._pessoa_e_funcionario_aluno;

/**
 *
 * @author m.targa
 */
public class Funcionario extends Pessoa {
    protected double salario;
    
    public double getSalario(){
        return this.salario;
    }
    public void setSalario(double salario){
        this.salario = salario;
    }
    
    
    @Override
    public void mostrarDados(){
        System.out.println("Nome: "+this.nome);
        System.out.println("Idade: "+this.idade);
        System.out.println("Salario R$: "+this.salario);
    }
}
