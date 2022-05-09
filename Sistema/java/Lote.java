package Sistema.java;

public class Lote {

    private String ID;
    private Produto produtos;
    private int quantidade;

    public Lote(Produto produtos, int quantidade) {
        this.produtos = produtos;
        this.quantidade = quantidade;
        this.ID = "11" + produtos.getNome() + "11";
    }

    public String toString() {
        return ("Nome do Produto: " + produtos.getNome() + " | Quantidade: " + quantidade + " | ID: " + ID);
    }
}
