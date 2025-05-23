/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany._pessoa_e_funcionario_aluno;

/**
 *
 * @author m.targa
 */
public class Pessoa {
    protected  String nome;
    protected  int idade;
    
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public int getIdade(){
        return this.idade;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }
    
    public void mostrarDados(){
        System.out.println("Nome: "+this.nome);
        System.out.println("Idade: "+this.idade);
    }
    
}
