package poo.basico;

class Carro {
  
  String cor;
  String modelo;
  int tanque;

  Carro() {
    
  }

  Carro(String cor, String modelo, int tanque) {
    this.cor= cor;
    this.modelo = modelo;
    this.tanque = tanque;
  }
  
  void setCor (String cor){
    this.cor = cor;
  }
  String getCor() {
    return cor;
  }

  void setModelo (String modelo) {
    this.modelo = modelo;
  }
  String getModelo() {
    return modelo;
  }

  void setTanque (int tanque) {
    this.tanque = tanque;
  }
  int getTanque() {
    return tanque;
  }
  double custoTanque (double valorGasolina) {
    return tanque*valorGasolina;
  }
  
}