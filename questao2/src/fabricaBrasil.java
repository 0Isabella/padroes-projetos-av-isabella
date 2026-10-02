public class fabricaBrasil implements IFabrica{

    @Override
    public IComprovanteFiscal criarComprovante() {
        return new comprovanteBrasil(300);
    }

    @Override
    public IPagamento criarPagamento() {
        return new pagamentoBrasil();
    }

    @Override
    public ITermo criarTermo() {
        return new TermoBrasil();
    } 
    
    @Override 
    public String relatorio(){
        return "RELATÓRIO"
        + this.criarComprovante()
        + this.criarPagamento()
        + this.criarTermo();
    }
}
