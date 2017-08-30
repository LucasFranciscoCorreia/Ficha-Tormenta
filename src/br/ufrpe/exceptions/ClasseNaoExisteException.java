package br.ufrpe.exceptions;

import br.ufrpe.negocios.beans.Classe;

public class ClasseNaoExisteException extends Exception{
	public ClasseNaoExisteException(Classe c){
		super("A classe " + c.getNome() + " nao existe no personagem");
	}
}
