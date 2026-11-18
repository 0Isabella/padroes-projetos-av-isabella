package Fatura;

import Leilao.Lote;

public class VendaBase implements ItemFatura {
    public Lote lote;
    public double valor;

    public VendaBase(Lote lote, double valor) {
        this.lote = lote;
        this.valor = valor;
    }

    public String descricao() {
        return "Lote: " + lote.nome;
    }

    public double valorVenda() {
        return valor;
    }

    public double total() {
        return valor;
    }
}
