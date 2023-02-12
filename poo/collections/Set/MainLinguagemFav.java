package poo.collections.Set;

import java.lang.reflect.Array;
import java.util.*;

public class MainLinguagemFav {
    public static void main (String[] args) {
        Set<LinguagemFavorita> rank = new HashSet<>();            
        rank.add(new LinguagemFavorita("Python", 1991, "Pycharm"));
        rank.add(new LinguagemFavorita("JavaScript", 1995, "Intellij"));
        rank.add(new LinguagemFavorita("Java", 1991, "VSCode"));

        System.out.println(rank.toString());

        System.out.println("ORDEM DE INSERÇÃO");
        Set<LinguagemFavorita> rank2 = new LinkedHashSet<>(
            Arrays.asList(
                new LinguagemFavorita("Python", 1991, "Pycharm"),
                new LinguagemFavorita("JavaScript", 1995, "Intellij"),
                new LinguagemFavorita("Java", 1991, "VSCode")
            )
        ); System.out.println(rank2);

        System.out.println("ORDEM NATURAL: NOME");
        Set<LinguagemFavorita> rank3 = new TreeSet<>(rank);
        System.out.println(rank3);
        // for (LinguagemFavorita linguagemFavorit : rank) System.out.println(linguagemFavorit);

        System.out.println("ORDEM NATURAL: IDE");
        Set<LinguagemFavorita> rank4 = new TreeSet<LinguagemFavorita>(new CompareIde());
        rank4.addAll(rank); System.out.println(rank4);
    }
}
