package repeticaoEArrays;

import java.util.Scanner;

/* Um programa que leia xconjuntos de dois valores
 * o primeiro sendo o nome e o segundo a idade
 * (pare quando for digitado o valor 0)
 */

 public class NomeIdade {

    public static void main (String[] args) {
        
        Scanner scan = new Scanner(System.in);

        String nome;
        int idade;

        while (true) {

            System.out.println("Nome: ");
            nome = scan.next(); //para ler só utilizar o fluxo scaner e atribuir ao nome
            if (nome.equals("0")) break;
            System.out.println("Idade: ");
            idade = scan.nextInt();


        }

    }

 }