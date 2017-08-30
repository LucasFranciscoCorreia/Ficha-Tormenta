package br.ufrpe.negocios.beans;
public class Classe {
	private String nome, habilidades;
	private float BBA;
	private int nivel;
	private boolean magica;
	
	public String getNome() {
		return nome;
	}
	
	public float getBBA() {
		return BBA;
	}
	
	public int getNivel() {
		return nivel;
	}
	
	public boolean isMagica() {
		return magica;
	}

	public Classe(String nome, float BBA, int nivel, boolean magica){
		this.nome = nome;
		this.BBA = BBA;
		this.nivel = nivel;
		this.magica = magica;
	}
}