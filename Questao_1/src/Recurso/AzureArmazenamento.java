package Recurso;

public class AzureArmazenamento implements IArmazenamento {
    public static double custogb = 0.02;
    public String id;
    public int gb;

    public AzureArmazenamento(String id, int gb) {
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
