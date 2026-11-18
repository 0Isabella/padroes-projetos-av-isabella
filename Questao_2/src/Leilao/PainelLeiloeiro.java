package Leilao;

public class PainelLeiloeiro implements Observador {
    public double maiorLance = 0;
    public int totalLances = 0;

    public void atualizar(Lote lote, Lance lance) {
        maiorLance = lance.valor;
        totalLances++;
        System.out.println("Painel: maior lance R$ " + maiorLance + " | Total de lances: " + totalLances);
    }
}
