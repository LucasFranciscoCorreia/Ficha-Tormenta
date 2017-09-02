package br.ufrpe.negocios.beans;

import java.io.Serializable;

public class HabilidadeDeClasse implements Serializable{
	private String nome, descricao, beneficio;

	public HabilidadeDeClasse(String nome, String descricao, String beneficio) {
		this.nome = nome;
		this.descricao = descricao;
		this.beneficio = beneficio;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getBeneficio() {
		return beneficio;
	}

	public void setBeneficio(String beneficio) {
		this.beneficio = beneficio;
	}
	
	
}
