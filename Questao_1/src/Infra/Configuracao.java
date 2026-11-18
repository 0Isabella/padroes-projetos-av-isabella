package Infra;

public class Configuracao {
    private static Configuracao instancia = new Configuracao();
    public String regiao = "sa-east-1";
    public double orcamento = 500;

    private Configuracao() {
    }

    public static Configuracao getInstance() {
        return instancia;
    }
}