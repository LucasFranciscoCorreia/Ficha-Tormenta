package br.ufrpe.repositorios;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;

import br.ufrpe.exceptions.ItemNaoCadastradoException;
import br.ufrpe.negocios.beans.Item;


public class Inventario implements Serializable{

	private List<Item> inventario = new LinkedList<>();
	private double pesoTotal;

	public List<Item> getInventario() {
		return inventario;
	}

	public double getPesoTotal() {
		return pesoTotal;
	}

	public void adicionar(Item item) throws ItemNaoCadastradoException{
		if(item != null){
			this.inventario.add(item);
			this.pesoTotal += item.getPeso();
		}else{
			throw new ItemNaoCadastradoException();
		}
	}

	public void remover(Item item) throws ItemNaoCadastradoException{
		if(item != null){
			if(this.inventario.contains(item)){
				this.remover(item);
				this.pesoTotal -= item.getPeso();
			}else{
				throw new ItemNaoCadastradoException(item);
			}
		}else{
			throw new ItemNaoCadastradoException();
		}
	}	
}
