package Ambiente;

public class Solicitacao {
    public String nome;
    public String provedor;
    public int qtdMaquinas;
    public int gb;

    public Solicitacao(String nome, String provedor, int qtdMaquinas, int gb) {
        this.nome = nome;
        this.provedor = provedor;
        this.qtdMaquinas = qtdMaquinas;
        this.gb = gb;
    }
}
