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
    return "Gibi [titulo:" + titulo + "\neditora: " + editora + "\nedicao:" + edicao + "\ncategoria: "
        + categoria
        + "\npreco: " + preco + "\nquantidade: " + quantidade + "\ntipo: " + tipo + "]\n";
  }

}