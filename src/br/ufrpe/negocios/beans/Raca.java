package br.ufrpe.negocios.beans;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;

public class Raca implements Serializable{
	private String nome;
	private List<String> tracos;
	private List<TracosRaciais> raciais;
	
	public Raca(String nome, List<TracosRaciais> tracos){
		this.tracos = new LinkedList<>();
		this.raciais = new LinkedList<>();
		this.nome = nome;
		this.setTracosRaciais(tracos);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<String> getTracos() {
		return tracos;
	}
	
	public List<TracosRaciais> getRaciais(){
		return raciais;
	}

	public void setTracosRaciais(List<TracosRaciais> tracosRaciais) {
		for(TracosRaciais r: tracosRaciais)
			tracos.add(r.getTracosRaciais());
		raciais = tracosRaciais;
	}
	
	
}
