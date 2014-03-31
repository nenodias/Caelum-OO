/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.trtgames.basico;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

/**
 *
 * @author nenodias
 */
public class TesteEntradaScanner {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner s = new Scanner(System.in);//Scanner direcionado à entrada de dados (teclado)
        PrintStream leitor = new PrintStream("/home/nenodias/Arquivos/arquivo.txt");
        while(s.hasNextLine()){
            if("exit".equals(s.nextLine())) {
                break;
            }
            leitor.println(s.nextLine());//Printa ou escreve no arquivo.txt
        }
    }
}
