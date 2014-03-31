/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.trtgames.basico;


/**
 *
 * @author Horacio Dias
 */
public class TestaString {
    public static void main(String[] args){
        String s = "fj11";
        System.out.println(s.contains("1"));
        System.out.println(eleva(3,2));
        int x = stringNum("231");
    }
    //Convertendo String Para Numeros genérico
    public static int stringNum(String s){
        int r = 0;
        for(int i=0;i<s.length();i++){
            char c = s.charAt(s.length()-(i+1));
            int z = Character.getNumericValue(c);
            r += eleva(10,i)*z;
        }
        return r;
    }
    public static int eleva(int n,int pot){
        int result=1;
        for(int i=0;i<pot;i++){
            result = result*n;
        }
        return result;
    }
}
