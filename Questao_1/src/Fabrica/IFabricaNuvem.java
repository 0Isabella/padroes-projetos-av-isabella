package Fabrica;

import Recurso.*;

public interface IFabricaNuvem {
    String getProvedor();
    IMaquinaVirtual criarMaquinaVirtual();
    IArmazenamento criarArmazenamento(int gb);
    IFila criarFila();
    double custoEstimado(int qtdMaquinas, int gb);
}
