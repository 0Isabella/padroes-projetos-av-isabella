package Comissao;

public class ComissaoArte implements RegraComissao {
    public double calcular(double valorVenda) {
        return valorVenda * 0.20;
    }
}
