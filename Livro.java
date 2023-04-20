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
    // TODO Auto-generated method stub
    return super.descricaoProduto();
  }

  @Override
  public void editarProduto() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'editarProduto'");
  }

}
