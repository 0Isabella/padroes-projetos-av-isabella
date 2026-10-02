public class FreteAereo implements IFrete {

    public String cliente;
    public double carga;

    public FreteAereo (String cliente, double carga){
        this.cliente = cliente;
        this.carga = carga;
    }

    @Override
    public double calcularFrete() {
        return this.carga * 2/100;
    }

    @Override
    public String imprimirResumo() {
        return "+- RESUMO FRETE AÉREO -+"
        + "Modalidade: Aéreo" 
        + "Nome do Cliente: " + this.cliente
        + "Valor do frete " + calcularFrete()
        + "Documentos exigidos: BL (Bill of Lading) e fatura comercial";
    }
}
