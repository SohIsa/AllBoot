package poo.collections.Map;

import java.util.ArrayList;
import java.util.Random;

/* Faça um programa que simule um lançamento de dados.
Lance o dado 100 vezes e armazene.
Depois, mostre quantas vezes cada valor foi inserido. */

public class LancaDados {
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Integer> dados = new ArrayList<>();
        int um = 0;
        int dois = 0;
        int tres = 0;
        int quatro = 0;
        int cinco = 0;
        int seis = 0;

        for (int i = 0; i < 100; i++) {
            int dado = random.nextInt(6) + 1;
            dados.add(i, dado);
            switch (dado) {
                case 1:
                    um++;
                    break;
                case 2:
                    dois++;
                    break;
                case 3:
                    tres++;
                    break;
                case 4:
                    quatro++;
                    break;
                case 5:
                    cinco++;
                    break;
                case 6:
                    seis++;
                    break;
                default:
                    break;
            } 
        }
        System.out.println(dados);
        System.out.println("1: " + um);
        System.out.println("2: " + dois);
        System.out.println("3: " + tres);
        System.out.println("4: " + quatro);
        System.out.println("5: " + cinco);
        System.out.println("6: " + seis);
    } 
}
