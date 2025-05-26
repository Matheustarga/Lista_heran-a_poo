/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany._funcionario_professor_tecnico;

/**
 *
 * @author Matheus
 */
public class Professor extends Funcionario{
    protected String disciplina;
    
    
    public String getDisciplina(){
        return this.disciplina;
    }
    
    public void setDisciplina(String disciplina){
        this.disciplina = disciplina;
    }
    @Override
    public void exibirDados(){
        System.out.println("Nome: "+this.nome);
        System.out.println("Departamento: "+this.departamento);
        System.out.println("Disciplina: "+this.disciplina);
        System.out.println("-------------------------------------");
    }
    

    
}
