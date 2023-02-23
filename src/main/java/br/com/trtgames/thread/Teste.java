package br.com.trtgames.thread;

import br.com.trtgames.model.Programa;

public class Teste {
    public static void main(String[] args) {
        //Rodando o programa um em uma thread
        Programa p1 = new Programa();
        p1.setId(1);

        Thread t1 = new Thread(p1);
        t1.start();

        //Rodando o programa dois em outra thread
        Programa p2 = new Programa();
        p2.setId(2);

        Thread t2 = new Thread(p2);
        t2.start();
    }
}
