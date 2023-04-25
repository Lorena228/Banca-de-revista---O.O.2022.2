public class Venda implements InterfaceVender {

  private String prodVendido;
  private float desconto;
  private Vendedor vendedor;
  private Cliente cliente;
  private float precoTotal;
  private Estoque estoque;

  public Venda(String prodVendido, float desconto, Vendedor vendedor, Cliente cliente, float precoTotal,
      Estoque estoque) {
    this.prodVendido = prodVendido;
    this.vendedor = vendedor;
    this.cliente = cliente;
    this.precoTotal = precoTotal;
    this.estoque = estoque;
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
      if (estoque.listaProdutos.get(i).getTitulo() == prodVendido) {
        estoque.listaProdutos.get(i).setQuantidade(estoque.listaProdutos.get(i).getQuantidade() - 1);
      }
    }
  }

  public String getProdVendido() {
    return prodVendido;
  }

  public void setProdVendido(String prodVendido) {
    this.prodVendido = prodVendido;
  }

  public float getDesconto() {
    return desconto;
  }

  public void setDesconto(float desconto) {
    this.desconto = desconto;
  }

  public Vendedor getVendedor() {
    return vendedor;
  }

  public void setVendedor(Vendedor vendedor) {
    this.vendedor = vendedor;
  }

  public Cliente getCliente() {
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

}
