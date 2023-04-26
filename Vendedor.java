public class Vendedor extends Pessoa {

    private float comissao;

    public float getComissao() {
        return comissao;
    }

    public void setComissao(float comissao) {
        this.comissao = comissao;
    }

    public Vendedor(String nome, String cpf) {
        super(nome, cpf);
        this.nome = nome;
        this.cpf = cpf;
    }

    @Override
    public float calcComissao(float valorVenda) {
        this.setComissao(valorVenda * 0.02f);
        return comissao;
    }

}