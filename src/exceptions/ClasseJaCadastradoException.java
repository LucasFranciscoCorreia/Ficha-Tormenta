package exceptions;

import br.ufrpe.negocios.beans.Classe;

public class ClasseJaCadastradoException extends Exception{
	public ClasseJaCadastradoException(Classe c){
		super("A classe " + c.getNome() + " já está no personagem");
	}
}
