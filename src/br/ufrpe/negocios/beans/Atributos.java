package br.ufrpe.negocios.beans;
public enum Atributos {
	Força(0), Destreza(0), Constituicao(0), Inteligencia(0), Sabedoria(0), Carisma(0); 
	
	private int i;
	Atributos(int i){
		this.i = i;
	}
	void setValorAtributo(int i){
		this.i = i;
	}
	int getValorAtributo(){
		return this.i;
	}
	void subirNivel(){
		this.i++;
	}
	int getModificador(){
		return (i/2) - 5;
	}
}
