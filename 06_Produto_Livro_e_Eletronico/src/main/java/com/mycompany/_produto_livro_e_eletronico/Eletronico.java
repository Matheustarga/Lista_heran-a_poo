/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany._produto_livro_e_eletronico;

/**
 *
 * @author m.targa
 */
public class Eletronico extends Produto {
    protected String marca;
 
    public String getMarca(){
        return marca;
    }
    public void setMarca(String marca){
        this.marca = marca;
    }
    
    @Override
    public void mostrarDetalhes(){
        System.out.println("Nome: "+this.nome);
        System.out.println("Preço R$- : "+this.preco);
        System.out.println("Marca do produto: "+this.marca);
        
    } 
}
