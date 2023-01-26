package poo.collections.Set;

public class LinguagemFavorita {
    private String nome;
    private Integer anoDeCriacao;
    private String ide;

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

}
