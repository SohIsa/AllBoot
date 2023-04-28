public class Quadrilateros {
  public static void area (int a) {
    System.out.println(a*a);
  }
  public static void area (int a, int b) {
    System.out.println(a*b);
  }
  public static void area (int a, int b, int c) {
    int valor = ((a + b) * c)/2;
    System.out.println(valor);
  }
}