package br.com.trtgames.sockets;

import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class Servidor {
    private int porta;
    private List<PrintStream> clientes;

    public Servidor(int porta) {
        this.porta = porta;
        this.clientes = new ArrayList<PrintStream>();
    }

    public void executa() throws IOException {
        ServerSocket servidor = new ServerSocket(porta);
        System.out.println("Porta " + porta + " foi aberta!!!");

        while (true) {
            //Aceita um cliente
            Socket cliente = servidor.accept();
            System.out.println("Nova conexão com o cliente "
                    + cliente.getInetAddress().getHostAddress());

            //Adiciona a saída do cliente à lista
            PrintStream ps = new PrintStream(cliente.getOutputStream());
            clientes.add(ps);

            //Cria um tratador de cliente numa nova thread
            TrataCliente tc = new TrataCliente(cliente.getInputStream(), this);
            new Thread(tc).start();
        }
    }

    public void distribuiMensagem(String msg) {
        //Envia mensagem para todo mundo
        for (PrintStream cliente : clientes) {
            cliente.println(msg);
        }
    }
}
