package br.ufrpe.negocios;

import br.ufrpe.negocios.beans.Arma;
import br.ufrpe.negocios.beans.Armadura;
import br.ufrpe.negocios.beans.Atributos;
import br.ufrpe.negocios.beans.Moedas;
import br.ufrpe.negocios.beans.Nivel;
import br.ufrpe.negocios.beans.Tendencia;
import br.ufrpe.repositorios.Classes;
import br.ufrpe.repositorios.Inventario;
import br.ufrpe.repositorios.Magias;
import br.ufrpe.repositorios.Pericias;
import br.ufrpe.repositorios.Talentos;

public class Personagem {
	
	private Atributos forca, destreza, constituicao, inteligencia, sabedoria, carisma;
	private String nome, nomeJogador, divindade;
	private int classeArmadura;
	private Classes classes;
	private Moedas TL, TO, TP, TS;
	private Tendencia tendencia;
	private Magias magias;
	private Inventario inventario;
	private Pericias pericias;
	private Talentos talentos;
	private Nivel nivel;
	private Arma arma;
	private Armadura armadura;
	
	public Personagem(Nivel n){
		this.nivel = n;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNomeJogador() {
		return nomeJogador;
	}

	public void setNomeJogador(String nomeJogador) {
		this.nomeJogador = nomeJogador;
	}

	public String getDivindade() {
		return divindade;
	}

	public void setDivindade(String divindade) {
		this.divindade = divindade;
	}

	public int getClasseArmadura() {
		return classeArmadura;
	}

	public void setClasseArmadura(int classeArmadura) {
		this.classeArmadura = classeArmadura;
	}

	public Tendencia getTendencia() {
		return tendencia;
	}

	public void setTendencia(Tendencia tendencia) {
		this.tendencia = tendencia;
	}

	public Pericias getPericias() {
		return pericias;
	}

	public void setPericias(Pericias pericias) {
		this.pericias = pericias;
	}

	public Arma getArma() {
		return arma;
	}

	public void setArma(Arma arma) {
		this.arma = arma;
	}

	public Armadura getArmadura() {
		return armadura;
	}

	public void setArmadura(Armadura armadura) {
		this.armadura = armadura;
	}

	public Atributos getForca() {
		return forca;
	}

	public Atributos getDestreza() {
		return destreza;
	}

	public Atributos getConstituicao() {
		return constituicao;
	}

	public Atributos getInteligencia() {
		return inteligencia;
	}

	public Atributos getSabedoria() {
		return sabedoria;
	}

	public Atributos getCarisma() {
		return carisma;
	}

	public Classes getClasses() {
		return classes;
	}

	public Moedas getTL() {
		return TL;
	}

	public Moedas getTO() {
		return TO;
	}

	public Moedas getTP() {
		return TP;
	}

	public Moedas getTS() {
		return TS;
	}

	public Magias getMagias() {
		return magias;
	}

	public Inventario getInventario() {
		return inventario;
	}

	public Talentos getTalentos() {
		return talentos;
	}

	public Nivel getNivel() {
		return nivel;
	}

	
}