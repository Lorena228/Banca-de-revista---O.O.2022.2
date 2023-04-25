public interface Acoes {

    public float calcComissao(float valorVenda);

    public void addCredito(float valor);

    public void gastarCredito(float valor);

    public void adcProd(Estoque listaProduto);

    public void removerProd(Estoque listaProduto);
}