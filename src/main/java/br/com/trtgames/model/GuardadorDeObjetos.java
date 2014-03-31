/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.trtgames.model;

/**
 *
 * @author nenodias
 */
public class GuardadorDeObjetos {
    private Object[] arrayDeObjetos = new Object[100];
    private int posicao;
    
    public void adicionaObjeto(Object objeto){
        arrayDeObjetos[posicao] = objeto;
        posicao++;
    }
    
    public Object pegaObjeto(int n){
        return arrayDeObjetos[n];
    }
}
