package br.ufrpe.negocios.beans;
public class Raca {
	private String nome;
	private String beneficio;
	
	public Raca(String nome, String beneficio){
		this.nome = nome;
		this.beneficio = beneficio;
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
