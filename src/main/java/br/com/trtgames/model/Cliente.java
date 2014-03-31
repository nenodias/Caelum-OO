package br.com.trtgames.model;

import java.util.Objects;

public class Cliente /*implements Comparable<Cliente>*/{
	private String nome;
	private Long cpf;
	
	public Cliente(String nome,Long cpf){
		this.nome = nome;
		this.cpf = cpf;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

    @Override
    public String toString() {
        return "Cliente{" + "nome=" + nome + ", cpf=" + cpf + '}';
    }
	public Long getCpf() {
		return cpf;
	}
	public void setCpf(Long cpf) {
		this.cpf = cpf;
	}

//    @Override//Implementando o metodo da Interface Comparable
//    public int compareTo(Cliente o) {
//        int retorno = 0;
//        if(this.nome.length() == o.nome.length()){//Objeto atual é igual ao segundo
//            retorno = 0;//Mantém a posição atual
//        }
//        else if(this.nome.length() > o.nome.length()){//Objeto atual é menor que o segundo
//            retorno = -1;//Joga o segundo na posição abaixo
//        }
//        else if(this.nome.length() < o.nome.length()){//Objeto atual é maior que o segundo
//            retorno = 1;//Joga o segundo na posição acima
//        }
//        return retorno;
//    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.nome);
        hash = 97 * hash + Objects.hashCode(this.cpf);
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
        final Cliente other = (Cliente) obj;
        if (!Objects.equals(this.cpf, other.cpf)) {
            return false;
        }
        return true;
    }
}
