package br.ufrpe.negocios.beans;

import java.util.List;

public class Raca {
	private String nome;
	private TracosRaciais tracos;
	
	public Raca(String nome, TracosRaciais tracos){
		this.nome = nome;
		this.tracos = tracos;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<String> getTracosRaciais() {
		return tracos.getTracosRaciais();
	}

	public void setTracosRaciais(List<String> tracosRaciais) {
		this.tracos.setTracosRaciais(tracosRaciais);
	}
	
	
}
