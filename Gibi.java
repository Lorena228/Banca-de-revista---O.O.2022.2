public class Gibi extends Produto {

  private String tipo;

  public Gibi(String titulo, String editora, int edicao, String categoria, float preco, int quantidade, String tipo) {
    super(titulo, editora, edicao, categoria, preco, quantidade);
    this.titulo = titulo;
    this.editora = editora;
    this.edicao = edicao;
    this.categoria = categoria;
    this.preco = preco;
    this.quantidade = quantidade;
    this.tipo = tipo;
  }

  public String getTipo() {
    return tipo;
  }

  public void setTipo(String tipo) {
    this.tipo = tipo;
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