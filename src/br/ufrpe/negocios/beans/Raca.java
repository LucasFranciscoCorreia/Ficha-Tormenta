package br.ufrpe.negocios.beans;

import java.util.List;

public class Raca {
	private String nome;
	private List<String> tracosRaciais;
	
	public Raca(String nome, List<String>  tracosRaciais){
		this.nome = nome;
		this.tracosRaciais = tracosRaciais;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<String> getTracosRaciais() {
		return tracosRaciais;
	}

	public void setTracosRaciais(List<String> tracosRaciais) {
		this.tracosRaciais = tracosRaciais;
	}
	
	
}
