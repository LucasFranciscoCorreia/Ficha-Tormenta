package br.ufrpe.negocios.beans;
public class Personagem {
	private Atributos forca, destreza, constituicao, inteligencia, sabedoria, carisma;
	private String nome, nomeJogador, divindade;
	private int classeArmaadura;
	private Classe classe;
	private Moedas TL, TO, TP, TS;
	private Tendencia tendencia;
	private Nivel nivel;
	private Arma arma;
	
	public static void main(String[] args) {
		Personagem p = new Personagem();
	}
	
}