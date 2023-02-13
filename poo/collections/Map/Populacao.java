package poo.collections.Map;

import java.util.*;

public class Populacao {
    public static void main(String[] args) {
        Map<String, Integer> populacao = new HashMap<>();
        populacao.put("PE", 9616621);
        populacao.put("AL",3351543);
        populacao.put("CE", 9187103);
        populacao.put("RN", 3534265);

        System.out.println("ORIGINAL");
        System.out.println(populacao);

        System.out.println("Substitua a população do estado do RN por 3.534.165");
        populacao.put("RN", 3534165);
        System.out.println(populacao);

        System.out.println("Confira se o estado PB está no dicionário, caso não adicione: PB - 4.039.277");
        if (populacao.containsKey("PB")) {
            System.out.println(populacao);
        } else {
            populacao.put("PB", 4039277);
        } System.out.println(populacao);

        System.out.println("Exiba a população PE");
        System.out.println(populacao.get("PE"));
        
        System.out.println("Exiba todos os estados e suas populações na ordem que foi informado");
        Map<String, Integer> populacao2 = new LinkedHashMap<>();
        populacao2.put("CE", 9187103);
        populacao2.put("PE", 9616621);
        populacao2.put("AL",3351543);
        populacao2.put("RN", 3534265);
        System.out.println(populacao2);

        System.out.println("Exiba os estados e suas populações em ordem alfabética");
        Map<String, Integer> populacao3 = new TreeMap<>(populacao);
        System.out.println(populacao3);

        System.out.println("Exiba o estado com o menor população e sua quantidade");
        int menorPopulacao = Collections.min(populacao.values());
        Set<Map.Entry<String, Integer>> entries = populacao.entrySet();
        String estado = "";
        for (Map.Entry<String,Integer> entry : entries) {
            if (entry.getValue().equals(menorPopulacao)) {
                estado = entry.getKey();
                System.out.println(estado + ": " + menorPopulacao);
            }
        }

        System.out.println("Exiba o estado com a maior população e sua quantidade");
        System.out.println("Exiba a soma da população desses estados");
        System.out.println("Exiba a média da população deste dicionário de estados");
        System.out.println("Remova os estados com a população menor que 4.000.000");
        System.out.println("Apague o dicionário de estados");
        System.out.println("Confira se o dicionário está vazio");
    }
}
