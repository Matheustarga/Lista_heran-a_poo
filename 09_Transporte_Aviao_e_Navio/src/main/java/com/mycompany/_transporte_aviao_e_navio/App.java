/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany._transporte_aviao_e_navio;

import java.util.Scanner;

/**
 *
 * @author Matheus
 */
public class App {

    public static void main(String[] args) {
        Scanner lt = new Scanner(System.in);
        
        Aviao[] avi = new Aviao[2];
        Navio[] nav = new Navio[2];
        
        boolean x = true;
        
        
        do{
            System.out.println("-------MENU-------");
            System.out.println("1 - Cadastrar Aviao\n2 - Cadastrar Navio\n3 - visualizar Aviao\n4 - visualizar Navio\n0 - Sair");
            
                int esc_menu = lt.nextInt();
                    switch(esc_menu){
                        case 1:
                            for(int i=0; i < avi.length ; i++){
                                avi[i] = new Aviao();
                                System.out.println("Informe a capacidade do aviao: ");
                                    avi[i].setCapacidade(lt.nextDouble());
                                    lt.nextLine();
                                System.out.println("Informe a altura maxima do aviao, em metros: ");
                                    avi[i].setMaxAltitude(lt.nextDouble());
                                    lt.nextLine();
                                System.out.println("Deseja continuar cadastrando?\n 1 - sim\n 2 - nao");
                                int esco = lt.nextInt();
                                    if(esco == 2){
                                        break;
                                    }                                  
                            }
                            break;
                        case 2:
                            for(int i=0; i < nav.length ; i++){
                                nav[i] = new Navio();
                                
                                System.out.println("Informe a capacidade do Navio: ");                                    
                                    nav[i].setCapacidade(lt.nextDouble());
                                    lt.nextLine();
                                System.out.println("Informe a profundidade maxima do Navio, em metros: ");
                                    nav[i].setMaxProfundidade(lt.nextDouble());
                                    lt.nextLine();
                                System.out.println("Deseja continuar cadastrando?\n 1 - sim\n 2 - nao");
                                int esco = lt.nextInt();
                                    if(esco == 2){
                                        break;
                                    }                                  
                            }    
                            
                            break;
                        case 3:
                            for(int i=0; i < avi.length ; i++){
                                if(avi[i] != null){
                                   avi[i].mostrarInformacoes();
                                }
                                
                            }
                            break;
                        case 4:
                            for(int i=0; i < nav.length ; i++){
                                if(nav[i] != null){
                                    nav[i].mostrarInformacoes();
                                }                                                                
                            }                            
                            break;
                        case 0:
                            x = false;
                            break;
                            
                        
                    }
                                                            
        }while(x);
    }
}
