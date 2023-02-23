package br.com.trtgames.sockets;

import java.io.InputStream;
import java.util.Scanner;

public class TrataCliente implements Runnable {
    private InputStream cliente;
    private Servidor servidor;

    public TrataCliente(InputStream c, Servidor s) {
        cliente = c;
        servidor = s;
    }

    @Override
    public void run() {
        Scanner teclado = new Scanner(cliente);

        while (teclado.hasNextLine()) {
            servidor.distribuiMensagem(teclado.nextLine());
        }

        teclado.close();
    }
}
