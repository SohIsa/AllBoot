package repeticaoEArrays;

import java.util.Scanner;

public class Fatorial {
    
    public static void main (String[] args) {
       
        Scanner scan = new Scanner(System.in);
        int fatorial;
        int mult = 1;

        System.out.println("Fatorial de que número:");
        fatorial = scan.nextInt();

        for (int i = fatorial; i >= 1; i--) {
            mult *= i;
        }
        System.out.println("o fatorial de " + fatorial + "! é " + mult);

    }

}
