package br.ufrpe.repositorios;

import java.util.LinkedList;
import java.util.List;

import br.ufrpe.negocios.beans.Classe;
import exceptions.ClasseJaCadastradoException;
import exceptions.ClasseNaoExisteException;

public class Classes {
	private List<Classe> classes;
	public Classes(){
		classes = new LinkedList<>();
	}
	
	public void addClasse(Classe c) throws ClasseJaCadastradoException{
		if(c != null && !classes.contains(c)){
			this.classes.add(c);
		}else{
			throw new ClasseJaCadastradoException(c);
		}
	}
	
	public void removeClasse(Classe c) throws ClasseNaoExisteException{
		if(c != null && classes.contains(c)){
			this.classes.remove(c);
		}else{
			throw new ClasseNaoExisteException(c);
		}
	}
}
