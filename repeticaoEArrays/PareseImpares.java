package repeticaoEArrays;

import java.util.ArrayList;
import java.util.Scanner;

/* Um programa que peça N números inteiros
 * calcule e mostre a quantidade de números pares 
 * e a quantidade de números impares
 */

public class PareseImpares {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList pares = new ArrayList<>();
        ArrayList impares = new ArrayList<>();
        int quantidade;
        int valor;
        int par = 0;
        int impar = 0;

        System.out.println("quantos números você quer verificar? ");
        quantidade = scan.nextInt();
        for (int i = 0; i < quantidade; i++) {
            System.out.println("informe números inteiros: ");
            valor = scan.nextInt();
            if (valor % 2 == 0) {
                par+=1; pares.add(valor);
            } else {
                impar+=1; impares.add(valor);
            }
        }
        
        System.out.println("Pares: " + par + " que são " + pares + " Impares: " + impar + " que são " + impares);

    }
}
