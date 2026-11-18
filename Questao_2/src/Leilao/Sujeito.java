package Leilao;

public interface Sujeito {
    void adicionar(Observador observador);
    void remover(Observador observador);
    void notificar(Lance lance);
}
