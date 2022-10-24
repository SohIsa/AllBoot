public class Main {
  public static void main(String[] args) {

    System.out.println("Calculadora");
    Calculadora.soma(5, 5);
    Calculadora.sub(5, 1.35);
    Calculadora.mult(5.3, 2);
    Calculadora.div(4, 2);
    //o que há com o float

    System.out.println("Cumprimento");
    Cumprimento.horario(5);

    System.out.println("áreas");
    Quadrilateros.area(2);
    Quadrilateros.area(2, 3);
    Quadrilateros.area(2, 3, 4);
  }
}