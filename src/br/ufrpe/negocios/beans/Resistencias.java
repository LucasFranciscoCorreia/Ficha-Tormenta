package br.ufrpe.negocios.beans;

import br.ufrpe.exceptions.AtributoInvalidoException;

public class Resistencias {
	public static int getTesteFortitude(int meioNivel, Atributos constituicao, int outros) throws AtributoInvalidoException{
		if(constituicao == Atributos.Constituicao){
			return meioNivel+constituicao.getModificador() + outros;
		}else{
			throw new AtributoInvalidoException(Atributos.Constituicao, constituicao);
		}
	}
	
	public static int getTesteReflexo(int meioNivel, Atributos destreza, int outros) throws AtributoInvalidoException{
		if(destreza == Atributos.Destreza){
			return meioNivel+destreza.getModificador()+outros;
		}else{
			throw new AtributoInvalidoException(Atributos.Destreza, destreza);
		}
		
	}
	
	public static int getTesteVontade(int meioNivel, Atributos sabedoria, int outros) throws AtributoInvalidoException{
		if(sabedoria == Atributos.Sabedoria){
			return meioNivel+sabedoria.getModificador()+outros;
		}else{
			throw new AtributoInvalidoException(Atributos.Sabedoria, sabedoria);
		}
	}
}