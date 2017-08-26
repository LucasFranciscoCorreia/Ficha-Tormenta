package br.ufrpe.negocios.beans;
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
	
	void trocar(Moedas b, int i){
		if(this.prioridade > b.prioridade){
			if(this.getMoedas() >= i){
				this.gastar(i);
				b.ganhar(i*10);
			}else{
				//TODO Sem moedas suficientes exception
			}
		}else{
			if(this.getMoedas() >= i*10){
				this.gastar(10*i);
				b.ganhar(i);
			}
		}
	}
	
	
}
