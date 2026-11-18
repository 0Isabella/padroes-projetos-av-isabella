package Comissao;

public class ComissaoEletronicos implements RegraComissao {
    public double calcular(double valorVenda) {
        return Math.max(valorVenda * 0.12, 50);
    }
}
