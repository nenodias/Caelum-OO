package br.com.trtgames.model;

@SuppressWarnings("serial")
public class EstouroDeLimite extends RuntimeException {
    EstouroDeLimite(String mensagem) {
        super(mensagem);
    }
}
