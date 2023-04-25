import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Estoque {

  public List<Produto> listaProdutos = new ArrayList<>();
  private int totalUnidades;

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

  public void listarEstoque() {
    for (int i = 0; i <= listaProdutos.size(); i++) {
      System.out.println(this.listaProdutos.get(i).descricaoProduto());
    }
  }

  public int procurarProduto(String titulo) {
    for (int i = 0; i <= listaProdutos.size(); i++) {
      if (this.listaProdutos.get(i).getTitulo() == titulo) {
        return i;
      }
    }
    return -1;
  }

  public void editarProduto(String titulo) {
    int procurado = this.procurarProduto(titulo);
    if (procurado != -1) {
      this.listaProdutos.get(procurado).descricaoProduto();
      Scanner leitor = new Scanner(System.in);
      String mudanca;
      System.out.println("Digite a característica que você deseja alterar (Ex.:\"edição:43\"):");
      mudanca = leitor.nextLine().toString();
      if (mudanca.contains(":")) {
        int indexfinal = mudanca.indexOf(":");
        String sub = mudanca.substring(0, indexfinal);
        Produto encontrado = this.listaProdutos.get(procurado);
        switch (sub) {
          case "titulo":
            sub = mudanca.substring(indexfinal + 1);
            encontrado.setTitulo(sub);
            break;

          case "editora":
            sub = mudanca.substring(indexfinal + 1);
            encontrado.setEditora(sub);
            break;

          case "edicao":
            sub = mudanca.substring(indexfinal + 1);
            encontrado.setEdicao(Integer.parseInt(sub));
            break;

          case "categoria":
            sub = mudanca.substring(indexfinal + 1);
            encontrado.setCategoria(sub);
            break;

          case "preco":
            sub = mudanca.substring(indexfinal + 1);
            encontrado.setPreco(Float.parseFloat(sub));
            break;

          case "quantidade":
            sub = mudanca.substring(indexfinal + 1);
            encontrado.setQuantidade(Integer.parseInt(sub));
            break;

        }
      }
      leitor.close();

    }
  }

  public int getTotalUnidades() {
    return totalUnidades;
  }

  public void setTotalUnidades(int totalUnidades) {
    this.totalUnidades = totalUnidades;
  }

}
