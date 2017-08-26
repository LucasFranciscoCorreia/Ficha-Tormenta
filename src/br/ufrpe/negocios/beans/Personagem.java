package br.ufrpe.negocios.beans;
public class Personagem {
	private Atributos forca, destreza, constituicao, inteligencia, sabedoria, carisma;
	private String nome, nomeJogador, classe;
	private int classeArmaadura;
	private float BBA;
	private Moedas TL, TO, TP, TS;
	private Tendencia t;
	private Nivel nivel;
	
	public static void main(String[] args) {
		Personagem p = new Personagem();
	}
}