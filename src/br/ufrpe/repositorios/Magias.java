package br.ufrpe.repositorios;

import java.util.LinkedList;
import java.util.List;

import br.ufrpe.negocios.beans.Magia;

public class Magias {
	private List<Magia> magias;
	
	public Magias(){
		magias = new LinkedList<>();
	}
	
	public void addMagia(Magia m){
		if(m != null && !magias.contains(m)){
			magias.add(m);
		}else{
			//TODO exception ja existe magia
		}
	}
	
	public void removeMagia(Magia m){
		if(m != null && magias.contains(m)){
			magias.remove(m);
		}else{
			//TODO exception nao existe magia
		}
	}
}
