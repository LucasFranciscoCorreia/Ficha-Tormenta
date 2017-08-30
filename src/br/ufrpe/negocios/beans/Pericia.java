package br.ufrpe.negocios.beans;

import br.ufrpe.negocios.Personagem;

public class Pericia {
	private String nome;
	private boolean graduado;
	private Atributos modificador;
	private int bonus;
	
	public Pericia(String nome, Atributos modificador, int bonus, boolean isGraduado){
		this.nome = nome;
		this.graduado = isGraduado;
		this.modificador = modificador;
		this.bonus = bonus;
	}
	
	public int getBonusTeste(Personagem p){
		return this.modificador.getModificador() + bonus + (graduado ? 4 + p.getNivel().getMeioNivel() : p.getNivel().getMeioNivel()); 
	}
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public boolean isGraduado() {
		return graduado;
	}

	public void setGraduado(boolean graduado) {
		this.graduado = graduado;
	}

	public Atributos getModificador() {
		return modificador;
	}

	public void setModificador(Atributos modificador) {
		this.modificador = modificador;
	}

	public int getBonus() {
		return bonus;
	}

	public void setBonus(int bonus) {
		this.bonus = bonus;
	}
}