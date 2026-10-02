public class fabricaFreteAereo extends absFabricaFrete {

    public fabricaFreteAereo(String cliente, double carga) {
        super(cliente, carga);
    }


    @Override
    public IFrete gerarFrete() {
        return new FreteAereo(cliente, carga);
    }

    
    public void emitirFrete() {
        IFrete apolice = gerarFrete();
        apolice.imprimirResumo();
    }

    public String imprimirResumo() {
        return "+- RESUMO FRETE AÉREO -+"
        + "Modalidade: Aéreo" 
        + "Nome do Cliente: " + this.cliente
        + "Valor do frete " + this.gerarFrete()
        + "Documentos exigidos: BL (Bill of Lading) e fatura comercial";
    }

}