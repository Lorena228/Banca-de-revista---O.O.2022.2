public class Venda implements InterfaceVender {

  private String prodVendido;
  private float desconto;
  private String vendedor;
  private String cliente;
  private float precoTotal;

  @Override
  public void venda() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'venda'");
  }

  @Override
  public void atualizarPreco() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'atualizarPreco'");
  }

  @Override
  public void calcDesconto() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'calcDesconto'");
  }

  @Override
  public void descntEstoque() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'descntEstoque'");
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

  public String getVendedor() {
    return vendedor;
  }

  public void setVendedor(String vendedor) {
    this.vendedor = vendedor;
  }

  public String getCliente() {
    return cliente;
  }

  public void setCliente(String cliente) {
    this.cliente = cliente;
  }

  public float getPrecoTotal() {
    return precoTotal;
  }

  public void setPrecoTotal(float precoTotal) {
    this.precoTotal = precoTotal;
  }

}
