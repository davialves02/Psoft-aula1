package Sistema.java;

public class Produto {

    private String ID;
    private String nome;
    private String fabricante;

    public Produto(String nome, String fabricante) {
        this.nome = nome;
        this.fabricante = fabricante;
        this.ID = "00" + nome + "00";
    }

    public String toString() {
        return ("Nome: " + nome + " | Fabricante: " + fabricante + " | ID: " + ID);
    }

    public String getNome() {
        return nome;
    }

}
