public class Main {
  public static void main(String[] args) {
    Estoque estoque = new Estoque();
    estoque.adcProduto(new Revista("Marie Clarie", null, 0, null, 0, 0, null));
    System.out.println(estoque.listaProdutos.toString());
    estoque.removeProduto("Marie Clarie");
    System.out.println(estoque.listaProdutos.toString());

  }
}