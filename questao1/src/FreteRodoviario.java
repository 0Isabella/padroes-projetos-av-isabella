public class FreteRodoviario implements IFrete{

    public String cliente;
    public double carga;

    public FreteRodoviario (String cliente, double carga){
        this.cliente = cliente;
        this.carga = carga;
    }

    @Override
    public double calcularFrete() {
        return this.carga * 6/100;
    }

    @Override
    public String imprimirResumo() {
        return "+- RESUMO FRETE RODOVIÁRIO -+"
        + "Modalidade: Rodoviário" 
        + "Nome do Cliente: " + this.cliente
        + "Valor do frete " + calcularFrete()
        + "Documentos exigidos: Documentos exigidos: CT-e e MDF-e";
    }
}

