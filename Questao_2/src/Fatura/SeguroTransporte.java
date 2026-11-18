package Fatura;

public class SeguroTransporte extends ServicoAdicional {
    public SeguroTransporte(ItemFatura interno) {
        super(interno);
    }

    public String descricao() {
        return interno.descricao() + "\\n- Seguro de transporte: R$ " + (interno.valorVenda() * 0.015);
    }

    public double total() {
        return interno.total() + (interno.valorVenda() * 0.015);
    }
}
