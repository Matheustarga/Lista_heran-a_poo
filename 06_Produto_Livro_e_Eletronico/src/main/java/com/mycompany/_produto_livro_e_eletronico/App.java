/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany._produto_livro_e_eletronico;

import java.util.Scanner;

/**
 *
 * @author m.targa
 */
public class App {

    public static void main(String[] args) {
        Scanner lt = new Scanner(System.in);
        
        Livro[] book = new Livro[2];
        Eletronico[] ger = new Eletronico[2];
        
        boolean x = true;
        
        
        do{
            System.out.println("-------MENU-------");
            System.out.println("1 -Cadastrar Livro\n2 - Cadastrar Eletronico\n3 - visualizar Livro\n4 - visualizar Eletronico\n0 - Sair");
            
                int esc_menu = lt.nextInt();
                    switch(esc_menu){
                        case 1:
                            for(int i=0; i < book.length ; i++){
                                book[i] = new Livro();
                                System.out.println("Informe o Titulo do livro: ");
                                    book[i].setNome(lt.nextLine());
                                    lt.nextLine();
                                System.out.println("Informe o Preco em R$: ");
                                    book[i].setPreco(lt.nextDouble());
                                System.out.println("Informe o nome do autor: ");
                                    book[i].setAutor(lt.nextLine());
                                    lt.nextLine();
                                System.out.println("Deseja continuar cadastrando?\n 1 - sim\n 2 - nao");
                                int esco = lt.nextInt();
                                    if(esco == 2){
                                        break;
                                    }                                  
                            }
                            break;
                        case 2:
                            for(int i=0; i < ger.length ; i++){
                                ger[i] = new Eletronico();
                                
                                System.out.println("Informe o Nome do produto: ");                                    
                                    ger[i].setNome(lt.nextLine());
                                    lt.nextLine();
                                System.out.println("Informe o Preco em R$: ");
                                    ger[i].setPreco(lt.nextDouble());
                                System.out.println("Informe a marca do produto: ");
                                    ger[i].setMarca(lt.nextLine());
                                    lt.nextLine();
                                System.out.println("Deseja continuar cadastrando?\n 1 - sim\n 2 - nao");
                                int esco = lt.nextInt();
                                    if(esco == 2){
                                        break;
                                    }                                  
                            }    
                            
                            break;
                        case 3:
                            for(int i=0; i < book.length ; i++){
                                if(book[i] != null){
                                   book[i].mostrarDetalhes(); 
                                }
                                
                            }
                            break;
                        case 4:
                            for(int i=0; i < ger.length ; i++){
                                if(ger[i] != null){
                                    ger[i].mostrarDetalhes();
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
