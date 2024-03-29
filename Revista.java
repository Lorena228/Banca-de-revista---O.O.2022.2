
public class Revista extends Produto {

  private String artigoPrincipal;

  public Revista(String titulo, String editora, int edicao, String categoria, float preco, int quantidade,
      String artigoPrincipal) {
    super(titulo, editora, edicao, categoria, preco, quantidade);
    this.titulo = titulo;
    this.editora = editora;
    this.edicao = edicao;
    this.categoria = categoria;
    this.preco = preco;
    this.quantidade = quantidade;
    this.artigoPrincipal = artigoPrincipal;
  }

  @Override
  public String descricaoProduto() {
    return "Revista [titulo:" + titulo + "\neditora: " + editora + "\nedicao:" + edicao + "\ncategoria: "
        + categoria
        + "\npreco: " + preco + "\nquantidade: " + quantidade + "\nartigo principal: " + artigoPrincipal + "]\n";
  }

  public String getArtigoPrincipal() {
    return artigoPrincipal;
  }

  public void setArtigoPrincipal(String artigoPrincipal) {
    this.artigoPrincipal = artigoPrincipal;
  }

}
