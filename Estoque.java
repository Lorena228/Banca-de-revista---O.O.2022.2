import java.util.List;
import java.util.ArrayList;

//#TODO: Estou trabalahndo nessa classe. Lorena
public class Estoque {

  public List<Produto> listaProdutos = new ArrayList<>();
  private int totalUnidades;

  public int getTotalUnidades() {
    return totalUnidades;
  }

  public void setTotalUnidades(int totalUnidades) {
    this.totalUnidades = totalUnidades;
  }

  public void adcProduto(Produto novoProduto) {
    this.listaProdutos.add(novoProduto);
    this.totalUnidades += novoProduto.getQuantidade();
  }

  public void removeProduto(String nomeProduto) {
    for (int i = 0; i <= listaProdutos.size(); i++) {
      if (listaProdutos.get(i).getTitulo() == nomeProduto) {
        this.listaProdutos.remove(i);
      }
    }
  }
}
