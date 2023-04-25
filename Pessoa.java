public abstract class Pessoa implements Acoes {

    protected String nome;
    protected String cpf;

    public Pessoa(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public void adcProd(Estoque listaProduto) {
        // TODO Auto-generated method stub

    }

    @Override
    public void addCredito(float valor) {
        // TODO Auto-generated method stub

    }

    @Override
    public float calcComissao(float valorVenda) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public void gastarCredito(float valor) {
        // TODO Auto-generated method stub

    }

    @Override
    public void removerProd(Estoque listaProduto) {
        // TODO Auto-generated method stub

    }

}