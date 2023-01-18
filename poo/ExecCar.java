package poo;

public class ExecCar {
    public static void main(String[] args) {
        Carro carro = new Carro();

        carro.setCor("azul");
        carro.setModelo("gol");
        carro.setTanque(12);

        System.out.println(carro.getCor());
        System.out.println("o custo do tanque " + carro.custoTanque(2.15));

    }

}
