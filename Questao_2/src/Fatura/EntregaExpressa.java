package Fatura;

public class EntregaExpressa extends ServicoAdicional {
    public EntregaExpressa(ItemFatura interno) {
        super(interno);
    }

    public String descricao() {
        return interno.descricao() + "\\n- Entrega expressa: R$ 450.0";
    }

    public double total() {
        return interno.total() + 450;
    }
}
