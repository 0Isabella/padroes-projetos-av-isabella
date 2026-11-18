package Infra;

import java.util.ArrayList;
import java.util.List;

public class HistoricoAuditoria {
    private static HistoricoAuditoria instancia = new HistoricoAuditoria();
    public List<Registro> registros = new ArrayList<>();

    private HistoricoAuditoria() {
    }

    public static HistoricoAuditoria getInstance() {
        return instancia;
    }

    public synchronized void registrar(Registro r) {
        registros.add(r);
    }

    public synchronized void imprimir() {
        for (Registro r : registros) {
            System.out.println(r);
        }
    }
}
