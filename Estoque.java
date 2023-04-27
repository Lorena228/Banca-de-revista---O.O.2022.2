import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Estoque implements InterfaceOperacoes {

  public List<Produto> listaProdutos = new ArrayList<>();
  private int totalUnidades;
  Scanner teclado;

  public Estoque(Scanner teclado) {
    this.teclado = teclado;
  }

  @Override
  public void adcProduto(Produto novoProduto) {
    this.listaProdutos.add(novoProduto);
    this.totalUnidades += novoProduto.getQuantidade();
  }

  @Override
  public void removeProduto() {
    teclado.nextLine();
    System.out.println("Qual o titulo do produto a ser removido?");
    String nomeProduto = teclado.nextLine();
    teclado.nextLine();
    try {
      for (int i = 0; i <= listaProdutos.size(); i++) {
        if (listaProdutos.get(i).getTitulo().equals(nomeProduto)) {
          this.listaProdutos.remove(i);
          System.out.println("Produto removido com sucesso!\n");
          break;
        }
      }
    } catch (IndexOutOfBoundsException e) {
      System.out
          .println("O título procurado não existe. Confira na opção 4 do menu para ver quais os títulos cadastrados!");

    }

  }

  @Override
  public void listarEstoque() {
    for (int i = 0; i <= listaProdutos.size(); i++) {
      System.out.println(this.listaProdutos.get(i).descricaoProduto());
    }
  }

  @Override
  public void editarProduto() {
    System.out.println("Qual o título do produto que deseja editar?");
    teclado.nextLine();
    String titulo = teclado.nextLine();
    teclado.nextLine();
    int procurado = 0;
    for (int i = 0; i <= listaProdutos.size(); i++) {
      if (this.listaProdutos.get(i).getTitulo().equals(titulo)) {
        procurado = i;
        break;
      } else {
        procurado = -1;
        System.out.println("Titulo não encontrado. ");
        break;
      }
    }
    if (procurado != -1) {
      System.out.println(this.listaProdutos.get(procurado).descricaoProduto());
      String mudanca;
      int num = 0;
      float num2 = 0;
      System.out.println("Digite a característica que você deseja alterar (Ex.:\"edicao:43\"):");
      mudanca = teclado.nextLine().toString().toLowerCase();
      if (mudanca.contains(":")) {
        int indexfinal = mudanca.indexOf(":");
        String subString = mudanca.substring(0, indexfinal);
        Produto encontrado = this.listaProdutos.get(procurado);
        switch (subString) {
          case "titulo":
            subString = mudanca.substring(indexfinal + 1);
            encontrado.setTitulo(subString);
            System.out.println("Título alterado com sucesso!");
            break;

          case "editora":
            subString = mudanca.substring(indexfinal + 1);
            encontrado.setEditora(subString);
            System.out.println("Editora alterada com sucesso!");
            break;

          case "edicao":
            subString = mudanca.substring(indexfinal + 1);
            num = Integer.parseInt(subString);
            encontrado.setEdicao(num);
            System.out.println("Edição alterada com sucesso!");
            break;

          case "categoria":
            subString = mudanca.substring(indexfinal + 1);
            encontrado.setCategoria(subString);
            System.out.println("Categoria alterada com sucesso!");
            break;

          case "preco":
            subString = mudanca.substring(indexfinal + 1);
            num2 = Float.parseFloat(subString);
            encontrado.setPreco(num2);
            System.out.println("Preço alterado com sucesso!");
            break;

          case "quantidade":
            subString = mudanca.substring(indexfinal + 1);
            num = Integer.parseInt(subString);
            encontrado.setQuantidade(num);
            System.out.println("Quantidade alterada com sucesso!");
            break;
        }
      } else {
        System.out.println("Produto não cadastrado!");
      }
    }
  }

  public List<Produto> getListaProdutos() {
    return listaProdutos;
  }

  public int getTotalUnidades() {
    return totalUnidades;
  }

  public void setTotalUnidades(int totalUnidades) {
    this.totalUnidades = totalUnidades;
  }

  public void criarEstoqueGenerico() {
    Produto revista1 = new Revista("Toda Noite", "Editora Maio", 47, "Casa e Construção", 19.90f, 10,
        "Casa Cor Recife");
    Produto revista2 = new Revista("Meu apartamento", "Portal Brasília", 19, "Casa e Construção", 21.8f, 14,
        "Projetos para espaços pequenos");
    Produto revista3 = new Revista("Jedi amigo", "Skywalker", 7, "Cultura Pop", 17.99f, 10,
        "Comemoração de 45 anos de StarWars");
    Produto gibi1 = new Gibi("Turma da Crônica", "Panini", 58, "Infantil", 5.99f, 12, "Gibi");
    Produto gibi2 = new Gibi("Batman", "Carrossel", 28, "Cultura Pop", 29.00f, 15, "HQ");
    Produto gibi3 = new Gibi("Naruto", "Japan", 62, "Otaku", 22.95f, 15, "Mangá");
    Produto livro1 = new Livro("Harry Toterran", "Sextante", 2, "Fantasia", 32.65f, 10, 352, "Brochura");
    Produto livro2 = new Livro("Orgulho e Preconceito", "Record", 3, "Romance", 58.3f, 10, 252, "Dura");
    Produto livro3 = new Livro("Chapeuzinho Vermelho", "Escola", 1, "Infantil", 10.0f, 10, 35, "Brochura");
    this.adcProduto(revista1);
    this.adcProduto(revista2);
    this.adcProduto(revista3);
    this.adcProduto(gibi1);
    this.adcProduto(gibi2);
    this.adcProduto(gibi3);
    this.adcProduto(livro1);
    this.adcProduto(livro2);
    this.adcProduto(livro3);

  }

  @Override
  public void newProduto() {
    System.out.println("Digite o tipo de produto que você deseja adicionar(Ex.: Revista)");
    teclado.nextLine();
    String tipo = teclado.nextLine();
    teclado.nextLine();
    System.out.println("Qual o título do(a) " + tipo + "?");
    String titulo = teclado.nextLine();
    teclado.nextLine();
    System.out.println("Qual a editora (String)?");
    String editora = teclado.nextLine();
    teclado.nextLine();
    System.out.println("Qual a edição (inteiro)?");
    int edicao = teclado.nextInt();
    teclado.nextLine();
    System.out.println("Qual a categoria (String)?");
    String categoria = teclado.nextLine();
    teclado.nextLine();
    System.out.println("Qual o preço (float)?");
    float preco = teclado.nextFloat();
    teclado.nextLine();
    System.out.println("Quantas unidades serão inseridas no estoque (inteiro)?");
    int quantidade = teclado.nextInt();

    if (tipo.equals("Revista")) {
      teclado.nextLine();
      System.out.println("Qual o artigo principal? (String)");
      String artigo = teclado.nextLine();
      teclado.nextLine();
      Produto revista = new Revista(titulo, editora, edicao, categoria, preco, quantidade, artigo);
      this.listaProdutos.add(revista);
      System.out.println("Revista adicionada com sucesso!");

    } else if (tipo.equals("Gibi")) {
      System.out.println("Qual o tipo do Gibi? (Ex. Mangá, HQ, Gibi)");
      String tipoG = teclado.nextLine();
      teclado.nextLine();
      Produto gibi = new Gibi(titulo, editora, edicao, categoria, preco, quantidade, tipoG);
      this.listaProdutos.add(gibi);
      System.out.println("Gibi adicionado com sucesso!");

    } else if (tipo.equals("Livro")) {
      System.out.println("Número de páginas: ");
      int npag = teclado.nextInt();
      teclado.nextLine();
      System.out.println("Tipo de capa: (Ex.: Dura, Brochura)");
      String capa = teclado.nextLine();
      teclado.nextLine();
      Produto livro = new Livro(titulo, editora, edicao, categoria, preco, quantidade, npag, capa);
      this.listaProdutos.add(livro);
      System.out.println("Livro adicionado com sucesso!");
    }
  }

}
