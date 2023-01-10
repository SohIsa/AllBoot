package repeticaoEArrays;

import java.util.Scanner;

/* Um programa que leia 5 números
 * informe o núemro maior
 * e a média
 */

public class MaioreMedia {
    
    public static void main (String[] args) {

        Scanner scan = new Scanner(System.in);

        int valor1;
        int valor2;
        int valor3;
        int valor4;
        int valor5;

        System.out.println("Digite o primeiro valor:");
        valor1 = scan.nextInt();
        System.out.println("Digite o segundo valor:");
        valor2 = scan.nextInt();
        System.out.println("Digite o terceiro valor:");
        valor3 = scan.nextInt();
        System.out.println("Digite o quarto valor:");
        valor4 = scan.nextInt();
        System.out.println("Digite o quinto valor:");
        valor5 = scan.nextInt();

        if (valor1 > valor2 && valor1 > valor3 && valor1 > valor4 && valor1 > valor5) {
            System.out.println("o maior valor é " + valor1);
        } else if (valor2 > valor1 && valor2 > valor3 && valor2 > valor4 && valor2 > valor5) {
            System.out.println("o maior valor é " + valor2);
        } else if (valor3 > valor1 && valor3 > valor2 && valor3 > valor4 && valor3 > valor5) {
            System.out.println("o maior valor é " + valor3);
        } else if (valor4 > valor1 && valor4 > valor2 && valor4 > valor3 && valor4 > valor5) {
            System.out.println("o maior valor é " + valor4);
        } else {
            System.out.println("o maior valor é " + valor5);
        }
        System.out.print("a média dos valores é " + (valor1+valor2+valor3+valor4+valor5)/5);

    }

}
