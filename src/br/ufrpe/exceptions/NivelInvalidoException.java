package br.ufrpe.exceptions;

public class NivelInvalidoException extends Exception {
	public NivelInvalidoException(){
		super("Nivel nao pode ser negativo ou nulo");
	}
}
