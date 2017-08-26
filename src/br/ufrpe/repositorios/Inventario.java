package br.ufrpe.repositorios;

import java.util.LinkedList;
import java.util.List;

import br.ufrpe.negocios.beans.Item;

public class Inventario {
	
	private List<Item> inventario = new LinkedList<>();
	private double pesoTotal;
	
	public List<Item> getInventario() {
		return inventario;
	}
	
	public double getPesoTotal() {
		return pesoTotal;
	}
	
	public void adicionar(Item item){
		if(item != null){
			this.inventario.add(item);
			this.pesoTotal += item.getPeso();
		}else{
			//TODO exception item vazio
		}
	}
	
	public void remover(Item item){
		if(item != null && this.inventario.contains(item)){
			this.remover(item);
			this.pesoTotal -= item.getPeso();
		}else{
			//TODO exception item vazio ou nao existe no inventario
		}
	}	
}
