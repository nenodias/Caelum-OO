package br.com.trtgames.basico;

import br.com.trtgames.model.Cliente;
import br.com.trtgames.model.Conta;

import java.io.PrintStream;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class TestaInteger {
    public static void main(String[] args) {
        Integer x1 = Integer.valueOf(10);
        Integer x2 = Integer.valueOf(10);
        Conta c = new Conta(Long.valueOf(1), new Cliente("Neno", Long.valueOf("414294078")), Double.valueOf(200));
        Conta d = new Conta(Long.valueOf(1), new Cliente("Bia", Long.valueOf("2031234213")), Double.valueOf(1000));
        if (x1.equals(x2)) {
            System.out.println("Igual");
        } else {
            System.out.println("Diferente");
        }
        Integer teste = Integer.parseInt("1");
//        try{
//            teste = Integer.parseInt("002");
//        }catch(NumberFormatException n){
//            System.out.println("Erro na conversão de tipos: "+n.getMessage());
//        }
        System.out.println(x1.toString() + " " + c);
        PrintStream x = System.out;
        x.println(c.equals(d));//Atende as expectativas do equals sobrescrito
        x.println(c == d);//Não é a mesma referência

        BigDecimal b = new BigDecimal("10.0");//BigDecimal sempre recebe Strings para Calculos.
        BigDecimal bb = new BigDecimal("3.0");
        System.out.println(b.add(bb));
        System.out.println(b);
        System.out.println(b.divide(bb, RoundingMode.UP));//Para fazer divisões você deve
        //passar o parâmetro de arredondamento
    }
}
