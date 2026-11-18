package Recurso;

public class AzureMaquinaVirtual implements IMaquinaVirtual {
    public static double custohora = 0.12;
    public String id;

    public AzureMaquinaVirtual(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public double custoMensal() {
        return custohora * 730;
    }
}
