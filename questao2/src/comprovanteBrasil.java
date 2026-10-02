public class comprovanteBrasil implements IComprovanteFiscal{

    public double iss;

    public comprovanteBrasil(double iss) {
        this.iss = iss;
    }    

    @Override 
    public String gerar(){
        return "Comprovante NFS-e, ISS de " + this.iss * 5/100;
    }
}    
