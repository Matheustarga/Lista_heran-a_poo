/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany._veiculo_carro_e_moto;

/**
 *
 * @author m.targa
 */
public class Carro extends Veiculo {
    protected int portas;
    
    public int getPortas(){
        return this.portas;
    }
    
    public void setPortas(int portas){
        this.portas = portas;
    }
    
    
    @Override
    public void mostrarDados(){
        System.out.println("Marca: "+this.marca);
        System.out.println("Modelo: "+this.modelo);
        System.out.println("Total de portas: "+this.portas);
    }    
}
