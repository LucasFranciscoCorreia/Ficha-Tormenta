package br.ufrpe.negocios.beans;

import java.util.List;

public class Classe {
	private String nome;
	List<HabilidadeDeClasse> habilidades;
	private float BBA; 
	private byte nivel;
	private boolean magica;
	private int PVInicial;
	private int PVPorNivel;
	private int PMInicial;
	private int PMPorNivel;
	
	
	public int getPMInicial() {
		return PMInicial;
	}

	public void setPMInicial(int pMInicial) {
		PMInicial = pMInicial;
	}

	public int getPMPorNivel() {
		return PMPorNivel;
	}

	public void setPMPorNivel(int pMPorNivel) {
		PMPorNivel = pMPorNivel;
	}

	public int getPVInicial() {
		return PVInicial;
	}

	public void setPVInicial(int pVInicial) {
		PVInicial = pVInicial;
	}

	public int getPVPorNivel() {
		return PVPorNivel;
	}

	public void setPVPorNivel(int pVPorNivel) {
		PVPorNivel = pVPorNivel;
	}

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
	

	public List<HabilidadeDeClasse> getHabilidades() {
		return habilidades;
	}

	public void setHabilidades(List<HabilidadeDeClasse> habilidades) {
		this.habilidades = habilidades;
	}
	
	

	public Classe(String nome, List<HabilidadeDeClasse> habilidades, float bBA, byte nivel, boolean magica, int pVInicial, byte pVPorNivel, int pMInicial, byte pMPorNivel) {
		super();
		this.nome = nome;
		this.habilidades = habilidades;
		BBA = bBA;
		this.nivel = nivel;
		this.magica = magica;
		PVInicial = pVInicial;
		PVPorNivel = pVPorNivel;
		PMInicial = pMInicial;
		PMPorNivel = pMPorNivel;
	}

	public Classe(String nome, float BBA, byte nivel, boolean magica){
		this.nome = nome;
		this.BBA = BBA;
		this.nivel = nivel;
		this.magica = magica;
	}
}