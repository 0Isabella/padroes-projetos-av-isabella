public abstract class absFabricaFrete {

    public String cliente;
    public double carga;

    public absFabricaFrete (String cliente, double carga){
        this.cliente = cliente;
        this.carga = carga;
    }
    public abstract IFrete gerarFrete();

    public void emitirFrete() {
        IFrete apolice = gerarFrete();
        apolice.imprimirResumo();
    }

}