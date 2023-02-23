package br.com.trtgames.sockets;

import java.io.InputStream;
import java.util.Scanner;

public class Recebedor implements Runnable {
    private InputStream servidor;

    public Recebedor(InputStream servidor) {
        this.servidor = servidor;
    }

    public void run() {
        //Recebe mensagens do servidor e imprime na tela
        Scanner s = new Scanner(servidor);
        while (s.hasNextLine()) {
            System.out.println(s.nextLine());
        }
    }
}
