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
                                                    poup[i].setRendTaxa(lt.nextInt());
                                                break;
                                        }
                                System.out.println("Deseja continuar cadastrando?\n 1 - sim\n 2 - nao");
                                int esco = lt.nextInt();
                                    if(esco == 2){
                                        break;
                                    }                                        
                            }
                            break;
                        case 2:
                            System.out.println("---LOGIN---");
                            System.out.println("Informe seu tipo de conta:\n1 - Conta corrente\n2 - Conta poupanca ");
                                int tpConta = lt.nextInt();
                            System.out.println("Informe o numero da conta que deseja acessar: ");  
                                int numConta = lt.nextInt();
                                    switch(tpConta){
                                        case 1:
                                            for(int i = 0; i < corr.length;i++){
                                                if(corr[i] != null){
                                                    if(corr[i].getNumeroConta()== numConta){
                                                        System.out.println("O saldo da conta é: R$ "+corr[i].getSaldo());
                                                        System.out.println("A taxa mensal da conta é: R$ "+corr[i].getTaxa());
                                                    }else{
                                                        System.out.println("Nenhuma conta corrente encontrada com esse numero.");
                                                    }                                                
                                                }
                                            }
                                            
                                            break;
                                        case 2:
                                            for(int i = 0; i < poup.length;i++){
                                                if(corr[i] != null){
                                                    if(poup[i].getNumeroConta()== numConta){
                                                        System.out.println("O saldo da conta é: R$ "+poup[i].getSaldo());
                                                        System.out.println("A taxa mensal da conta é: R$ "+poup[i].getRendTaxa());
                                                    }else{
                                                        System.out.println("Nenhuma conta corrente encontrada com esse numero.");
                                                    }
                                                }
                                            }
                                            break;                                            
                                    }                                                       
                            break;
                        case 3:                           
                            System.out.println("Informe seu tipo de conta:\n1 - Conta corrente\n2 - Conta poupanca ");
                                int tpConta2 = lt.nextInt();
                            System.out.println("Informe o numero da conta que deseja acessar: ");  
                                int numConta2 = lt.nextInt();
                                
                                    for(int i=0; i < corr.length ; i++){
                                        switch(tpConta2){
                                            case 1:
                                                if(corr[i] != null){
                                                    if(corr[i].getNumeroConta()== numConta2){
                                                        System.out.println("Informe o valor que deseja realizar o saque: ");
                                                            double saque = lt.nextDouble();
                                                                if(saque > corr[i].getSaldo()){
                                                                    System.out.println("Saldo Insulficiente, saldo atual da conta: R$ "+corr[i].getSaldo());
                                                                }else{                                                        
                                                                    corr[i].sacar(saque);
                                                                    System.out.println("Saque realiado com sucesso!\n");
                                                                }
                                                    }
                                                }
                                                break;
                                            case 2:
                                                if(poup[i] != null){
                                                    if(poup[i].getNumeroConta()== numConta2){
                                                        System.out.println("Informe o valor que deseja realizar o saque: ");
                                                            double saque = lt.nextDouble();
                                                                if(saque > poup[i].getSaldo()){
                                                                    System.out.println("Saldo Insulficiente, saldo atual da conta: R$ "+poup[i].getSaldo());
                                                                }else{                                                        
                                                                    poup[i].sacar(saque);
                                                                    System.out.println("Saque realiado com sucesso!\n");
                                                                }
                                                    }                                                
                                                }
                                                break;
                                        }

                                
                                    }
                            break;
                        case 4:
                            System.out.println("Informe seu tipo de conta:\n1 - Conta corrente\n2 - Conta poupanca ");
                                int tpConta3 = lt.nextInt();
                            System.out.println("Informe o numero da conta que deseja acessar: ");  
                                int numConta3 = lt.nextInt();
                                
                                    for(int i=0; i < corr.length ; i++){
                                        switch(tpConta3){
                                            case 1:
                                                if(corr[i] != null){
                                                    if(corr[i].getNumeroConta()== numConta3){
                                                        System.out.println("Informe o valor que deseja realizar o deposito: ");
                                                            double deposito = lt.nextDouble();
                                                               corr[i].depositar(deposito);
                                                    }else{
                                                        System.out.println("Conta corrente de numero: "+numConta3+" não existe");
                                                    }
                                                        
                                                }

                                                break;
                                            case 2:
                                                if(poup[i] !=null){
                                                    if(poup[i].getNumeroConta()== numConta3){
                                                        System.out.println("Informe o valor que deseja realizar o deposito: ");
                                                            double deposito = lt.nextDouble();
                                                                poup[i].depositar(deposito);
                                                    }                                                    
                                                }
                                                
                                                
                                                break;
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
