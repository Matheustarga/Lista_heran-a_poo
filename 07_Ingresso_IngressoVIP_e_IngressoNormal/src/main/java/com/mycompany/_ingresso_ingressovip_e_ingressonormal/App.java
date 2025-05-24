/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany._ingresso_ingressovip_e_ingressonormal;

/**
 *
 * @author Matheus
 */
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner lt = new Scanner(System.in);
        
        Vip vp = new Vip();
        Normal nr = new Normal();
        
        boolean x = true;
        
        System.out.println("Informe o valor base do ingresso nesse evento: R$ ");             
            nr.setValorNormal(lt.nextDouble());
        System.out.println("Informe  o valor do ingresso vip R$ ");
            vp.setValorVip(lt.nextDouble());
            
        do{
            System.out.println("-------MENU-------");
            System.out.println("1 - Comprar ingresso normal\n2 - Comprar ingresso VIP\n0 - Sair");
                int menu = lt.nextInt();
                    switch(menu){
                        case 1:
                            System.out.println("Informe a quantidade de ingressos normais: ");
                                int qtd = lt.nextInt();
                                lt.nextLine();
                                nr.imprimirValor(qtd);                    
                                break;
                        case 2 :
                            System.out.println("Informe a quantidade de ingressos VIP: ");
                                int qtd2 = lt.nextInt();
                                lt.nextLine();
                                vp.imprimirValor(qtd2);
                                break;
                        case 0 :
                            System.out.println("Saindo....");
                            x = false;
                            break;
                    }

            
        }while(x);
            
        
        
        
    }
}
