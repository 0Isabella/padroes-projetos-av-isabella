public interface IFabrica {

    public IComprovanteFiscal criarComprovante();
    public IPagamento criarPagamento();
    public ITermo criarTermo();
    public String relatorio();
}
