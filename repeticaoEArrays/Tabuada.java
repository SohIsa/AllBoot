package repeticaoEArrays;

import java.util.Scanner;

/* Desenvolva um gerador de tabuada, capaz de gerar a tabuada de qualquer número inteiro entre 1 e 10
 * o usuário deve informar de qual número ele quer ver a tabuada.
 */

public class Tabuada {
    
    public static void main (String[] args) {

        Scanner scan = new Scanner(System.in);
        int tabuada;
        int count = 0;

        System.out.println("tabuada de: ");
        tabuada = scan.nextInt();

        do {
            System.out.println(tabuada + " x " + count + " = " + (tabuada * count));
            count++;
        } while (count < 11);

        }
}
