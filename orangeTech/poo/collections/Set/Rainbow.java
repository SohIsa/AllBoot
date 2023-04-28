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
        List<String> rainbowI = new ArrayList<>(rainbowO);
        System.out.println(rainbowI);
        Collections.sort(rainbowI, Collections.reverseOrder());
        System.out.println(rainbowI);

        System.out.println();
        System.out.println("Exiba todas as cores que começam com a letra 'v'");
        Iterator<String> iterator = rainbow.iterator();
        while (iterator.hasNext()) {
            String c = iterator.next();
            if (c.startsWith("v")) {
                System.out.println(c);
            }
        }
        
        System.out.println();
        System.out.println("Remova todas as cores que não começam com a letra 'v'");
        rainbow.removeIf(color -> color.startsWith("v"));
        System.out.println(rainbow);

        System.out.println();
        System.out.println("limpe a lista e confirme:");
        rainbow.clear();

        System.out.println(rainbow.isEmpty());

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
