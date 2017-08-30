package br.ufrpe.repositorios;

import java.util.LinkedList;
import java.util.List;

import br.ufrpe.negocios.beans.Pericia;
import exceptions.PericiaNaoClassificadaException;

public class Pericias {
	List<Pericia> pericias = new LinkedList<>();
	
	public void addPericia(Pericia p) throws PericiaNaoClassificadaException{
		if(p != null){
			this.pericias.add(p);
		}else{
			throw new PericiaNaoClassificadaException();
		}
	}
	
	public void removePericia(Pericia p) throws PericiaNaoClassificadaException{
		if(p != null){
			if(pericias.contains(p)){
				this.pericias.remove(p);				
			}
			else{
				throw new PericiaNaoClassificadaException(p);
			}
		}else{
			throw new PericiaNaoClassificadaException();
		}
	}
}
