/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.trtgames.collections;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nenodias
 */
public class DesafioArrayList {
    public static void main(String[] args){
        int max = 1000;
        List<Integer> lista = new ArrayList<>();
        for(int i=0;i<max;i++){
            lista.add(i);
        }
    }
}
