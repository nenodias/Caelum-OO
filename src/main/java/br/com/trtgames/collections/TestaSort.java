/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.trtgames.collections;

import br.com.trtgames.model.Cliente;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author nenodias
 */
public class TestaSort {
    public static void main(String[] args){
        //Implementei na classe br.com.trtgames.model.Cliente a inteface Comparable
        // Ou seja a classe é comparável para ordenação
        Cliente c = new Cliente("José",new Long("00000100100"));//OBS se vc colocar somente 1 e 0
        Cliente c1 = new Cliente("Juca",new Long("01000100010"));//O construtor interpreta como binário
        //Nesse caso é necessário usar aspas
        
        List<Cliente> lista = new ArrayList<>();
        lista.add(c);
        lista.add(c1);
        /*O Sort irá usar o método compareTo em cada elemento da lista para fazer a reordenação  */
        //Collections.sort(lista);//Classe Collections usa o método estático sort para ordenar a lista
        
        //Collections.sort(lista, new Comparator<Cliente>());//Para fazer um sort em tempo de execução
        //O quickfix da IDE vai mandar implementar os métodos do Camparator
        
        Collections.sort(lista, new Comparator<Cliente>() {//Criando a comparação em tempo de execução
            //Podendo fazer alternativas de ordenação
            @Override
            public int compare(Cliente o1, Cliente o2) {
                if(o1.getCpf()<o2.getCpf()){
                    return 1;
                }else if(o1.getCpf()>o2.getCpf()){
                    return -1;
                }
                return 0;
            }
        });
        
        System.out.println(lista);//Como a Classe Cliente implementa a interface Comparable não há nenhum problema
    }
}
