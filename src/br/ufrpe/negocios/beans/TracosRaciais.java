package br.ufrpe.negocios.beans;

import java.util.LinkedList;
import java.util.List;

public class TracosRaciais {
	List<String> tracosRaciais;

	public TracosRaciais() {
		tracosRaciais = new LinkedList<>();
	}

	public List<String> getTracosRaciais() {
		return tracosRaciais;
	}

	public void setTracosRaciais(List<String> tracosRaciais) {
		this.tracosRaciais = tracosRaciais;
	}
	
}
