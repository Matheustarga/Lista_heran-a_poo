/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany._animal_cachorro_e_gato;

/**
 *
 * @author m.targa
 */
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner lt = new Scanner(System.in);
        
        Cachorro[] dog = new Cachorro[2];
        Gato[] cat = new Gato[2];
        
        boolean x = true;
        
        
        do{
            System.out.println("-------MENU-------");
            System.out.println("1 -Cadastrar Cachorro\n2 - Cadastrar Gato\n3 - visualizar Cachorro\n4 - visualizar Gato\n0 - Sair");
            
                int esc_menu = lt.nextInt();
                    switch(esc_menu){
                        case 1:
                            for(int i=0; i < dog.length ; i++){
                                dog[i] = new Cachorro();
                                System.out.println("Informe o Nome: ");
                                    dog[i].setNome(lt.nextLine());
                                    lt.nextLine();
                                System.out.println("Informe a Idade: ");
                                    dog[i].setIdade(lt.nextInt());
                                /*System.out.println("Informe a quantidade protas: ");
                                    dog[i].setPortas(lt.nextInt()); */
                                System.out.println("Deseja continuar cadastrando?\n 1 - sim\n 2 - nao");
                                int esco = lt.nextInt();
                                    if(esco == 2){
                                        break;
                                    }                                  
                            }
                            break;
                        case 2:
                            for(int i=0; i < cat.length ; i++){
                                cat[i] = new Gato();
                                
                                System.out.println("Informe o Nome: ");                                    
                                    cat[i].setNome(lt.nextLine());
                                    lt.nextLine();
                                System.out.println("Informe a Idade: ");
                                    cat[i].setIdade(lt.nextInt());
                                /*System.out.println("Informe as cilindradas: ");
                                    cat[i].setCilindradas(lt.nextInt()); */
                                System.out.println("Deseja continuar cadastrando?\n 1 - sim\n 2 - nao");
                                int esco = lt.nextInt();
                                    if(esco == 2){
                                        break;
                                    }                                  
                            }    
                            
                            break;
                        case 3:
                            for(int i=0; i < dog.length ; i++){
                                if(dog[i] != null){
                                   dog[i].fazerAcao(); 
                                }
                                
                            }
                            break;
                        case 4:
                            for(int i=0; i < cat.length ; i++){
                                if(dog[i] != null){
                                    cat[i].fazerAcao();
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
