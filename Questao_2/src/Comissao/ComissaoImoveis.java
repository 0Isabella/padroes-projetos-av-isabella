package Comissao;

public class ComissaoImoveis implements RegraComissao {
    public double calcular(double valorVenda) {
        return valorVenda * 0.03 + 1500;
    }
}
