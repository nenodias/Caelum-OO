/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.trtgames.model;

/**
 *
 * @author nenodias
 */
public class Programa implements Runnable{
    private int id;

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
    @Override
    public void run() {
        for(int i = 0;i<10000;i++){
            System.out.println("Programa "+id+" valor: "+i);
        }
    }
    
}
