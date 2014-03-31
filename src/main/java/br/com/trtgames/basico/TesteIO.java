/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.trtgames.basico;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author nenodias
 */
public class TesteIO {
    public static void main(String[] args){
        try {
            FileReader leitorParcial = new FileReader("/home/nenodias/Arquivos/arquivo.txt");//Ler
            FileWriter gravadorParcial = new FileWriter("/home/nenodias/Arquivos/arquivo1.txt", true);//Gravar
            BufferedReader leitor = new BufferedReader(leitorParcial);
            BufferedWriter gravador = new BufferedWriter(gravadorParcial);
            String content="";
//            do{
//              if(!"".equals(content)){
//                gravador.write( content );//Gravando no arquivo1.txt
//              }
//            }while( ( content = leitor.readLine() ) != null);
//            gravador.flush();//Commita as alterações
            do{
              if(!"".equals(content)){
                System.out.println( content );//Exibindo a leitura do arquivo.txt
              }
            }while( ( content = leitor.readLine() ) != null);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(TesteIO.class.getName()).log(Level.SEVERE, null, ex);
        }catch (IOException ex) {
            Logger.getLogger(TesteIO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
