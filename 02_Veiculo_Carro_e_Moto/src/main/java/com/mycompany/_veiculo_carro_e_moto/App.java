/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany._veiculo_carro_e_moto;

/**
 *
 * @author m.targa
 */
import java.util.Scanner;


public class App {

    public static void main(String[] args) {
        Scanner lt = new Scanner(System.in);
        
        Carro[] car = new Carro[2];
        Moto[] mot = new Moto[2];
        
        boolean x = true;
        
        
        do{
            System.out.println("-------MENU-------");
            System.out.println("1 -Cadastrar Carros\n2 - Cadastrar Motos\n3 - visualizar Carros\n4 - visualizar Motos\n0 - Sair");
            
                int esc_menu = lt.nextInt();
                    switch(esc_menu){
                        case 1:
                            for(int i=0; i < car.length ; i++){
                                car[i] = new Carro();
                                System.out.println("Informe o Marca: ");
                                    car[i].setMarca(lt.nextLine());
                                    lt.nextLine();
                                System.out.println("Informe a Modelo: ");
                                    car[i].setModelo(lt.nextLine());
                                System.out.println("Informe a quantidade protas: ");
                                    car[i].setPortas(lt.nextInt());  
                                System.out.println("Deseja continuar cadastrando?\n 1 - sim\n 2 - nao");
                                int esco = lt.nextInt();
                                    if(esco == 2){
                                        break;
                                    }                                  
                            }
                            break;
                        case 2:
                            for(int i=0; i < mot.length ; i++){
                                mot[i] = new Moto();
                                
                                System.out.println("Informe o Marca: ");                                    
                                    mot[i].setMarca(lt.nextLine());
                                    lt.nextLine();
                                System.out.println("Informe a Modelo: ");
                                    mot[i].setModelo(lt.nextLine());
                                System.out.println("Informe as cilindradas: ");
                                    mot[i].setCilindradas(lt.nextInt()); 
                                System.out.println("Deseja continuar cadastrando?\n 1 - sim\n 2 - nao");
                                int esco = lt.nextInt();
                                    if(esco == 2){
                                        break;
                                    }                                  
                            }    
                            
                            break;
                        case 3:
                            for(int i=0; i < car.length ; i++){
                                car[i].mostrarDados();
                            }
                            break;
                        case 4:
                            for(int i=0; i < mot.length ; i++){
                                mot[i].mostrarDados(); 
                                
                            }                            
                            break;
                        case 0:
                            x = false;
                            break;
                            
                        
                    }
                                                            
        }while(x);
    }
}
