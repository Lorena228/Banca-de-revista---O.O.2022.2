public class Main {
  public static void main(String[] args) {
    Estoque estoque = new Estoque();
    estoque.adcProduto(new Revista("Marie Clarie", "OGlobo", 78, "Moda e Beleza", 24.7f, 20, "Paris Fashion Week"));
    estoque.adcProduto(new Livro("Branca de neve", "intríseca", 1, "Fantasia", 12.99f, 10, 52, "Brochura"));
    System.out.println(estoque.listaProdutos.get(0).getEditora());
    System.out.println(estoque.getTotalUnidades());
    estoque.editarProduto("Branca de neve");
    estoque.listarEstoque();

    // estoque.removeProduto("Marie Clarie");

  }
}