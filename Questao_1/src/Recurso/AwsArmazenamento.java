package Recurso;

public class AwsArmazenamento implements IArmazenamento {
    public static double custogb = 0.023;
    public String id;
    public int gb;

    public AwsArmazenamento(String id, int gb) {
        this.id = id;
        this.gb = gb;
    }

    public String getId() {
        return id;
    }

    public double custoMensal() {
        return gb * custogb;
    }
}
