package br.com.trtgames.basico;
import br.com.trtgames.model.Cliente;
import br.com.trtgames.model.Conta;
import br.com.trtgames.model.EstouroDeLimite;
/**
 * @author Horácio Dias
 *
 */
public class Caelum {

	public static void main(String[] args) {
		Cliente cliente = new Cliente("Neno",new Long(2));
		Conta conta = new Conta(new Long(1),cliente,new Double(100));
		try{//Tenta um código se houver erro o catch o captura
			conta.deposita(Double.parseDouble("200"));
			conta.saca(Double.parseDouble("200"));
		}catch(EstouroDeLimite e){//Catch pegando o erro que criei
			System.out.println(e.getMessage());
		}catch(Exception e){//Pegando um erro mais genérico
			System.out.println(e.getMessage());
		}finally{//Código que sempre será executado independente de erro
			conta.getsaldo();
		}
		conta.saca(Double.parseDouble("20"));
		conta.getNumero();
		
	}

}
