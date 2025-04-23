package edu.modelagemIphone;

public interface AparelhoTelefonico {
    void fazerLigacao(String numero);
    void atenderChamada();
    void desligarChamada();
    void iniciarCorreioVoz();
    void selecionarContato(String contato);
    void criarContato(String numero, String contato);
    void deletarContato(String contato);
}
