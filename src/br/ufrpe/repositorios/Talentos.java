package br.ufrpe.repositorios;

import java.util.LinkedList;
import java.util.List;

import br.ufrpe.negocios.beans.Talento;

public class Talentos {
	private List<Talento> talentos;

	public Talentos(){
		talentos = new LinkedList<>();
	}
	public void addTalento(Talento t){
		if(t != null){
			this.talentos.add(t);
		}else{
			//TODO exception talento invalido
		}
	}
	public void removeTalento(Talento t){
		if(t != null && talentos.contains(t)){
			this.talentos.remove(t);
		}else{
			//TODO exception talento nao cadastrado;
		}
	}
}
