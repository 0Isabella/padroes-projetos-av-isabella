package Fatura;

public class Fatura {
    public void imprimir(ItemFatura item) {
        System.out.println("\\nFatura do comprador");
        System.out.println(item.descricao());
        System.out.println("Total a pagar: R$ " + item.total());
    }
}
