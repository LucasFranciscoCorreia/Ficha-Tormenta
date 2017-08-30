package exceptions;

import br.ufrpe.negocios.beans.Moedas;

public class MoedasInsuficientesException extends Exception{
	public MoedasInsuficientesException(Moedas a) {
		super("Você nao possui nenhuma moeda de " + a.toString() + " para trocar");
	}
	
	public MoedasInsuficientesException(Moedas a, Moedas b){
		super("Seus " + b.toString() + " são insuficientes para trocar por " + a.toString());
	}

}
