/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany._empregado_gerente_e_desenvolvedor;

/**
 *
 * @author m.targa
 */
import java.util.Scanner;


public class App {

    public static void main(String[] args) {
        Scanner lt = new Scanner(System.in);
        
        Desenvolvedor[] dev = new Desenvolvedor[2];
        Gerente[] ger = new Gerente[2];
        
        boolean x = true;
        
        
        do{
            System.out.println("-------MENU-------");
            System.out.println("1 -Cadastrar Desenvolvedor\n2 - Cadastrar Gerente\n3 - visualizar Desenvolvedor\n4 - visualizar Gerente\n0 - Sair");
            
                int esc_menu = lt.nextInt();
                    switch(esc_menu){
                        case 1:
                            for(int i=0; i < dev.length ; i++){
                                dev[i] = new Desenvolvedor();
                                System.out.println("Informe o Nome: ");
                                    dev[i].setNome(lt.nextLine());
                                    lt.nextLine();
                                System.out.println("Informe o salario mensal R$: ");
                                    dev[i].setSalarioBase(lt.nextDouble());
                                System.out.println("Informe a quantidade de horas extras: ");
                                    dev[i].setExtra(lt.nextInt()); 
                                System.out.println("Deseja continuar cadastrando?\n 1 - sim\n 2 - nao");
                                int esco = lt.nextInt();
                                    if(esco == 2){
                                        break;
                                    }                                  
                            }
                            break;
                        case 2:
                            for(int i=0; i < ger.length ; i++){
                                ger[i] = new Gerente();
                                
                                System.out.println("Informe o Nome: ");                                    
                                    ger[i].setNome(lt.nextLine());
                                    lt.nextLine();
                                System.out.println("Informe o salario mensal R$: ");
                                    ger[i].setSalarioBase(lt.nextDouble());
                                System.out.println("Informe o valor do bonus fixo: ");
                                    ger[i].setBonus(lt.nextDouble()); 
                                System.out.println("Deseja continuar cadastrando?\n 1 - sim\n 2 - nao");
                                int esco = lt.nextInt();
                                    if(esco == 2){
                                        break;
                                    }                                  
                            }    
                            
                            break;
                        case 3:
                            for(int i=0; i < dev.length ; i++){
                                if(dev[i] != null){
                                   dev[i].calcularSalario(); 
                                }
                                
                            }
                            break;
                        case 4:
                            for(int i=0; i < ger.length ; i++){
                                if(ger[i] != null){
                                    ger[i].calcularSalario();
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
