package br.ufrpe.negocios.beans;

import java.util.List;

public class Raca {
	private String nome;
	private List<TracosRaciais> tracos;
	
	public Raca(String nome, List<TracosRaciais> tracos){
		this.nome = nome;
		this.tracos = tracos;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<TracosRaciais> getTracosRaciais() {
		return tracos;
	}

	public void setTracosRaciais(List<TracosRaciais> tracosRaciais) {
		this.tracos = tracosRaciais;
	}
	
	
}
