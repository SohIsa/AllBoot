package repeticaoEArrays;

import java.util.Random;

//Gere e imprima uma matriz 4x4 com valores aleatorios(o a 9)

public class Multidi {
    
    public static void main(String[] args) {
        
        Random random = new Random();
        int [] [] M = new int [4] [4]; // declaramos uma matriz me chocando ou apenas esquecida?

        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M[i].length; j++) {
                M[i][j] = random.nextInt(9);
            }
        }

        for (int[] linha : M) { // linha da matriz
            for (int coluna : linha) { //coluna da linha
                System.out.print(coluna + " ");
            }
            System.out.println(); //para pular a linha 
        }


    }

}
