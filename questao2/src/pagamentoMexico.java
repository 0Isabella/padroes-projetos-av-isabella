public class pagamentoMexico implements IPagamento{
    
    @Override
    public String gerar() {
        return "Pagamento: SPEI";
    }
}
