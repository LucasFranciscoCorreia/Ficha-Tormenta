package br.ufrpe.negocios.beans;

public class Item {
	
	private String nome, definicao;
	private float peso;
	private boolean isAnimal;
	
	public Item(String nome, float peso,boolean isAnimal, String definicao){
		this.nome = nome;
		this.peso = peso;
		this.isAnimal = isAnimal;
		this.definicao = definicao;
	}
	
	public Item(String nome, boolean isAnimal, String definicao){
		this.nome = nome;
		this.isAnimal = isAnimal;
		this.definicao = definicao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public boolean isAnimal() {
		return isAnimal;
	}

	public void setAnimal(boolean isAnimal) {
		this.isAnimal = isAnimal;
	}

	public String getDefinicao() {
		return definicao;
	}

	public void setDefinicao(String definicao) {
		this.definicao = definicao;
	}

	
	
}
