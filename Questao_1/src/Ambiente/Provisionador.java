package Ambiente;

import Fabrica.IFabricaNuvem;
import Infra.Configuracao;
import Infra.HistoricoAuditoria;
import Infra.Registro;

public class Provisionador {
    public IFabricaNuvem fabrica;

    public Provisionador(IFabricaNuvem fabrica) {
        this.fabrica = fabrica;
    }

    public Ambiente provisionar(Solicitacao s) {
        Configuracao config = Configuracao.getInstance();
        HistoricoAuditoria historico = HistoricoAuditoria.getInstance();
        double custo = fabrica.custoEstimado(s.qtdMaquinas, s.gb);

        if (custo > config.orcamento) {
            historico.registrar(new Registro(s.nome, fabrica.getProvedor(), "RECUSADO: acima do orcamento"));
            System.out.println(s.nome + " recusado\n");
            return null;
        }

        Ambiente ambiente = new Ambiente(s.nome, fabrica.getProvedor());
        for (int i = 0; i < s.qtdMaquinas; i++) {
            ambiente.recursos.add(fabrica.criarMaquinaVirtual());
        }
        ambiente.recursos.add(fabrica.criarArmazenamento(s.gb));
        ambiente.recursos.add(fabrica.criarFila());

        historico.registrar(new Registro(s.nome, fabrica.getProvedor(), "ACEITO"));
        System.out.println(ambiente.resumo(config.regiao));
        return ambiente;
    }
}
