package br.ufrpe.negocios.beans;
public class Projetil extends Item{
	private boolean neededAmmo;
	private String beneficio;
	private int quantidade;
	private int quantidadeCarregado;
	private int quantidadePorPacote;
	
	public Projetil(boolean neededAmmo, String nome, String beneficio, int quantidade, String definicao){
		super(nome, 0, false, definicao);
		this.neededAmmo = neededAmmo;
		this.beneficio = beneficio;
		this.quantidade = quantidade;
	}
	
	public void consumir(){
		if(neededAmmo && this.quantidade >= 0 && this.quantidadeCarregado > 0){
			quantidadeCarregado--;
			if(quantidadeCarregado == 0 && quantidade > 0){
				quantidade--;
				quantidadeCarregado = quantidadePorPacote;
			}
		}
	}

	public boolean isNeededAmmo() {
		return neededAmmo;
	}

	public void setNeededAmmo(boolean neededAmmo) {
		this.neededAmmo = neededAmmo;
	}

	public String getBeneficio() {
		return beneficio;
	}

	public void setBeneficio(String beneficio) {
		this.beneficio = beneficio;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public int getQuantidadeCarregado() {
		return quantidadeCarregado;
	}

	public void setQuantidadeCarregado(int quantidadeCarregado) {
		this.quantidadeCarregado = quantidadeCarregado;
	}

	public int getQuantidadePorPacote() {
		return quantidadePorPacote;
	}

	public void setQuantidadePorPacote(int quantidadePorPacote) {
		this.quantidadePorPacote = quantidadePorPacote;
	}
	
	
}
