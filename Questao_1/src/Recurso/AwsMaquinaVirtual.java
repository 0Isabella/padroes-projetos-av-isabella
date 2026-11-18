package Recurso;

public class AwsMaquinaVirtual implements IMaquinaVirtual {
    public static double custohora = 0.10;
    public String id;

    public AwsMaquinaVirtual(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public double custoMensal() {
        return custohora * 730;
    }
}
