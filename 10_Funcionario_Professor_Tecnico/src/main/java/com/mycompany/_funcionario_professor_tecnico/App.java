/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany._funcionario_professor_tecnico;

import java.util.Scanner;

/**
 *
 * @author Matheus
 */
public class App {

    public static void main(String[] args) {
        Scanner lt = new Scanner(System.in);
        
        Professor[] prof = new Professor[2];
        Tecnico[] tec = new Tecnico[2];
        
        boolean x = true;
        
        
        do{
            System.out.println("-------MENU-------");
            System.out.println("1 -Cadastrar Professor\n2 - Cadastrar Tecnico\n3 - visualizar cadastro de Professores\n4 - visualizar cadastro de Tecnicos\n0 - Sair");
            
                int esc_menu = lt.nextInt();
                    switch(esc_menu){
                        case 1:
                            for(int i=0; i < prof.length ; i++){
                                prof[i] = new Professor();
                                lt.nextLine();
                                System.out.println("Informe o Nome do professor: ");
                                    prof[i].setNome(lt.nextLine());
                                   
                                System.out.println("Informe o Departamento: ");
                                    prof[i].setDepartamento(lt.nextLine());
                                System.out.println("Informe a disciplina ministrada: ");
                                    prof[i].setDisciplina(lt.nextLine());
                                    
                                System.out.println("Deseja continuar cadastrando?\n 1 - sim\n 2 - nao");
                                int esco = lt.nextInt();
                                    if(esco == 2){
                                        break;
                                    }                                  
                            }
                            break;
                        case 2:
                            for(int i=0; i < tec.length ; i++){
                                tec[i] = new Tecnico();
                                    lt.nextLine();
                                System.out.println("Informe o Nome do tecnico: ");                                    
                                    tec[i].setNome(lt.nextLine());
                                    
                                System.out.println("Informe o Departamento: ");
                                    tec[i].setDepartamento(lt.nextLine());
                                System.out.println("Informe a Funcao do tecnico: ");
                                    tec[i].setFuncao(lt.nextLine());
                                    
                                System.out.println("Deseja continuar cadastrando?\n 1 - sim\n 2 - nao");
                                int esco = lt.nextInt();
                                    if(esco == 2){
                                        break;
                                    }                                  
                            }    
                            
                            break;
                        case 3:
                            for(int i=0; i < prof.length ; i++){
                                if(prof[i] != null){
                                   prof[i].exibirDados();
                                }
                                
                            }
                            break;
                        case 4:
                            for(int i=0; i < tec.length ; i++){
                                if(tec[i] != null){
                                    tec[i].exibirDados();
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
