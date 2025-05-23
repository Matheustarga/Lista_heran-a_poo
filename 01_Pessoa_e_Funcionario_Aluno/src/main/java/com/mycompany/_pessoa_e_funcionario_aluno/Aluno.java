/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany._pessoa_e_funcionario_aluno;

/**
 *
 * @author m.targa
 */
public class Aluno extends Pessoa {
    protected double nota;
    
    public double getNota(){
        return this.nota;
    }
    
    public void setNota(double nota){
        this.nota = nota;
    }
    
    
    @Override
    public void mostrarDados(){
        System.out.println("Nome: "+this.nome);
        System.out.println("Idade: "+this.idade);
        System.out.println("Nota: "+this.nota);
    }    
}
