package Fatura;

public class CertificadoAutenticidade extends ServicoAdicional {
    public CertificadoAutenticidade(ItemFatura interno) {
        super(interno);
    }

    public String descricao() {
        return interno.descricao() + "\\n- Certificado de autenticidade: R$ 300.0";
    }

    public double total() {
        return interno.total() + 300;
    }
}
