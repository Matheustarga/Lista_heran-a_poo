/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany._produto_livro_e_eletronico;

/**
 *
 * @author m.targa
 */
public class Produto {
    protected  String nome;
    protected  double preco;
    
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public double getPreco(){
        return preco;
    }
    public void setPreco(double preco){
        this.preco = preco;
    }
    
    public void mostrarDetalhes(){
        System.out.println("Nome: "+this.nome);
        System.out.println("Preço R$- : "+this.preco);
        
    }   
}
