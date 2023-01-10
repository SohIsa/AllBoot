package repeticaoEArrays;

import java.util.Scanner;

/*Um programa que peça um nota entre 0 e 10
 * mostre uma mensagem de valor invalido e continue pedindo até vir um valor válido
 */

public class Nota {
    
    public static void main (String[] args) {

        Scanner scan = new Scanner(System.in);
        int nota;

        System.out.println("Digite uma nota: ");
        nota = scan.nextInt();

        while (nota < 0 || nota > 10) {
            System.out.println("nota invalida, digite uma entre 0 e 10:");
            nota = scan.nextInt();
            
        }

    }

}
