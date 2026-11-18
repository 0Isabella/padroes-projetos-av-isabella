package Fatura;

public abstract class ServicoAdicional implements ItemFatura {
    public ItemFatura interno;

    public ServicoAdicional(ItemFatura interno) {
        this.interno = interno;
    }

    public double valorVenda() {
        return interno.valorVenda();
    }
}
