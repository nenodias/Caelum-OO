/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.trtgames.sockets;

import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

/**
 *
 * @author nenodias
 */
public class Cliente {
    
    private String host;
    private int porta;
    
    public Cliente(String host, int porta){
        this.host = host;
        this.porta = porta;
    }
    
    public void executa() throws UnknownHostException, IOException{
        Socket cliente = new Socket(host,porta);
        System.out.println("O cliente se conectou ao servidor!");
        
        //Thread para receber mensagens do servidor
        Recebedor r = new Recebedor(cliente.getInputStream());
        new Thread(r).start();
        
        //Le as mensagens do teclado e manda pro servidor
        Scanner teclado = new Scanner(System.in);
        PrintStream saida = new PrintStream(cliente.getOutputStream());
        while(teclado.hasNextLine()){
            saida.println(teclado.nextLine());
        }
        
        saida.close();
        teclado.close();
        cliente.close();
    }
}
