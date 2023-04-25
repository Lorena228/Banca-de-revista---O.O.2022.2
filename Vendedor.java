public class Vendedor extends Pessoa {

    private float comissao;

    public float getComissao() {
        return comissao;
    }

    public void setComissao(float comissao) {
        this.comissao = comissao;
    }

    public Vendedor(String nome, String cpf, float comissao) {
        super(nome, cpf);
        this.nome = nome;
        this.cpf = cpf;
        this.comissao = comissao;
    }

    @Override
    public float calcComissao(float valorVenda) {
        this.setComissao(valorVenda * 0.02f);
        return comissao;
    }

}