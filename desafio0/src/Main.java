import java.time.LocalDate;

import d0_dominio.Cursos;
import d0_dominio.Mentoria;

public class Main {
    public static void main(String[] args) {
        Cursos cursoA = new Cursos();
        cursoA.setTitulo("Java");
        cursoA.setDescricao("curso de java");
        cursoA.setCargaHoraria(10);

        Cursos cursoB = new Cursos();
        cursoB.setTitulo("Python");
        cursoB.setDescricao("curso de python");
        cursoB.setCargaHoraria(5);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Java para valer");
        mentoria.setDescricao("prática java");
        mentoria.setData(LocalDate.now());

        System.out.println(cursoA);
        System.out.println(cursoB);
        System.out.println(mentoria);
    }
}
