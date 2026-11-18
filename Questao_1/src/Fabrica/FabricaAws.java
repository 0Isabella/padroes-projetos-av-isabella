package Fabrica;

import Recurso.*;

public class FabricaAws implements IFabricaNuvem {
    public int vm = 0;
    public int arm = 0;
    public int fila = 0;

    public String getProvedor() {
        return "Aws";
    }

    public synchronized IMaquinaVirtual criarMaquinaVirtual() {
        vm++;
        return new AwsMaquinaVirtual("i-" + vm);
    }

    public synchronized IArmazenamento criarArmazenamento(int gb) {
        arm++;
        return new AwsArmazenamento("s3://" + arm, gb);
    }

    public synchronized IFila criarFila() {
        fila++;
        return new AwsFila("sqs-" + fila);
    }

    public double custoEstimado(int qtdMaquinas, int gb) {
        return qtdMaquinas * AwsMaquinaVirtual.custohora * 730 + gb * AwsArmazenamento.custogb + AwsFila.custofixo;
    }
}
