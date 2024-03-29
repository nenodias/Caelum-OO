package br.com.trtgames.collections;

import br.com.trtgames.model.AgendaClientes;
import br.com.trtgames.model.Cliente;

public class TestaAgendaClientes {

    public static void main(String[] args) {
        try {
            Cliente c = new Cliente("José", Long.valueOf(14));
            Cliente c1 = new Cliente("Juca", Long.valueOf(14));
            Cliente c2 = new Cliente("Rachel", Long.valueOf(32));
            Cliente c3 = new Cliente("Isabella", Long.valueOf(41));

            AgendaClientes ag = new AgendaClientes();
            ag.adiciona(c);
            ag.adiciona(c1);
            ag.adiciona(c2);
            ag.adiciona(c3);

            System.out.println("Total de Clientes: " + ag.pegaTotalDeClientes());
            System.out.println("Cliente 2: " + ag.pega(2).getNome());
            System.out.println(ag.pega(0).equals(ag.pega(1)));
            System.out.println("Cpf da Isabella: " + ag.buscaPorNome("Isabela").getCpf());
            //Se não encontrar ele retorna null, e uma exceção "NullPointerException"

        } catch (NullPointerException e) {
            System.out.println("Cliente não Cadastrado!!!");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
