/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package repeticaomenu;

import com.sun.source.tree.WhileLoopTree;
import java.util.Scanner;

/**
 *
 * @author operador
 */
public class RepeticaoMenu {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome;
        String email;
        String cpf;
        String dataNascimento;
        String cidade;
        String estado;
        int verifica = 0;

        do {
            System.out.println("Cadastro");
            System.out.println("1. Cadastro de Pessoa");
            System.out.println("2. Sair");

            verifica = sc.nextInt();

            //VERIFICAR QUAL OPÇÃO FOI ESCOLHIDA
            if (verifica == 1) {
                System.out.println("Digite um NOME:");
                nome = sc.nextLine();
                System.out.println("Digite um EMAIL:");
                email = sc.nextLine();
                System.out.println("Digite o CPF:");
                cpf = sc.nextLine();
                System.out.println("Digite a Data de Nascimento:");
                dataNascimento = sc.nextLine();
                System.out.println("Digite a Cidade:");
                cidade = sc.nextLine();
                System.out.println("Digite o Estado:");
                estado = sc.nextLine();
            } else if (verifica == 2) {
                System.exit(0); //encerra o sistema
            } else {
                System.out.println("Valor informado errado!");
            }
        }while(verifica != 1 || verifica != 2);
    }
    
}
