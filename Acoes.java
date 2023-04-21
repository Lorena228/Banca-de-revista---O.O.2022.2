public interface Acoes {
    
    public void cadastrarPessoa(Pessoa pessoa);
    public double calcComissao(double valorVenda);
    public void addCredito(double valor);
    public void gastarCredito(double valor);
    public void adcProd(Produto produto);
    public void removerProd(Produto produto);
}
