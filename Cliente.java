import java.util.List;
import java.util.ArrayList;

public class Cliente extends Pessoa {

    private double creditos;
    private ArrayList<String> prodcomp;

    private float valor;
    private Produto produto;

    public Cliente(String nome, int cpf) {
        super(nome, cpf);
        this.creditos = 0;
        this.prodcomp = new ArrayList<String>();
    }

    public ArrayList<String> getProdComp() {
        return prodcomp;
    }

    public void addCredito(Acoes acoes, double valor) {

        this.creditos += valor;
        acoes.addCredito(this.valor);
    }

    public void gastarCredito(Acoes acoes, double valor) {

        if (valor <= this.creditos) {
            this.creditos -= valor;
            acoes.gastarCredito(this.valor);
        } else {
            System.out.println("Saldo insuficiente!!!");
        }
    }

    public void adcProd(Acoes acoes, Produto produto) {

        this.prodcomp.add(produto);
        acoes.adcProd(this.produto);
    }

    public void removerProd(Acoes acoes, Estoque produto) {

        this.prodcomp.remove(produto);
        acoes.removerProd(this.produto);
    }

    public double getCreditos() {
        return creditos;
    }

    public void setCreditos(double creditos) {
        this.creditos = creditos;
    }

}
