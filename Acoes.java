public interface Acoes {

    public double calcComissao(double valorVenda);

    public void addCredito(double valor);

    public void gastarCredito(double valor);

    public void adcProd(Estoque listaProduto);

    public void removerProd(Estoque listaProduto);
}