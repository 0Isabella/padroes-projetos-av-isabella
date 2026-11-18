package Leilao;

public class Participante implements Observador {
    public String nome;

    public Participante(String nome) {
        this.nome = nome;
    }

    public void atualizar(Lote lote, Lance lance) {
        if (lance.participante != this) {
            System.out.println(nome + " recebeu: " + lote.nome + " recebeu lance de R$ " + lance.valor);
        }
    }
}
