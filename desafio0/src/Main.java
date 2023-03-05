import java.time.LocalDate;

import d0_dominio.Bootcamp;
import d0_dominio.Cursos;
import d0_dominio.Dev;
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

        /* System.out.println(cursoA);
        System.out.println(cursoB);
        System.out.println(mentoria); */

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Desenvolvimento Java");
        bootcamp.setDescricao("Java para dar e vender");
        bootcamp.getConteudos().add(mentoria);
        bootcamp.getConteudos().add(cursoA);
        bootcamp.getConteudos().add(cursoB);

        Dev devIsa = new Dev();
        devIsa.setNome("Isa");
        devIsa.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos Isa:" + devIsa.getConteudosInscritos());
        devIsa.progredir();
        devIsa.progredir();
        devIsa.progredir();
        System.out.println("Conteúdos concluídos Isa:" + devIsa.getConteudosConcluidos());
        System.out.println("XP: " + devIsa.calcularTotalXp());
        System.out.println();
        System.out.println("Conteúdos inscritos Isa:" + devIsa.getConteudosInscritos());

        System.out.println();        
        Dev devYonara = new Dev();
        devYonara.setNome("Yonara");
        devYonara.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos Yonara:" + devYonara.getConteudosInscritos());
        devYonara.progredir();
        devYonara.progredir();
        System.out.println("Conteúdos concluídos Yonara:" + devYonara.getConteudosConcluidos());
        System.out.println("XP: " + devYonara.calcularTotalXp());
        System.out.println();
        System.out.println("Conteúdos inscritos Yonara:" + devYonara.getConteudosInscritos());
    }
}
