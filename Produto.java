public class Produto {
  protected String titulo;
  protected String editora;
  protected int edicao;
  protected String categoria;
  protected float preco;
  protected int quantidade;

  public Produto(String titulo, String editora, int edicao, String categoria, float preco, int quantidade) {
    this.titulo = titulo;
    this.editora = editora;
    this.edicao = edicao;
    this.categoria = categoria;
    this.preco = preco;
    this.quantidade = quantidade;
  }

  public void editarProduto() {

  }

  public void descricaoProduto() {

  }

  public String getTitulo() {
    return titulo;
  }

  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }

  public String getEditora() {
    return editora;
  }

  public void setEditora(String editora) {
    this.editora = editora;
  }

  public int getEdicao() {
    return edicao;
  }

  public void setEdicao(int edicao) {
    this.edicao = edicao;
  }

  public String getCategoria() {
    return categoria;
  }

  public void setCategoria(String categoria) {
    this.categoria = categoria;
  }

  public float getPreco() {
    return preco;
  }

  public void setPreco(float preco) {
    this.preco = preco;
  }

  public int getQuantidade() {
    return quantidade;
  }

  public void setQuantidade(int quantidade) {
    this.quantidade = quantidade;
  }

}