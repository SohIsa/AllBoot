package poo;
// vc usa o import para pegar coisas dentro de um outro package

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
/*Visibilidade: Private - só será visível dentro da classe criada.
 *              Protected - será visível dentro do mesmo pacote.
 *              Public - em qualquer lugar da aplicação, viva import.
 */
