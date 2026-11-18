package Infra;

import java.time.LocalDateTime;

public class Registro {
    public LocalDateTime dataHora = LocalDateTime.now();
    public String ambiente;
    public String provedor;
    public String resultado;

    public Registro(String ambiente, String provedor, String resultado) {
        this.ambiente = ambiente;
        this.provedor = provedor;
        this.resultado = resultado;
    }

    public String toString() {
        return dataHora + " | " + ambiente + " | " + provedor + " | " + resultado;
    }
}
