package br.com.trtgames.sockets;

import java.io.IOException;
import java.net.UnknownHostException;

public class ExecutaServidor {

	public static void main(String[] args) throws UnknownHostException, IOException {
        //Dispara cliente
        int porta = 12345;
        new Servidor(porta).executa();
    }
	
}
