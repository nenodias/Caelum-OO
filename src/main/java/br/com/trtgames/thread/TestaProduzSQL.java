/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.trtgames.thread;

import br.com.trtgames.model.ProduzSQL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author nenodias
 */
public class TestaProduzSQL {
    public static void main(String[] args){
        Collection<String>sqls = new ArrayList<>();
        
        ProduzSQL p1 = new ProduzSQL(0,10000,sqls);
        Thread t1 = new Thread(p1);
        
        ProduzSQL p2 = new ProduzSQL(10000, 20000, sqls);
        Thread t2 = new Thread(p2);
        
        ProduzSQL p3 = new ProduzSQL(20000, 30000, sqls);
        Thread t3 = new Thread(p3);
        
        t1.start();
        t2.start();
        t3.start();
        
        //Faz com que nós aguardem o fim dessas tres threads
        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(TestaProduzSQL.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        System.out.println("Threads produtoras de SQL finalizadas!");
        
        //Verificar se todas SQLs foram criadas
        for (int i = 0; i < 30000;i++){
            if(!sqls.contains("SQL"+i)){
              throw new IllegalStateException("Não foi encontrado a SQL"+i);
            }
        }
        
        //verifica se null não se encontra
        if(sqls.contains(null)){
            throw new IllegalStateException("Não devia haver nenhum objeto null");
        }
        
        System.out.println("Fim do programa");
    }
}
