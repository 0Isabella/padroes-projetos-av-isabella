public class fabricaMexico implements IFabrica {

    @Override
    public IComprovanteFiscal criarComprovante() {
        return new comprovanteMexico(600);
    }

    @Override
    public IPagamento criarPagamento() {
        return new pagamentoMexico();
    }

    @Override
    public ITermo criarTermo() {
        return new TermoMexico();
    }  

    @Override 
    public String relatorio(){
        return "RELATÓRIO"
        + this.criarComprovante()
        + this.criarPagamento()
        + this.criarTermo();
    }
}
