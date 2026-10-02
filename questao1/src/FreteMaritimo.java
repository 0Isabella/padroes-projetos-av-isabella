public class FreteMaritimo implements IFrete{
    
    public String cliente;
    public double carga;

    public FreteMaritimo (String cliente, double carga){
        this.cliente = cliente;
        this.carga = carga;
    }

    @Override
    public double calcularFrete() {
        return this.carga * 1/100;
    }

    @Override
    public String imprimirResumo() {
        return "+- RESUMO FRETE RODOVIÁRIO -+"
        + "Modalidade: Rodoviário" 
        + "Nome do Cliente: " + this.cliente
        + "Valor do frete " + calcularFrete()
        + "Documentos exigidos: Documentos exigidos: CT-e e MDF-eBL (Bill of Lading) e fatura comercial";
    }
}