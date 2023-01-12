package repeticaoEArrays;

import java.util.Random;
import java.util.Scanner;

/* leia 20 números aleatorios (0 a 100) armazeneos em um vetor
 * ao final mostre os números e seus sucessores
 */

public class Aleatorios {
    public static void main(String[] args) {
        
        Random random = new Random();
        int[] numeros = new int[20];

        for (int i = 0; i < numeros.length; i++) {
            int numero = random.nextInt(100);   // gerar
            numeros[i] = numero;    //inserir
        }

        System.out.println("Aleatorios:");
        for (int numero : numeros) {
            System.out.print(numero + " ");
        }
        System.out.println("\nAleatorios + 1:");
        for (int numero : numeros) {
            System.out.print((numero+1) + " ");
        }

    }
}
