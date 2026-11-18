package Recurso;

public class AwsFila implements IFila {
    public static double custofixo = 0.40;
    public String id;

    public AwsFila(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public double custoMensal() {
        return custofixo;
    }
}
