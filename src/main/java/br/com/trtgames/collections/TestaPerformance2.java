/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.trtgames.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author nenodias
 */
public class TestaPerformance2 {
    public static void main(String[] args){
        System.out.println("Iniciando...");
        long inicio = System.currentTimeMillis();//Pega o tempo que a aplicação começou
        List<Integer> teste = new ArrayList<>();//Mais rápido utilizando get(index)
        List<Integer> teste1 = new LinkedList<>();//Mais rápido utilizando o iterator com for enhanced
        int total = 100000;
        
        for(int i=0;i<total;i++){
            teste.add(i);
        }
        for(int i=0;i<teste.size();i++){
            teste.get(i);
        }
//        for(Integer x:teste){
//            x.byteValue();
//        }
        
        long fimInsert = System.currentTimeMillis();
        
        for(int i = 0;i<total;i++){
            teste1.add(i);
        }
//        for(Integer x:teste1){
//            x.byteValue();
//        }
        for(int i=0;i<teste1.size();i++){
            teste1.get(i);
        }
        
        long fim = System.currentTimeMillis();
        
        long tempo = fim - inicio;
        long tempoInsert = fimInsert - inicio;
        long tempoBuscas = fim - fimInsert ;
        
        System.out.println("Tempo gasto Total: "+tempo);
        System.out.println("Tempo gasto na ArrayList: "+ tempoInsert);
        System.out.println("Tempo gasto no LinkedList: "+tempoBuscas);
    }
}
