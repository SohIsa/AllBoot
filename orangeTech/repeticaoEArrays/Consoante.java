package repeticaoEArrays;

import java.util.Scanner;

/* Um programa que leia um vetor de 6 letras e 
 * diga quantas consoantes foram lidas e quais
 */

public class Consoante {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        String[] letras = new String[6];
        int quantidade = 0;
        int consoantes = 0;

        while (quantidade < letras.length) {
            System.out.println("letra:");
            String letra = scan.nextLine();
            
            if (!(letra.equalsIgnoreCase("a") || // ignorecase tanto faz maiuscula ou minuscula
            letra.equalsIgnoreCase("e") ||
            letra.equalsIgnoreCase("i") ||
            letra.equalsIgnoreCase("o") ||
            letra.equalsIgnoreCase("u")
            )) {
                letras[quantidade] = letra;
                consoantes++;
            }
            quantidade++;
        }

        for (String letra : letras) {  //tipo do elemento do array e do outro lado o array
            // System.out.print(letra + " "); sem o if abaixo imprimiria null onde n tem consoante
            if (letra != null){
                System.out.print(letra + " ");
            }
        }
        System.out.println(consoantes);
    }

}
