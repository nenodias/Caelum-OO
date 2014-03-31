/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.trtgames.collections;

import java.util.Collection;
import java.util.HashSet;
import java.util.ArrayList;

/**
 *
 * @author nenodias
 */
public class TestaPerformance {
    public static void main(String[] args){
        System.out.println("Iniciando...");
        long inicio = System.currentTimeMillis();//Pega o tempo que a aplicação começou
        Collection<Integer> teste = new ArrayList<>();
        int total = 100000;
        
        for(int i=0;i<total;i++){
            teste.add(i);
        }
        long fimInsert = System.currentTimeMillis();
        for(int i = 0;i<total;i++){
            teste.contains(i);
        }
        
        long fim = System.currentTimeMillis();
        long tempo = fim - inicio;
        long tempoInsert = fimInsert - inicio;
        long tempoBuscas = fim - fimInsert ;
        System.out.println("Tempo gasto Total: "+tempo);
        System.out.println("Tempo gasto na Inserção: "+ tempoInsert);
        System.out.println("Tempo gasto nas Buscas: "+tempoBuscas);
    }
}
