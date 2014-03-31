/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.trtgames.basico;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 *
 * @author nenodias
 */
public class TesteEntrada {
    public static void main(String[] args) throws IOException{
        InputStream bytes = new FileInputStream("/home/nenodias/Arquivos/arquivo.txt");//Passando oCaminho do Arquivo
        InputStreamReader caracteres = new InputStreamReader(bytes);
        try(BufferedReader leitor = new BufferedReader(caracteres)){
            String s = leitor.readLine();//Primeira Linha

            while(s != null){
                System.out.println(s);
                s = leitor.readLine();
            }
        }
    }
}
