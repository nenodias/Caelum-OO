package br.com.trtgames.model;

import java.util.Objects;

public class Conta {
    private Long numero;
    private Double saldo = 0D;
    private Double limite;
    private Cliente cliente;

    public Conta(Long numero, Cliente cliente, Double limite) {
        this.numero = numero;
        this.cliente = cliente;
        this.limite = limite;
    }

    public void saca(Double quantidade) throws EstouroDeLimite {
        if (this.saldo + this.limite > quantidade) {
            this.saldo -= quantidade;
        } else {
            throw new EstouroDeLimite("Erro estouro do limite da Conta");
        }
    }

    public void deposita(Double quantidade) throws EstouroDeLimite {
        if (quantidade > 0) {
            this.saldo += quantidade;
        } else {
            throw new EstouroDeLimite("Erro Dep�sito de valor Negativo");
        }
    }

    public void getsaldo() {
        System.out.println("Saldo: " + this.saldo + "\n" + "Cliente: " + this.cliente.getNome());
    }

    public void transfere(Conta destino, Double valor) throws EstouroDeLimite {
        if (this.saldo + this.limite > valor) {
            this.saldo -= valor;
            destino.deposita(valor);
        } else {
            throw new EstouroDeLimite("Erro estouro do limite da Conta");
        }
    }

    //N�mero
    public Long getNumero() {
        return this.numero;
    }

    public void setNumero(Long numero) {
        this.numero = numero;
    }

    //Limite da Conta
    public Double getLimite() {
        return limite;
    }

    //	public void setLimite(double limite) {
//		this.limite = limite;
//	}
    //Cliente
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + Objects.hashCode(this.numero);
        hash = 41 * hash + Objects.hashCode(this.saldo);
        hash = 41 * hash + Objects.hashCode(this.limite);
        hash = 41 * hash + Objects.hashCode(this.cliente);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Conta other = (Conta) obj;
        if (!Objects.equals(this.numero, other.numero)) {
            return false;
        }
        if (!Objects.equals(this.cliente.getNome(), other.cliente.getNome())) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Conta{" + "numero=" + numero + ", saldo=" + saldo + ", limite=" + limite + ", cliente=" + cliente + '}';
    }
}
