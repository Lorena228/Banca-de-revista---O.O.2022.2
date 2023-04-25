import java.util.List;
import java.util.ArrayList;

public class Cliente extends Pessoa {

    private float creditos;
    private ArrayList<Produto> prodcomp;

    public Cliente(String nome, String cpf) {
        super(nome, cpf);
        this.creditos = 0;
        this.prodcomp = new ArrayList<Produto>();
    }

    public ArrayList<Produto> getProdComp() {
        return prodcomp;
    }

    @Override
    public void addCredito(float valor) {
        this.creditos += valor;
    }

    public void gastarCredito(float valor) {
        this.creditos -= valor;
    }

    public void adcProd(Produto produto) {
        this.prodcomp.add(produto);
    }

    public void removerProd(String nomeProduto) {
        for (int i = 0; i <= prodcomp.size(); i++) {
            if (prodcomp.get(i).getTitulo() == nomeProduto) {
                this.prodcomp.remove(i);
            }
        }
    }

    public float getCreditos() {
        return creditos;
    }

    public void setCreditos(float creditos) {
        this.creditos = creditos;
    }

}
