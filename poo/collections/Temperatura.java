package poo.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

class Temperatura {
    public static void main(String[] args) {

        /* Scanner scan = new Scanner(System.in);
        ArrayList<Double> temperatura = new ArrayList<>();
        Double temp;

        for (int i=1; i<7; i++) {
            System.out.println("temperatura " + i +":");
            temp = scan.nextDouble();
            temperatura.add(temp);
        }  */

        ArrayList<Double> temperatura = new ArrayList<>(Arrays.asList(23.3,40.3,35.4,15.4,21.4,33.3));
        Double soma = 0d;
        Double media = 0d;
        Iterator<Double> iterator = temperatura.iterator();

        while (iterator.hasNext()) {
            Double next = iterator.next();
            soma+=next;
            media = soma/temperatura.size();
        }
        System.out.println("A média da temperatura do semestre foi: " + media);

        /* ArrayList<Double> maiorTemp = new ArrayList<>();
        for (int i=0; i<temperatura.size(); i++){
            if (temperatura.get(i) > media) 
                maiorTemp.add(temperatura.get(i));   
        } 
        System.out.println("As maiores temperaturas " + maiorTemp); */
        System.out.println("As maiores temperaturas:");
        for (int i=0; i<temperatura.size(); i++) {
            if (temperatura.get(i) > media) {
                switch (temperatura.indexOf(temperatura.get(i))) {
                    case 0:
                        System.out.println("janeiro " + temperatura.get(i));
                        break;
                    case 1:
                        System.out.println("fevereiro " + temperatura.get(i)); break;
                    case 2:
                        System.out.println("março " + temperatura.get(i)); break;
                    case 3:
                        System.out.println("abril " + temperatura.get(i)); break;
                    case 4:
                        System.out.println("maio " + temperatura.get(i)); break;
                    case 5:
                        System.out.println("junho " + temperatura.get(i)); break;  
                    default:
                        System.out.println("não houve temperatura mais alta que a média");
                        break;
                }
            }
        }
        //System.out.println(temperatura.indexOf(temperatura.get(i)));

    }
}