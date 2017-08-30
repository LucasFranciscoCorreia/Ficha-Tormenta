package exceptions;

import br.ufrpe.negocios.beans.Magia;

public class MagiaJaExisteException extends Exception{

	public MagiaJaExisteException(Magia m) {
		super("A magia " + m.getNome() + " já existe no personagem");
	}

}
