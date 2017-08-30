package br.ufrpe.repositorios;

import java.util.LinkedList;
import java.util.List;

import br.ufrpe.exceptions.TalentoNaoExisteException;
import br.ufrpe.negocios.beans.Talento;


public class Talentos {
	private List<Talento> talentos;

	public Talentos(){
		talentos = new LinkedList<>();
	}
	public void addTalento(Talento t) throws TalentoNaoExisteException{
		if(t != null){
			this.talentos.add(t);
		}else{
			throw new TalentoNaoExisteException();
		}
	}
	public void removeTalento(Talento t) throws TalentoNaoExisteException{
		if(t != null){
			if(talentos.contains(t)){
				this.talentos.remove(t);				
			}else{
				throw new TalentoNaoExisteException(t);
			}
		}else{
			throw new TalentoNaoExisteException();
		}
	}
}
