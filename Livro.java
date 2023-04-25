public class Livro extends Produto {

  private int npag;
  private String tipoCapa;

  public Livro(String titulo, String editora, int edicao, String categoria, float preco, int quantidade, int npag,
      String tipoCapa) {
    super(titulo, editora, edicao, categoria, preco, quantidade);
    this.titulo = titulo;
    this.editora = editora;
    this.edicao = edicao;
    this.categoria = categoria;
    this.preco = preco;
    this.quantidade = quantidade;
    this.npag = npag;
    this.tipoCapa = tipoCapa;
  }

  public int getNpag() {
    return npag;
  }

  public void setNpag(int npag) {
    this.npag = npag;
  }

  public String getTipoCapa() {
    return tipoCapa;
  }

  public void setTipoCapa(String tipoCapa) {
    this.tipoCapa = tipoCapa;
  }

  @Override
  public String descricaoProduto() {
    return "Livro [titulo:" + titulo + "\neditora: " + editora + "\nedicao:" + edicao + "\ncategoria: "
        + categoria
        + "\npreco: " + preco + "\nquantidade: " + quantidade + "\nN° de páginas: " + npag + "\ntipo de capa:"
        + tipoCapa + "]";
  }

}
