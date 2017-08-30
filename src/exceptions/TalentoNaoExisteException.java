package exceptions;

import br.ufrpe.negocios.beans.Talento;

public class TalentoNaoExisteException extends Exception{
	public TalentoNaoExisteException() {
		super("Talento nao foi cadastrado corretamente");
	}
	
	public TalentoNaoExisteException(Talento t){
		super("O talento " + t.getNome() + " nao está inserida no personagem");
	}

}
