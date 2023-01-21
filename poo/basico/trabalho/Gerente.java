package poo.basico.trabalho;

public class Gerente extends Funcionario{
    @Override
    void metodo1(){
        System.out.println("metodo 1 da classe filha (gerente)");
    }
    @Override
    void metodo2(){
        System.out.println("metodo 2 da classes filha (gerente)");
    }
// sobre agregação: mesmo que o gerente deixe de existir o funcionario não desaparecerá
    Funcionario funcionario;
}
/* sobre composição: algo atrelado e dependente no qual se deixar de existir ele varre tudo junto consigo
como a relação entre pessoa e endereço (o endereço só pertence a esse pessoa) 
    sobre dependencia: um metodo de depende da classe para existir*/