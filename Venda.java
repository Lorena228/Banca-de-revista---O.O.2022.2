import java.util.ArrayList;

public class Venda implements InterfaceVender {

  private Produto prodVendido;
  private float desconto;
  private Vendedor vendedor;
  private Cliente cliente;
  private float precoTotal;
  private Estoque estoque = new Estoque();
  private ArrayList<Venda> vendapopular;

  public Venda(Produto p, Vendedor vendedor, float desconto, Cliente cliente) {

    if (verificarTitulo(p.titulo)) {
      this.prodVendido = p;
      this.vendedor = vendedor;
      this.cliente = cliente;
      this.desconto = desconto;
    }

  }

  @Override
  public void realizarVenda() {
    if ((this.cliente.getCreditos() - this.precoTotal) >= 0) {
      cliente.gastarCredito(precoTotal - (precoTotal * desconto));
      this.vendedor.setComissao(this.precoTotal * 0.02f);
      this.descntEstoque();
    } else {
      System.out.println("Saldo insuficiente!!");
    }
  }

  @Override
  public void atualizarPreco(float novoValor) {
    this.precoTotal = novoValor;
  }

  @Override
  public void descntEstoque() {
    for (int i = 0; i <= estoque.listaProdutos.size(); i++) {
      if (estoque.listaProdutos.get(i).getTitulo() == prodVendido.getTitulo()) {
        estoque.listaProdutos.get(i).setQuantidade(estoque.listaProdutos.get(i).getQuantidade() - 1);
      }
    }
  }

  public Produto getProdVendido() {
    return prodVendido;
  }

  public void setProdVendido(Produto prodVendido) {
    this.prodVendido = prodVendido;
  }

  public float getDesconto() {
    return desconto;
  }

  public void setDesconto(float desconto) {
    this.desconto = desconto;
  }

  public Pessoa getVendedor() {
    return vendedor;
  }

  public void setVendedor(Vendedor vendedor) {
    this.vendedor = vendedor;
  }

  public Pessoa getCliente() {
    return cliente;
  }

  public void setCliente(Cliente cliente) {
    this.cliente = cliente;
  }

  public float getPrecoTotal() {
    return precoTotal;
  }

  public void setPrecoTotal(float precoTotal) {
    this.precoTotal = precoTotal;
  }

  public void AdcVenda(ArrayList<Venda> vendapopular) {
    this.vendapopular = vendapopular;
  }

}
