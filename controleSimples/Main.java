class Main {
  public static void main(String[] args) {
    SmartTv smartTv = new SmartTv ();
    System.out.println("A TV esta ligada? " + smartTv.ligada);
    smartTv.ligar();
    System.out.println("A TV esta ligada? " + smartTv.ligada);

    System.out.println("O volume atual é: " + smartTv.volume);
    smartTv.aumentar();
    System.out.println("O volume atual é: " + smartTv.volume);

    System.out.println("O canal atual é: " + smartTv.canal);
    smartTv.trocar();
    System.out.println("O canal atual é: " + smartTv.canal);
    smartTv.escolher(13);
    System.out.println("O canal atual é: " + smartTv.canal);
    smartTv.trocarMenor();
    smartTv.trocarMenor();
    smartTv.trocarMenor();
    System.out.println("O canal atual é: " + smartTv.canal);
  }
}