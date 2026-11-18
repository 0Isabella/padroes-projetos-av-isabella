package Ambiente;

import Recurso.IRecurso;
import java.util.ArrayList;
import java.util.List;

public class Ambiente {
    public String nome;
    public String provedor;
    public List<IRecurso> recursos = new ArrayList<>();

    public Ambiente(String nome, String provedor) {
        this.nome = nome;
        this.provedor = provedor;
    }

    public double custoMensal() {
        double total = 0;
        for (IRecurso r : recursos) {
            total += r.custoMensal();
        }
        return total;
    }

    public String resumo(String regiao) {
        String s = "Ambiente: " + nome + "\nProvedor: " + provedor + "\nRegiao: " + regiao + "\n";
        for (IRecurso r : recursos) {
            s += "Recurso: " + r.getId() + "\n";
        }
        return s + "Custo mensal: R$ " + String.format("%.2f", custoMensal()) + "\n";
    }
}
