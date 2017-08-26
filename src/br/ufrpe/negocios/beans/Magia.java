package br.ufrpe.negocios.beans;
public class Magia {
	String definicao;
	String nome;
	String beneficio;
	
	public Magia(String nome, String definicao, String beneficio){
		this.nome = nome;
		this.definicao = definicao;
		this.beneficio = beneficio;
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
	
}
