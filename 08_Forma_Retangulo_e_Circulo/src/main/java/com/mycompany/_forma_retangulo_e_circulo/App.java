/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany._forma_retangulo_e_circulo;

/**
 *
 * @author Matheus
 */
import java.math.*;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner lt = new Scanner(System.in);
        
        Retangulo ret = new Retangulo();
        Circulo cir = new Circulo();
        
        boolean x = true;
                    
        do{
            System.out.println("-------MENU-------");
            System.out.println("1 - Calcular area do retangulo\n2 - Calcular area do circulo\n0 - Sair");
                int menu = lt.nextInt();
                    switch(menu){
                        case 1:
                            System.out.println("Informe a altura do retangulo: ");
                                ret.setAltura(lt.nextDouble());
                                lt.nextLine();
                                System.out.println("Infome a medida da base do retangulo");
                                ret.setBase(lt.nextDouble());
                                ret.calcularArea();
                                break;
                        case 2 :
                            System.out.println("Informe o tamanho do raio do circulo: ");
                                cir.setRaio(lt.nextDouble());
                                lt.nextLine();
                                cir.calcularArea();
                                break;
                        case 0 :
                            System.out.println("Saindo....");
                            x = false;
                            break;
                    }

            
        }while(x);
        
    }
}
