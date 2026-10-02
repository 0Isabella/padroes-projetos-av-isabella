public class pagamentoBrasil implements IPagamento{
    
    @Override
    public String gerar() {
        return "Pagamento: Pix";
    }
}
