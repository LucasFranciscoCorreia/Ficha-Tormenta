package br.ufrpe.negocios.beans;
public enum Tendencia {
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