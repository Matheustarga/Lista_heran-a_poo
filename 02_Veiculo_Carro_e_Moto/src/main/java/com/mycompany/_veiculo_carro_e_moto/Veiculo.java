/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany._veiculo_carro_e_moto;

/**
 *
 * @author m.targa
 */
public class Veiculo {
    protected  String marca;
    protected  String modelo;
    
    public String getModelo(){
        return modelo;
    }
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    
    public String getMarca(){
        return marca;
    }
    public void setMarca(String marca){
        this.marca = marca;
    }
    
    public void mostrarDados(){
        System.out.println("Marca: "+this.marca);
        System.out.println("Modelo: "+this.modelo);
    }
}
