/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany._funcionario_professor_tecnico;

/**
 *
 * @author Matheus
 */
public class Funcionario {
    protected String nome;
    protected String departamento;
    
    public String getNome(){
        return this.nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
     public String getDepartamento(){
        return this.departamento;
    }
    
    public void setDepartamento(String departamento){
        this.departamento = departamento;
    }   

    public void exibirDados(){
        System.out.println("Nome: "+this.nome);
        System.out.println("Departamento: "+this.departamento);
    }
    
}
