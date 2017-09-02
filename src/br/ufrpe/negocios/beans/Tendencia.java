package br.ufrpe.negocios.beans;

import java.io.Serializable;

public enum Tendencia implements Serializable{
	LB("Leal Bondoso"), LN ("Leal Neutro"), LM("Leal Maligno"),
	NB("Neutro Bondoso"), N("Neutro"), NM("Neutro Maligno"),
	CB("Caotico Bondoso"),CN("Caotico Neutro"), CM("Caotico Maligno");
	
	private final  String tendencia;
	Tendencia(String tendencia){
		this.tendencia = tendencia;
	}
	String getTendencia(){
		return tendencia;
	}
	public String toString(){
		return tendencia;
	}
}