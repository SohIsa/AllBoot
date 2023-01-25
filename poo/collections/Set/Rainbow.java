package poo.collections.Set;

import java.util.*;

public class Rainbow {
     public static void main( String[] args ) {
        
        Set<String> rainbow = new HashSet<>(Arrays.asList("vermelha", "laranja", "amarela", "verde", "azul", "azul-escuro", "violeta"));
        //rainbow.add("azul");
        System.out.println(rainbow);

        System.out.println("Todas as cores uma abaixo da outra");
        for (String color : rainbow) {
            System.out.println(color);    
        }

        System.out.println();
        System.out.println("A quantidade de cores que o arco-íris tem");
        System.out.println(rainbow.size());

        System.out.println();
        System.out.println("Exiba as cores em ordem alfabética");
        Set<String> rainbowO = new TreeSet<>(rainbow);
        System.out.println(rainbowO);

        System.out.println();
        System.out.println("Exiba as cores na ordem inversa da que foi informada");
        /* Set<String> rainbowI = new LinkedHashSet<>(rainbow);
        System.out.println(rainbowI); */
    } 
    
    /* private String color;
    public Rainbow (String color) {
        this.color = color;
    }
    public String getColor() {
        return color;
    } */
    
}

/* class CompareColors implements Comparator{

    @Override
    public int compare(Object o1, Object o2) {
        int colors 
        // TODO Auto-generated method stub
        return 0;
    }
    
} */
