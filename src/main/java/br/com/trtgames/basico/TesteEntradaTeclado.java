/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.trtgames.basico;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 *
 * @author nenodias
 */
public class TesteEntradaTeclado {
    public static void main(String[] args) throws IOException{
        InputStream bytes = System.in;
        InputStreamReader caracteres = new InputStreamReader(bytes); 
        try(BufferedReader leitor = new BufferedReader(caracteres)){
            String s = leitor.readLine();

            while(s != null){
                if("exit".equals(s)) {
                    break;
                }
                System.out.println(s);
                s = leitor.readLine();
            }
        }
    }
}
