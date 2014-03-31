/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.trtgames.basico;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

/**
 *
 * @author nenodias
 */
public class TesteSaida {
    public static void main(String[] args) throws IOException{
        OutputStream bytes = new FileOutputStream("/home/nenodias/Arquivos/arquivo.txt");//Arquivo onde irá gravar, referência à ele
        OutputStreamWriter escreveCaractere = new OutputStreamWriter(bytes);
        try(BufferedWriter escritor = new BufferedWriter(escreveCaractere)){
            escritor.write("Teste");

            escritor.close();
        }
    }   
}
