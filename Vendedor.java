public class Vendedor extends Pessoa {

    private double comissao;

    public Vendedor (String nome, int cpf, double comissao) {
        super(nome, cpf);
        this.nome = nome;
        this.cpf = cpf;
        this.comissao = comissao
    }
    

}