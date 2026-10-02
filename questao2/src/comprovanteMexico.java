public class comprovanteMexico implements IComprovanteFiscal{
    
    public double iva;

    public comprovanteMexico(double iva) {
        this.iva = iva;
    }    

    @Override 
    public String gerar(){
        return "Comprovante CFDI, IVA de " + iva * 16/100;
    }
}
