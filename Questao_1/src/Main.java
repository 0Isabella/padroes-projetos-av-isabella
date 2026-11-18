import Ambiente.Provisionador;
import Ambiente.Solicitacao;
import Fabrica.FabricaAws;
import Fabrica.FabricaAzure;
import Infra.HistoricoAuditoria;

public class Main {
    public static void main(String[] args) throws Exception {
        Provisionador aws = new Provisionador(new FabricaAws());
        Provisionador azure = new Provisionador(new FabricaAzure());

        Thread t1 = new Thread(() -> aws.provisionar(new Solicitacao("ambiente-1", "Aws", 2, 100)));
        Thread t2 = new Thread(() -> aws.provisionar(new Solicitacao("ambiente-2", "Aws", 1, 50)));
        Thread t3 = new Thread(() -> azure.provisionar(new Solicitacao("ambiente-3", "Azure", 1, 50)));
        Thread t4 = new Thread(() -> aws.provisionar(new Solicitacao("ambiente-4", "Aws", 10, 500)));

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t1.join();
        t2.join();
        t3.join();
        t4.join();

        System.out.println("Historico:");
        HistoricoAuditoria.getInstance().imprimir();
    }
}
