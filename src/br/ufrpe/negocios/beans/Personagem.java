package br.ufrpe.negocios.beans;
public class Personagem {
	private Atributos status;
	private String nome, tendencia, nomeJogador, classe;
	private int nivel, classeArmaadura;
	private float BBA;
	private Moedas bolsa;
	
	public static void main(String[] args) {
		Personagem p = new Personagem();
		p.bolsa.TL.setMoedas(10);
		System.out.println(p.bolsa.TL.getMoedas());	
	}
}