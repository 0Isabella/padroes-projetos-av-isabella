public class Assinatura {
    public static void main(String[] args) {
        
                IFabrica fabrica1 = new fabricaBrasil();
                IComprovanteFiscal comprovante1 = new comprovanteBrasil(6);
                IPagamento pagamento1 = new pagamentoBrasil();
                ITermo termo1 = new TermoBrasil();

                System.out.println("\nRELATÓRIO");
                System.out.println("Comprovante: " + comprovante1);
                System.out.println("Pagamento: " + pagamento1);
                System.out.println("Termo: " + termo1);

                fabrica1.relatorio();
    }
}