package poo.collections;

import java.util.ArrayList;
import java.util.Scanner;

public class Crime {
    public static void main(String[] args) {
        ArrayList<String> call = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        String valor;
        int count = 0;
        int count2 = 0;

        do {
            System.out.println("Telefonou para a vítima? (s/n)");
            valor = scan.next();
            call.add(valor);
            count++;
            System.out.println("Esteve no local do crime? (s/n)");
            valor = scan.next();
            call.add(valor);
            count++;
            System.out.println("Mora perto da vítima? (s/n)");
            valor = scan.next();
            call.add(valor);
            count++;
            System.out.println("Devia para a vítima? (s/n)");
            valor = scan.next();
            call.add(valor);
            count++;
            System.out.println("Já trabalhou com a vítima? (s/n)");
            valor = scan.next();
            call.add(valor);
            count++;
        } while (count < 5);
        //System.out.println(call);

        /* for (int i = 0; i < call.size(); i++) {
            if (call.contains("s")) count2++;
        } System.out.println(count2); */
        while (call.contains("s")) {
            count2++;
            call.remove("s");
        } //System.out.println(count2);

        if (count2 == 5) {
            System.out.println("Assassino");
        } else if (count2 >= 3) {
            System.out.println("Cúmplice");
        } else if (count2 == 2) {
            System.out.println("Suspeita");
        } else System.out.println("inocente");
    }
}
