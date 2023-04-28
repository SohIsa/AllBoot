public class SmartTv {
  
  boolean ligada = false;
  int canal = 1;
  int volume = 15;

  public void ligar(){
    ligada = true;
  }
  public void desligar(){
    ligada = false;
  }

  public void aumentar(){
    volume++;
  }
  public void diminuir(){
    volume--;
  }

  public void trocar(){
    canal++;
  }
  public void trocarMenor(){
    canal--;
  }
  public void escolher(int a){
    canal = a;
  }
}