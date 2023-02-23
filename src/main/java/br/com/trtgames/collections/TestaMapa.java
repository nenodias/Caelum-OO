package br.com.trtgames.collections;

import br.com.trtgames.model.Cliente;

import java.util.HashMap;
import java.util.Map;

public class TestaMapa {
    public static void main(String[] args) {
        Cliente c = new Cliente("José", Long.valueOf(414294078));
        Cliente c1 = new Cliente("Juca", Long.valueOf(21212121));

        Map<String, Cliente> mapaDeClientes = new HashMap<>();
        mapaDeClientes.put("Idoso", c);
        mapaDeClientes.put("Adulto", c1);
        //Gravando no Map e depois pegando o "Object Value(Cliente)" a partir do "Object Key(String)" nesse caso uma 
        System.out.println(mapaDeClientes.get("Adulto"));
    }
}
