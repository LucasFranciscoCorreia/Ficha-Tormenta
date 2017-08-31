package br.ufrpe.negocios.beans;
public class Magia {
	private String definicao;
	private String nome;
	private String beneficio;
	private String dano;
	private byte nivel;
	
	public Magia(String nome, String definicao, String beneficio, String dano, byte nivel){
		this.nivel = nivel;
		this.nome = nome;
		this.definicao = definicao;
		this.beneficio = beneficio;
		this.dano = dano;
	}

	public String getDefinicao() {
		return definicao;
	}

	public void setDefinicao(String definicao) {
		this.definicao = definicao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getBeneficio() {
		return beneficio;
	}

	public void setBeneficio(String beneficio) {
		this.beneficio = beneficio;
	}

	public String getDano() {
		return dano;
	}

	public void setDano(String dano) {
		this.dano = dano;
	}

	public int getNivel() {
		return nivel;
	}

	public void setNivel(byte nivel) {
		this.nivel = nivel;
	}
	
}
