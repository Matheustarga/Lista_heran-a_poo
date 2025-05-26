/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany._funcionario_professor_tecnico;

/**
 *
 * @author Matheus
 */
public class Tecnico extends Funcionario {
    protected String funcao;
                
    public String getFuncao(){
        return this.funcao;
    }
    
    public void setFuncao(String funcao){
        this.funcao = funcao;
    } 
    
    @Override
    public void exibirDados(){
        System.out.println("Nome: "+this.nome);
        System.out.println("Departamento: "+this.departamento);
        System.out.println("Funcao: "+this.funcao);
        System.out.println("-------------------------------------");
    }    
}
