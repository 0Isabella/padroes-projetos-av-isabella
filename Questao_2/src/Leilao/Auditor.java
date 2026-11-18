package Leilao;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Auditor implements Observador {
    public List<String> registros = new ArrayList<>();

    public void atualizar(Lote lote, Lance lance) {
        registros.add(LocalDateTime.now() + " | " + lote.nome + " | " + lance.participante.nome + " | R$ " + lance.valor);
        System.out.println("Auditoria: lance registrado.");
    }

    public void imprimir() {
        System.out.println("\\nRegistros do auditor:");
        for (String registro : registros) {
            System.out.println(registro);
        }
    }
}
