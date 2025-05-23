/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany._veiculo_carro_e_moto;

/**
 *
 * @author m.targa
 */
public class Moto extends Veiculo {
    protected int cilindradas;
    
    public int getCilindradas(){
        return this.cilindradas;
    }
    
    public void setCilindradas(int cilindradas){
        this.cilindradas = cilindradas;
    }
    
    
    @Override
    public void mostrarDados(){
        System.out.println("Marca: "+this.marca);
        System.out.println("Modelo: "+this.modelo);
        System.out.println("Total de cilindradas: "+this.cilindradas);
    }    
}
