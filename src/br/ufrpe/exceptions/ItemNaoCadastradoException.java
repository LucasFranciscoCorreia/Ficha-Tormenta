package br.ufrpe.exceptions;

import br.ufrpe.negocios.beans.Item;

public class ItemNaoCadastradoException extends Exception {

	public ItemNaoCadastradoException() {
		super("Item nao foi cadastrado corretamente");
	}
	
	public ItemNaoCadastradoException(Item i){
		super("O item " + i.getNome() + " nao está no seu inventario");
	}
}