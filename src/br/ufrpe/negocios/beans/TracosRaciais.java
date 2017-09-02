package br.ufrpe.negocios.beans;

import java.io.Serializable;

public class TracosRaciais implements Serializable{
	private String tracosRaciais;

	public TracosRaciais(String tracoRacial) {
		this.tracosRaciais = tracoRacial;
	}

	public String getTracosRaciais() {
		return tracosRaciais;
	}

	public void setTracosRaciais(String tracosRaciais) {
		this.tracosRaciais = tracosRaciais;
	}
	
}
