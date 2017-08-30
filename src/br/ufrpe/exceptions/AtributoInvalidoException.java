package br.ufrpe.exceptions;

import br.ufrpe.negocios.beans.Atributos;

public class AtributoInvalidoException extends Exception{
	public AtributoInvalidoException(Atributos A, Atributos B){
		super("É necessario um teste de " + A.toString() + " em vez de um teste de " + B.toString());
	}
}
