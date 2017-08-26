package br.ufrpe.negocios.beans;
public class Arma extends Item{
	
	
	private boolean ranged;
	private String dado;
	private int margemCritico;
	private int critico;
	private int alcance;
	private String tipo;
	private Projetil projetil;
	
	public Arma(String nome, boolean ranged, String dado, int margemCritico, int critico, int alcance, String tipo, float peso) {
		super(nome, peso, false);
		this.ranged = ranged;
		this.dado = dado;
		this.margemCritico = margemCritico;
		this.critico = critico;
		this.alcance = alcance;
		this.tipo = tipo;
		this.projetil = null;
	}
	public Arma(String nome, boolean ranged, String dado, int margemCritico, int critico, int alcance, String tipo, float peso, Projetil projetil) {
		super(nome, peso, false);
		this.ranged = ranged;
		this.dado = dado;
		this.margemCritico = margemCritico;
		this.critico = critico;
		this.alcance = alcance;
		this.tipo = tipo;
		this.projetil = projetil;
	}

	public boolean isRanged() {
		return ranged;
	}

	public String getDado() {
		return dado;
	}

	public int getMargemCritico() {
		return margemCritico;
	}

	public int getCritico() {
		return critico;
	}

	public int getAlcance() {
		return alcance;
	}

	public String getTipo() {
		return tipo;
	}
	
	public Projetil getProjetil() {
		return projetil;
	}
	
	public void setProjetil(Projetil projetil) {
		this.projetil = projetil;
	}
	
	
}