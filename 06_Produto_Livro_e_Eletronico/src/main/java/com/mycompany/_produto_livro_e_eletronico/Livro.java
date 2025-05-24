/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany._produto_livro_e_eletronico;

/**
 *
 * @author m.targa
 */
public class Livro extends Produto {
    protected String autor;
 
    public String getAutor(){
        return autor;
    }
    public void setAutor(String autor){
        this.autor = autor;
    }
    
    @Override
    public void mostrarDetalhes(){
        System.out.println("Nome: "+this.nome);
        System.out.println("Preço R$- : "+this.preco);
        System.out.println("Autor: "+this.autor);
        
    } 
    
}
