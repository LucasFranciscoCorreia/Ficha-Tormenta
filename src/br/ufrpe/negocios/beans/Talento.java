package br.ufrpe.negocios.beans;
public class Talento {
	private String nome;
	private String definição;
	private String beneficios;
	
	public String getNome() {
		return nome;
	}

	public String getDefinição() {
		return definição;
	}

	public String getBeneficios() {
		return beneficios;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setDefinição(String definição) {
		this.definição = definição;
	}

	public void setBeneficios(String beneficios) {
		this.beneficios = beneficios;
	}

	public Talento(String nome, String definição, String beneficios){
		this.nome = nome;
		this.definição = definição;
		this.beneficios = beneficios;
	}
}
