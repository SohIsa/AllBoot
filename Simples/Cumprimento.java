public class Cumprimento{
  public static void horario(int a){
    if (a > 0 && a < 12)  {
      System.out.println("Bom dia");
    } else if (a<=18)  {
      System.out.println("Boa tarde");
    } else if (a <= 24)  {
      System.out.println("Boa noite");
    } else {
      System.out.println("Horario invalido");
    }
  }
}