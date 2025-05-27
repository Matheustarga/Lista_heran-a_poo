/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany._conta_contacorrente_e_contapoupanca;

import java.util.Scanner;

/**
 *
 * @author Matheus
 */
public class App {

    public static void main(String[] args) {
        Scanner lt = new Scanner(System.in);
        
        Corrente[] corr = new Corrente[2];
        Poupanca[] poup = new Poupanca[2];
        
        boolean x = true;
                       
        do{
            System.out.println("-------MENU-------");
            System.out.println("1 -Cadastrar Conta\n2 - Mostrar Saldo\n3 - Sacar\n4 - Depositar\n0 - Sair");
            
                int esc_menu = lt.nextInt();
                    switch(esc_menu){
                        case 1:
                            for(int i=0; i < corr.length ; i++){
                                System.out.println("Informe o tipo de conta que deseja criar:\n1 - Conta Corrente\n 2 - Conta Poupanca");
                                    int submenu = lt.nextInt();
                                        switch(submenu){
                                            case 1 :
                                                corr[i] = new Corrente();
                                                System.out.println("Informe o número da conta: ");
                                                    corr[i].setNumeroConta(lt.nextInt()); 
                                                    lt.nextLine();
                                                System.out.println("Informe o Saldo inicial da conta: ");
                                                    corr[i].setSaldo(lt.nextDouble());
                                                System.out.println("Informe a taxa mensal de manutenção da conta: ");
                                                    corr[i].setTaxa(lt.nextInt());
                                                break;
                                            case 2 :
                                                poup[i] = new Poupanca();
                                                System.out.println("Informe o número da conta: ");
                                                    poup[i].setNumeroConta(lt.nextInt());
                                                System.out.println("Informe o Saldo inicial da conta: ");
                                                    poup[i].setSaldo(lt.nextDouble());
                                                System.out.println("Informe  rendimento mensal base da conta poupança em(%): ");
                                                    poup[i].setTaxa(lt.nextInt());
                                                break;
                                        }                                  
                            }
                            break;
                        case 2:
                            for(int i=0; i < poup.length ; i++){
                                
                                
                                System.out.println("Informe o número da conta: ");                                    
                                    poup[i].setNome(lt.nextLine());
                                    lt.nextLine();
                                System.out.println("Informe o Preco em R$: ");
                                    poup[i].setPreco(lt.nextDouble());
                                System.out.println("Informe a marca do produto: ");
                                    poup[i].setMarca(lt.nextLine());
                                    lt.nextLine();
                                System.out.println("Deseja continuar cadastrando?\n 1 - sim\n 2 - nao");
                                int esco = lt.nextInt();
                                    if(esco == 2){
                                        break;
                                    }                                  
                            }    
                            
                            break;
                        case 3:
                            for(int i=0; i < corr.length ; i++){
                                if(corr[i] != null){
                                   corr[i].mostrarDetalhes(); 
                                }
                                
                            }
                            break;
                        case 4:
                            for(int i=0; i < poup.length ; i++){
                                if(poup[i] != null){
                                    poup[i].mostrarDetalhes();
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
