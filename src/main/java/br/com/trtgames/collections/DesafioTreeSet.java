/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.trtgames.collections;

import java.util.Comparator;
import java.util.TreeSet;

/**
 *
 * @author nenodias
 */
public class DesafioTreeSet {
    public static void main(String[] args){
        int max = 1000;
        //Criando o Comparator para Mudar a ordem desse Set
        Comparator<Integer> c = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if(o1>o2){
                    return -1;
                }else if(o1<o2){
                    return 1;
                }
                return 0;
            }
        };
        //Criando o Set com um outro parâmetro de ordenação
        TreeSet<Integer> set = new TreeSet<>(c);
        
        for(int i=0;i < max;i++){
            set.add(i);
        }
        
        for(int x:set){
            System.out.println(x);
        }
    }
}
