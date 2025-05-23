/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany._pessoa_e_funcionario_aluno;

/**
 *
 * @author m.targa
 */
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner lt = new Scanner(System.in);
        
        Funcionario[] func = new Funcionario[2];
        Aluno[] aln = new Aluno[2];
        
        boolean x = true;
        
        
        do{
            System.out.println("-------MENU-------");
            System.out.println("1 -Cadastrar Funcionario\n2 - Cadastrar Alunos\n3 - visualizar funcionarios\n4 - visualizar alunos\n0 - Sair");
            
                int esc_menu = lt.nextInt();
                    switch(esc_menu){
                        case 1:
                            for(int i=0; i < func.length ; i++){
                                
                                func[i] = new Funcionario();
                                System.out.println("Informe o nome: ");
                                    lt.nextLine();
                                    func[i].setNome(lt.nextLine());                                    
                                System.out.println("Informe a Idade: ");
                                    func[i].setIdade(lt.nextInt());                                    
                                System.out.println("Informe o salario: ");
                                    func[i].setSalario(lt.nextDouble());                                                                        
                                System.out.println("Deseja continuar cadastrando?\n 1 - sim\n 2 - nao");                                
                                int escol = lt.nextInt();                                    
                                    if(escol == 2){
                                        break;
                                    }                                
                            }
                            break;
                        case 2:
                            for(int i=0; i < func.length ; i++){
                                aln[i] = new Aluno();                                
                                System.out.println("Informe o nome: ");                                    
                                    aln[i].setNome(lt.nextLine());
                                    lt.nextLine();
                                System.out.println("Informe a Idade: ");
                                    aln[i].setIdade(lt.nextInt());
                                System.out.println("Informe a nota: ");
                                    aln[i].setNota(lt.nextDouble());                                    
                            }
                            break;
                        case 3:
                            for(int i=0; i < func.length ; i++){
                                func[i].mostrarDados();
                            }
                            break;
                        case 4:
                            for(int i=0; i < aln.length ; i++){
                                aln[i].mostrarDados();                                 
                            }                            
                            break;
                        case 0:
                            x = false;
                            break;
                            
                        
                    }
                                                            
        }while(x);
        
        
    }
}
