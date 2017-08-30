package br.ufrpe.exceptions;

import br.ufrpe.negocios.beans.Magia;

public class MagiaNaoCadastradaException extends Exception{
	public MagiaNaoCadastradaException() {
		super("Magia nao foi cadastrada corretamente");
	}
	
	public MagiaNaoCadastradaException(Magia m){
		super("A magia " + m.getNome() + " não está inserida no personagem");
	}

}
