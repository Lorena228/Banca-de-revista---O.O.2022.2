
public class Cadastro {
  String nome;
  int idade;
  String preferencia;
  int desconto;

  void desconto() {
    if (resp == "S") {
      System.out.println("Parabens! Você ganhou 15% de desconto!");
    } else {
      System.out.println("Obrigada por comprar novamente conosco!");
    }
  }
}
