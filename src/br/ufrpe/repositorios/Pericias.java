package br.ufrpe.repositorios;

import java.util.LinkedList;
import java.util.List;

import br.ufrpe.negocios.beans.Pericia;

public class Pericias {
	List<Pericia> pericias = new LinkedList<>();
	
	public void addPericia(Pericia p){
		if(p != null){
			this.pericias.add(p);
		}else{
			//TODO exception item nulo
		}
	}
	
	public void removePericia(Pericia p){
		if(p != null){
			if(pericias.contains(p)){
				this.pericias.remove(p);				
			}
			else{
				//TODO exception item nao existe				
			}
		}else{
			//TODO exception item nulo
		}
	}
}
