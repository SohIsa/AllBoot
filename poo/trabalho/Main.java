package poo.trabalho;

public class Main {
    
    public static void main(String[] args) {
        
        /* Funcionario funcionario = new Funcionario(); //estanciando na propria classe

        //uppercast
        Funcionario gerente = new Gerente();
        Funcionario faxineiro = new Faxineiro();    //subtipos da classe funcionário
        Funcionario vendedor = new Vendedor();

        //downcast
        Vendedor vendedor2 = (Vendedor) new Funcionario(); */

        Funcionario[] classes = new Funcionario[]{ new Faxineiro(), new Gerente(), new Funcionario()};

        for (Funcionario funcionario : classes) {
            funcionario.metodo1();
        }

        System.out.println("vendo a falta e o agir so sobreescrever");
        for (Funcionario funcionario : classes) {
            funcionario.metodo2();
        }

    }

}
