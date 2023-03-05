package d0_dominio;

public class Cursos extends Conteudo {

    private int cargaHoraria;
    
    public Cursos() {
    }

    @Override
    public double calcularXp() {
        return XP_PADRAO * cargaHoraria;
    }
    
    public int getCargaHoraria() {
        return cargaHoraria;
    }
    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }
    @Override
    public String toString() {
        return "Cursos [titulo=" + getTitulo() + 
        ", descricao=" + getDescricao() + 
        ", cargaHoraria=" + cargaHoraria + "]";
    }

        
}