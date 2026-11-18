package Leilao;

import Comissao.RegraComissao;
import java.util.ArrayList;
import java.util.List;

public class Lote implements Sujeito {
    public String nome;
    public Categoria categoria;
    public double precoInicial;
    public double precoReserva;
    public double lanceAtual;
    public boolean aberto = true;
    public List<Observador> observadores = new ArrayList<>();
    public List<Lance> lances = new ArrayList<>();
    public RegraComissao regra;

    public Lote(String nome, Categoria categoria, double precoInicial, double precoReserva, RegraComissao regra) {
        this.nome = nome;
        this.categoria = categoria;
        this.precoInicial = precoInicial;
        this.precoReserva = precoReserva;
        this.lanceAtual = precoInicial;
        this.regra = regra;
    }

    public void adicionar(Observador observador) {
        observadores.add(observador);
    }

    public void remover(Observador observador) {
        observadores.remove(observador);
    }

    public void notificar(Lance lance) {
        for (Observador o : observadores) {
            o.atualizar(this, lance);
        }
    }

    public void darLance(Participante participante, double valor) {
        if (!aberto) {
            System.out.println("Lote encerrado. Não aceita novos lances.");
            return;
        }

        if (valor < lanceAtual * 1.05) {
            System.out.println("Lance recusado: deve ser pelo menos 5% maior que o lance atual.");
            return;
        }

        Lance lance = new Lance(participante, valor);
        lances.add(lance);
        lanceAtual = valor;
        System.out.println("Lance aceito: " + participante.nome + " - R$ " + valor);
        notificar(lance);
    }

    public void setRegra(RegraComissao regra) {
        this.regra = regra;
    }

    public boolean encerrar() {
        aberto = false;
        if (lances.size() > 0 && lanceAtual >= precoReserva) {
            System.out.println("Lote " + nome + " vendido por R$ " + lanceAtual);
            return true;
        }
        System.out.println("Lote " + nome + " não vendido.");
        return false;
    }

    public double comissao() {
        return regra.calcular(lanceAtual);
    }

    public void acertoVendedor() {
        if (lances.size() > 0 && lanceAtual >= precoReserva) {
            System.out.println("\\nAcerto do vendedor - " + nome);
            System.out.println("Valor de venda: R$ " + lanceAtual);
            System.out.println("Comissão: R$ " + comissao());
            System.out.println("Valor líquido: R$ " + (lanceAtual - comissao()));
        }
    }
}
