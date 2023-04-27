import java.util.Scanner;

public class Menu implements InterfaceOperacoes {

  Scanner teclado;
  int chosen;
  Estoque estoque;

  public Menu(Scanner teclado) {
    this.teclado = teclado;
  }

  public void resposta(int chosen) {
    this.chosen = chosen;
    switch (this.chosen) {
      case 1:
        this.estoque.newProduto();
        break;
      case 2:
        this.estoque.removeProduto();
        break;
      case 3:
        this.estoque.editarProduto();
        break;
      case 4:
        this.estoque.listarEstoque();
        break;
      case 0:
        break;
    }
  }

  public Estoque enviarEstoque(Estoque estoqueUsado) {
    this.estoque = estoqueUsado;
    return estoqueUsado;
  }

  @Override
  public void newProduto() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'newProduto'");
  }

  @Override
  public void adcProduto(Produto novoProduto) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'adcProduto'");
  }

  @Override
  public void removeProduto() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'removeProduto'");
  }

  @Override
  public void listarEstoque() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'listarEstoque'");
  }

  @Override
  public void editarProduto() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'editarProduto'");
  }

  @Override
  public void criarEstoqueGenerico() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'criarEstoqueGenerico'");
  }
}
