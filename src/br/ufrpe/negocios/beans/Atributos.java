package br.ufrpe.negocios.beans;

import java.io.Serializable;

public enum Atributos implements Serializable{
	Força(0), Destreza(0), Constituicao(0), Inteligencia(0), Sabedoria(0), Carisma(0); 
	
	private int i;
	Atributos(int i){
		this.i = i;
	}
	public void setValorAtributo(int i){
		this.i = i;
	}
	public int getValorAtributo(){
		return this.i;
	}
	public void subirNivel(){
		this.i++;
	}
	public void descerNivel(){
		this.i--;
	}
	public void addValor(int i){
		this.i += i;
	}
	public int getModificador(){
		return (i/2) - 5;
	}
}
