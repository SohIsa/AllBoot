package poo.contas;

public class Calculadora implements Operacoes{
    
    @Override
    public void soma (double valor1, double valor2) {
        System.out.println(valor1+valor2);
    }
    @Override
    public void subtracao (double valor1, double valor2) {
        System.out.println(valor1-valor2);
    }
    @Override  
    public void multiplicacao (double valor1, double valor2) {
        System.out.println(valor1*valor2);
    }
    @Override
    public void divisao (double valor1, double valor2) {
        System.out.println(valor1/valor2);
    }

}
