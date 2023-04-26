import java.util.ArrayList;

public class Dados implements InterfaceVender {

  ArrayList<Produto> dados = new ArrayList<>();
  ArrayList<Pessoa> dadopessoa = new ArrayList<>();
  ArrayList<Venda> dadovenda = new ArrayList<>();

  public Dados() {
    this.popularDados();
    this.popularPessoas();
    this.popularVenda();
  }

  public ArrayList<Produto> getDados() {
    return dados;
  }

  public ArrayList<Venda> getVenda() {
    return dadovenda;
  }

  public ArrayList<Pessoa> getPessoas() {
    return dadopessoa;
  }

  public ArrayList<Produto> popularDados() {

    Produto revista1 = new Revista("Turismo", "Panini", 5, "Turismo", 12.12f, 0, "lalalalala");
    Produto revista2 = new Revista("Turismo1", "Panini", 5, "Turismo", 12.12f, 0, null);
    Produto revista3 = new Revista("Turismo2", "Panini", 5, "Turismo", 12.12f, 0, null);
    Produto gibi1 = new Gibi(null, null, 0, null, 0, 0, null);
    Produto gibi2 = new Gibi(null, null, 0, null, 0, 0, null);
    Produto gibi3 = new Gibi(null, null, 0, null, 0, 0, null);
    Produto livro1 = new Livro(null, null, 0, null, 0, 0, 0, null);
    Produto livro2 = new Livro(null, null, 0, null, 0, 0, 0, null);
    Produto livro3 = new Livro(null, null, 0, null, 0, 0, 0, null);

    this.dados.add(revista1);
    this.dados.add(revista2);
    this.dados.add(revista3);
    this.dados.add(gibi1);
    this.dados.add(gibi2);
    this.dados.add(gibi3);
    this.dados.add(livro1);
    this.dados.add(livro2);
    this.dados.add(livro3);

    return dados;
  }

  public ArrayList<Pessoa> popularPessoas() {
    Pessoa vendedor1 = new Vendedor("Marco", "111.111.111-12");
    this.dadopessoa.add(vendedor1);
    Pessoa cliente1 = new Cliente("Lorena", "123.123.123-88");
    this.dadopessoa.add(cliente1);
    return dadopessoa;
  }

  public void popularVenda(ArrayList<Venda> novaVenda) {
    this.dadovenda = novaVenda;
  }

  @Override
  public void atualizarPreco(float novoValor) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'atualizarPreco'");
  }

  @Override
  public void descntEstoque() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'descntEstoque'");
  }

  @Override
  public void realizarVenda() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'realizarVenda'");
  }

  // Verificar se existe um produto com este titulo
  public boolean verificarTitulo(String titulo) {
    boolean state = false;

    for (int i = 0; i < this.dados.size(); i++) {
      if (titulo == this.dados.get(i).titulo) {
        state = true;
      }
    }

    return state;
  }

}