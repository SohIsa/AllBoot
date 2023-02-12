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
        return Integer.compare(o1.anoDeCriacao, o2.anoDeCriacao);
        
    }
    
}
