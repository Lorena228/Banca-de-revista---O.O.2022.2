
import java.util.Scanner;
import java.util.ArrayList;

public class Menu extends Dados {

  private int escolhido;

  InterfaceVender dadosVender = new Dados();
  Estoque estoque = new Estoque();

  Scanner teclado;

  public Menu(int escolhido, Scanner sc) {

    ArrayList<Produto> newDados = popularDados(); // Populando os dados
    ArrayList<Pessoa> dadosPessoa = popularPessoas();

    this.escolhido = escolhido;
    teclado = sc;
    estoque.popularEstoque(newDados); // Adicionar os dados ao estoque 
    algumacoisa.
  }

  public void resposta(int escolhido) {
    switch (escolhido) {
      case 1:
        try {
          System.out.println("Qual o título do produto?");
          String escolher = teclado.nextLine();
          teclado.nextLine();
          estoque.removeProduto(escolher);
          break;
        } catch (IndexOutOfBoundsException e) {
          System.out.println("Nenhum produto cadastrado.");
          break;
        }

      case 2:
        try {
          System.out.println("Qual o título do produto que deseja editar?");
          String escolher2 = teclado.nextLine();
          teclado.nextLine();
          estoque.editarProduto(escolher2);
          break;
        } catch (IndexOutOfBoundsException e) {
          System.out.println("Nenhum produto cadastrado.");
          break;
        }

      case 3:
        estoque.listarProdutos();
        break;

      case 4:
        try {
          System.out.println("Qual o título do produto comprado?");
          String prodNome = teclado.nextLine();
          teclado.nextLine();
          int index = estoque.procurarProduto(prodNome);
          Produto p = estoque.listaProdutos.get(index);
          System.out.println("Informe o desconto? Ex.: 0.1 para 10%");
          float desconto = teclado.nextFloat();
          teclado.nextLine();

          float precoTotal = p.getPreco();

          break;
        } catch (Exception e) {
          System.out.println("Não foi possível concluir a venda :(");
          break;
        }

      case 0:
        break;

    }
  }

  public int getEscolhido() {
    return escolhido;
  }

  public void setEscolhido(int escolhido) {
    this.escolhido = escolhido;
  }

}
