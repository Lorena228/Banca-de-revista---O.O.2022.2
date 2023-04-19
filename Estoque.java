import java.util.List;
import java.util.ArrayList;

//#TODO: Estou trabalahndo nessa classe. Lorena
public class Estoque {

  private List<Produto> listaProdutos = new ArrayList<>();

  public void adcProduto(Produto novoProduto) {
    this.listaProdutos.add(novoProduto);

  }
}
