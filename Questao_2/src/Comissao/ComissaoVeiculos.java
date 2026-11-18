package Comissao;

public class ComissaoVeiculos implements RegraComissao {
    public double calcular(double valorVenda) {
        return Math.min(valorVenda * 0.08, 5000);
    }
}
