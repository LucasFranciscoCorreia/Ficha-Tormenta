package br.ufrpe.repositorios;

import java.util.LinkedList;
import java.util.List;

import br.ufrpe.exceptions.MagiaJaExisteException;
import br.ufrpe.exceptions.MagiaNaoCadastradaException;
import br.ufrpe.negocios.beans.Magia;


public class Magias {
	private List<Magia> magias;

	public Magias(){
		magias = new LinkedList<>();
	}

	public void addMagia(Magia m) throws MagiaJaExisteException{
		if(m != null && !magias.contains(m)){
			magias.add(m);
		}else{
			throw new MagiaJaExisteException(m);
		}
	}

	public void removeMagia(Magia m) throws MagiaNaoCadastradaException{
		if(m != null){
			if(magias.contains(m)){
				magias.remove(m);				 
			}else{
				throw new MagiaNaoCadastradaException(m);
			}
		}else{
			throw new MagiaNaoCadastradaException();
		}
	}
}
