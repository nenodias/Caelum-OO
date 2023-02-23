package br.com.trtgames.collections;

import java.util.ArrayList;
import java.util.List;

public class DesafioArrayList {
    public static void main(String[] args) {
        int max = 1000;
        List<Integer> lista = new ArrayList<>();
        for (int i = 0; i < max; i++) {
            lista.add(i);
        }
    }
}
