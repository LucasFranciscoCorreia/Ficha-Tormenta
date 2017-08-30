package exceptions;

import br.ufrpe.negocios.beans.Pericia;

public class PericiaNaoClassificadaException extends Exception {
	public PericiaNaoClassificadaException() {
		super("Pericia nao preenchida corretamente");
	}
	public PericiaNaoClassificadaException(Pericia p){
		super("A pericia " + p.getNome() + "nao está graduada");
	}
}