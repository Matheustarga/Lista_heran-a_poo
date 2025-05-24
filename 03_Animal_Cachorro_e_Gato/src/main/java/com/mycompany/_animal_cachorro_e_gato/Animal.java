/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany._animal_cachorro_e_gato;

/**
 *
 * @author m.targa
 */
public class Animal {
    protected  String nome;
    protected  int idade;
    
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public int getIdade(){
        return idade;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }
    
    public void fazerAcao(){
        System.out.println("Nome: "+this.nome);
        System.out.println("Idade: "+this.idade);        
    }
 
}
