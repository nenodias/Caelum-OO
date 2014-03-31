/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.trtgames.basico;

import br.com.trtgames.model.Cliente;
import br.com.trtgames.model.Conta;
import br.com.trtgames.model.GuardadorDeObjetos;

/**
 *
 * @author nenodias
 */
public class TestaConta {
    public static void main(String[] args){
        //Testando sobrescrita do método equals
        GuardadorDeObjetos go = new GuardadorDeObjetos();
        Cliente cliente = new Cliente("Neno",new Long(2));
        Conta conta = new Conta(new Long(1),cliente,new Double(100));
        Conta conta2 = new Conta(new Long(1),new Cliente("Nino",new Long(3)),new Double(1000));
//        System.out.println(conta.equals(conta2));
        go.adicionaObjeto(conta);
        go.adicionaObjeto(conta2);
        Conta c = (Conta)go.pegaObjeto(0);
//        System.out.println(c);//Pegando o Objeto
//        charLinhaALinha("Socorram-me, subi no ônibus em Marrocos");
//        System.out.println(charFrase("Socorram-me, subi no ônibus em Marrocos"));
//        StringBuilder s = new StringBuilder("VISH");//Tipo de String Mutável, ou seja
//        s.reverse();//Não tem que fazer ela receber ela mesma...
//        s.append("  LOLA");//Gasta menos memória em sua manipulação
//        s.reverse();
//        System.out.println(s);
    }
    public static void charLinhaALinha(String s){
        for (int i=s.length()-1;i>-1;i--){
            System.out.println(s.charAt(i));
        }
    }
    public static String charFrase(String s){
        String[] result = s.split(" ");
        String x="";
        for(int i = result.length-1;i>-1;i--){
            x +=" "+result[i];
        }
        return x;
        
    }
}
