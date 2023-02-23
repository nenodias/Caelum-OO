package br.com.trtgames.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AgendaClientes {
    private List<Cliente> listaClientes;
    private Map<String, Cliente> mapaBusca;

    public AgendaClientes() {//Construtor inicializando a Lista
        listaClientes = new ArrayList<>();
        mapaBusca = new HashMap();
    }

    public void adiciona(Cliente c) {
        listaClientes.add(c);
        mapaBusca.put(c.getNome(), c);
    }

    public Cliente pega(int x) {
        return listaClientes.get(x);
    }

    public Cliente buscaPorNome(String nome) throws NullPointerException {
        return mapaBusca.get(nome);
    }

    public int pegaTotalDeClientes() {
        return listaClientes.size();
    }
}
