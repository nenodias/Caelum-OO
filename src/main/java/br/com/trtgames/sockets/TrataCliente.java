/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.trtgames.sockets;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

/**
 *
 * @author nenodias
 */
public class TrataCliente implements Runnable{
    private InputStream cliente;
    private Servidor servidor;
    public TrataCliente(InputStream c,Servidor s) {
        cliente = c;
        servidor = s;
    }

    @Override
    public void run() {
        Scanner teclado = new Scanner(cliente);

        while(teclado.hasNextLine()){
            servidor.distribuiMensagem(teclado.nextLine());
        }
        
        teclado.close();
    } 
}
