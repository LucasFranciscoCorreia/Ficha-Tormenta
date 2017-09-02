package br.ufrpe.negocios;

import java.io.Serializable;

import br.ufrpe.negocios.beans.Arma;
import br.ufrpe.negocios.beans.Armadura;
import br.ufrpe.negocios.beans.Atributos;
import br.ufrpe.negocios.beans.Classe;
import br.ufrpe.negocios.beans.Moedas;
import br.ufrpe.negocios.beans.Nivel;
import br.ufrpe.negocios.beans.Raca;
import br.ufrpe.negocios.beans.Tendencia;
import br.ufrpe.repositorios.Classes;
import br.ufrpe.repositorios.Inventario;
import br.ufrpe.repositorios.Magias;
import br.ufrpe.repositorios.Pericias;
import br.ufrpe.repositorios.Talentos;

public class Personagem implements Serializable{

	/**
	 * 
	 */

	private static final long serialVersionUID = 1L;
	private Atributos forca, destreza, constituicao, inteligencia, sabedoria, carisma;
	private String nome, nomeJogador, divindade, tamanho;
	private int classeArmadura, PV, PM;
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
	private Raca raca;
	
	
	
	public void setDestaques(){
		//TODO classeArmadura para quando utilizar Armadura
		
		this.classeArmadura = 10 + nivel.getMeioNivel() + (armadura != null ? (armadura.getBonusCA() > armadura.getBonusMaxDes() ? armadura.getBonusMaxDes() : armadura.getBonusCA()): 0);
		this.PV = classes.getClasses().get(0).getPVInicial() + constituicao.getModificador();
		for(int i = 1; i < nivel.getLvlAtual();i++){
			
		}
	}
	public void setAtributos(int forca, int destreza, int constituicao, int inteligencia, int sabedoria, int carisma){

		this.forca = Atributos.Força;
		this.destreza = Atributos.Destreza;
		this.constituicao = Atributos.Constituicao;
		this.inteligencia = Atributos.Inteligencia;
		this.sabedoria = Atributos.Sabedoria;
		this.carisma = Atributos.Carisma;

		this.forca.setValorAtributo(forca);
		this.destreza.setValorAtributo(destreza);
		this.constituicao.setValorAtributo(constituicao);
		this.inteligencia.setValorAtributo(inteligencia);
		this.sabedoria.setValorAtributo(sabedoria);
		this.carisma.setValorAtributo(carisma);
	}
	
	public Personagem(){
		this.TL = Moedas.TL;
		this.TO = Moedas.TO;
		this.TP = Moedas.TP;
		this.TS = Moedas.TS;
	}
	
	public void setClasses(Classes classes) {
		this.classes = classes;
	}



	public void setTL(Moedas tL) {
		TL = tL;
	}



	public void setTO(Moedas tO) {
		TO = tO;
	}



	public void setTP(Moedas tP) {
		TP = tP;
	}



	public void setTS(Moedas tS) {
		TS = tS;
	}


	public void setMagias(Magias magias) {
		this.magias = magias;
	}



	public void setInventario(Inventario inventario) {
		this.inventario = inventario;
	}



	public void setTalentos(Talentos talentos) {
		this.talentos = talentos;
	}



	public void setTamanho(String tamanho){
		this.tamanho = tamanho;
	}
	
	public String getTamanho(){
		return this.tamanho;
	}
	public int getPV() {
		return PV;
	}


	public void setNivel(Nivel n){
		this.nivel = n;
	}
	public void setPV(int pV) {
		PV = pV;
	}


	public int getPM() {
		return PM;
	}


	public void setPM(int pM) {
		PM = pM;
	}

	public Raca getRaca() {
		return raca;
	}


	public void setRaca(Raca raca) {
		this.raca = raca;
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

	public void setTendencia(String tendencia) {
		switch(tendencia){
		case ("Leal Bondoso"): this.tendencia = Tendencia.LB;break;
		case ("Leal Neutro"):this.tendencia = Tendencia.LN;break;
		case ("Leal Maligno"):this.tendencia = Tendencia.LM;break;
		case ("Neutro Bondoso"):this.tendencia = Tendencia.NB;break;
		case ("Neutro"): this.tendencia = Tendencia.N;break;
		case ("Neutro Maligno"):this.tendencia = Tendencia.NM;break;
		case ("Caotico Bondoso"):this.tendencia = Tendencia.CB;break;
		case ("Caotico Neutro"):this.tendencia = Tendencia.CN;break;
		case ("Caotico Maligno"):this.tendencia = Tendencia.CM;break;
		}
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