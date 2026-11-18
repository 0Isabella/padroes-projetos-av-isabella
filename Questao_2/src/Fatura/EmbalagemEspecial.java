package Fatura;

public class EmbalagemEspecial extends ServicoAdicional {
    public EmbalagemEspecial(ItemFatura interno) {
        super(interno);
    }

    public String descricao() {
        return interno.descricao() + "\\n- Embalagem especial: R$ 180.0";
    }

    public double total() {
        return interno.total() + 180;
    }
}
