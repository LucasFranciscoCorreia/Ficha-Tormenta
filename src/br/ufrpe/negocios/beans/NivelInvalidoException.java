package br.ufrpe.negocios.beans;

public class NivelInvalidoException extends Exception {
	public NivelInvalidoException(){
		super("Nivel nao pode ser negativo ou nulo");
	}
}
