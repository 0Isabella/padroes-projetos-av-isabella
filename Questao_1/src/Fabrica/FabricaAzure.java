package Fabrica;

import Recurso.*;

public class FabricaAzure implements IFabricaNuvem {
    public int vm = 0;
    public int arm = 0;
    public int fila = 0;

    public String getProvedor() {
        return "Azure";
    }

    public synchronized IMaquinaVirtual criarMaquinaVirtual() {
        vm++;
        return new AzureMaquinaVirtual("vm-" + vm);
    }

    public synchronized IArmazenamento criarArmazenamento(int gb) {
        arm++;
        return new AzureArmazenamento("blob://" + arm, gb);
    }

    public synchronized IFila criarFila() {
        fila++;
        return new AzureFila("sb-" + fila);
    }

    public double custoEstimado(int qtdMaquinas, int gb) {
        return qtdMaquinas * AzureMaquinaVirtual.custohora * 730 + gb * AzureArmazenamento.custogb + AzureFila.custofixo;
    }
}
