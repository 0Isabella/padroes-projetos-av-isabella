import Leilao.*;
import Comissao.*;
import Fatura.*;

public class Main {
    public static void main(String[] args) {
        Participante ana = new Participante("Ana");
        Participante bruno = new Participante("Bruno");
        Participante carla = new Participante("Carla");

        PainelLeiloeiro painel = new PainelLeiloeiro();
        Auditor auditor = new Auditor();

        Lote quadro = new Lote("Quadro antigo", Categoria.ARTE, 1000, 1500, new ComissaoArte());
        Lote carro = new Lote("Carro", Categoria.VEICULOS, 10000, 20000, new ComissaoVeiculos());

        quadro.adicionar(ana);
        quadro.adicionar(bruno);
        quadro.adicionar(carla);
        quadro.adicionar(painel);
        quadro.adicionar(auditor);

        carro.adicionar(ana);
        carro.adicionar(bruno);
        carro.adicionar(carla);
        carro.adicionar(painel);
        carro.adicionar(auditor);

        quadro.darLance(ana, 1100);
        quadro.darLance(bruno, 1200);
        quadro.darLance(carla, 1250);
        quadro.remover(bruno);
        quadro.darLance(carla, 1600);

        carro.darLance(bruno, 15000);
        carro.darLance(ana, 16000);

        quadro.setRegra(new ComissaoEletronicos());

        boolean quadroVendido = quadro.encerrar();
        boolean carroVendido = carro.encerrar();

        if (quadroVendido) {
            ItemFatura fatura = new VendaBase(quadro, quadro.lanceAtual);
            fatura = new SeguroTransporte(fatura);
            fatura = new CertificadoAutenticidade(fatura);
            fatura = new EmbalagemEspecial(fatura);
            fatura = new SeguroTransporte(fatura);
            new Fatura().imprimir(fatura);
            quadro.acertoVendedor();
        }

        if (carroVendido) {
            carro.acertoVendedor();
        }

        auditor.imprimir();
    }
}
