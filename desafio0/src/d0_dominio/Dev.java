package d0_dominio;

import java.util.*;

public class Dev {
    private String nome;
    private Set<Conteudo> conteudosInscritos = new LinkedHashSet<>();
    private Set<Conteudo> conteudosConcluidos = new LinkedHashSet<>();

    public void inscreverBootcamp(Bootcamp bootcamp) {}
    public void progredir(){}
    public void calcularTotalXp() {}
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Set<Conteudo> getConteudosInscritos() {
        return conteudosInscritos;
    }
    public void setConteudosInscritos(Set<Conteudo> conteudosInscritos) {
        this.conteudosInscritos = conteudosInscritos;
    }
    public Set<Conteudo> getConteudosConcluidos() {
        return conteudosConcluidos;
    }
    public void setConteudosConcluidos(Set<Conteudo> conteudosConcluidos) {
        this.conteudosConcluidos = conteudosConcluidos;
    }
    @Override
    public int hashCode() {
        return Objects.hash(nome, conteudosInscritos, conteudosConcluidos);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Dev dev = (Dev) obj;
        return Objects.equals(nome, dev.nome) && 
        Objects.equals(conteudosInscritos, dev.conteudosInscritos) && 
        Objects.equals(conteudosConcluidos, dev.conteudosConcluidos);
    }
    
    
}
