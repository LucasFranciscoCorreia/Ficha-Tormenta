package br.ufrpe.negocios.beans;

import exceptions.MoedasInsuficientesException;

public enum Moedas {
	TS(0, 0), TP(0, 1), TO(0, 2),TL(0, 3);
	private int i;
	private final int prioridade;
	Moedas(int i, int prioridade){
		this.i = i;
		this.prioridade = prioridade;
	}

	void setMoedas(int i){
		this.i = i;
	}

	int getMoedas(){
		return this.i;
	}

	void gastar(int i){
		this.i -= i;
	}

	void ganhar(int i){
		this.i += i;
	}
	double getPesoTotal(){
		double res = Moedas.TL.getMoedas()*0.01
				+ Moedas.TO.getMoedas()*0.01
				+ Moedas.TP.getMoedas()*0.01
				+ Moedas.TS.getMoedas()*0.01;
		return res;
	}
	void trocar(Moedas b, int i) throws MoedasInsuficientesException{
		if(this.prioridade > b.prioridade){
			if(this.getMoedas() >= i){
				this.gastar(i);
				b.ganhar((int)(i*Math.pow(10, (this.prioridade - b.prioridade))));
			}else{
				switch(this.prioridade){
				case 0: 
					throw new MoedasInsuficientesException(Moedas.TS);
				case 1: 
					throw new MoedasInsuficientesException(Moedas.TP);
				case 2: 
					throw new MoedasInsuficientesException(Moedas.TO);
				case 3: 
					throw new MoedasInsuficientesException(Moedas.TL);
				}
			}
		}else{
			if(this.getMoedas() >= (int)(i*Math.pow(10, b.prioridade-this.prioridade))){
				this.gastar((int)(i*Math.pow(10, (b.prioridade - this.prioridade))));
				b.ganhar(i);
			}else{
				switch(this.prioridade){
				case 0: 
					throw new MoedasInsuficientesException(Moedas.TS, b);
				case 1: 
					throw new MoedasInsuficientesException(Moedas.TP, b);
				case 2: 
					throw new MoedasInsuficientesException(Moedas.TO, b);
				case 3: 
					throw new MoedasInsuficientesException(Moedas.TL, b);
				}
			}
		}
	}
	public String toString(){
		String res = "TL: " + Integer.toString(Moedas.TL.getMoedas()) +
				"\t TO: " + Integer.toString(Moedas.TO.getMoedas()) +
				"\t TP: " + Integer.toString(Moedas.TP.getMoedas()) +
				"\t T$: " + Integer.toString(Moedas.TS.getMoedas());
		return res;
	}
}
