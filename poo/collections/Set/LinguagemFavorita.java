package poo.collections.Set;

import java.util.Comparator;

public class LinguagemFavorita implements Comparable<LinguagemFavorita> {
    public String nome;
    public Integer anoDeCriacao;
    public String ide;

    public LinguagemFavorita (String nome, Integer anoDeCriacao, String ide) {
        this.nome = nome;
        this.anoDeCriacao = anoDeCriacao;
        this.ide = ide;
    }

    public String getNome() {
        return nome;
    }
    public Integer getCriacao() {
        return anoDeCriacao;
    }
    public String getIde() {
        return ide;
    }
    public String toString() {
        return 
        "nome= " + nome +
        ", ano de criacao= " + anoDeCriacao +
        ", ide= " + ide + "\n";
    }

    @Override
    public int compareTo(LinguagemFavorita linguagemFavorita) {
        return this.nome.compareTo(linguagemFavorita.nome);
    }
}

class CompareIde implements Comparator<LinguagemFavorita> {

    @Override
    public int compare(LinguagemFavorita o1, LinguagemFavorita o2) {
        // TODO Auto-generated method stub
        return o1.ide.compareToIgnoreCase(o2.ide);
    }
}

class CompareNomeAno implements Comparator<LinguagemFavorita> {

    @Override
    public int compare(LinguagemFavorita o1, LinguagemFavorita o2) {
        int an1 = o1.getCriacao().compareTo(o2.getCriacao());
        if (an1 != 0) return an1;
        return o1.nome.compareToIgnoreCase(o2.nome);        
    }   
}

class CompareNomeAnoIde implements Comparator<LinguagemFavorita> {

    @Override
    public int compare(LinguagemFavorita o1, LinguagemFavorita o2) {
        int an1 = o1.getCriacao().compareTo(o2.getCriacao());
        int an2 = o1.getNome().compareToIgnoreCase(o2.getNome());
        if (an1 != 0) return an1;
        if (an2 != 0) return an2;
        return o1.ide.compareToIgnoreCase(o2.ide);
    }
    
}
