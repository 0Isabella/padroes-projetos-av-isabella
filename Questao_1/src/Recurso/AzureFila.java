package Recurso;

public class AzureFila implements IFila {
    public static double custofixo = 0.50;
    public String id;

    public AzureFila(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public double custoMensal() {
        return custofixo;
    }
}
