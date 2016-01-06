package br.com.trtgames.sockets;

import java.io.IOException;
import java.net.UnknownHostException;

public class ExecutaCliente {

	public static void main(String[] args) throws UnknownHostException, IOException {
        //Dispara cliente
        int porta = 12345;
        new Cliente ("127.0.0.1", porta).executa();
    }
	
}
