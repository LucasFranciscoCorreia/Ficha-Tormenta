package br.ufrpe.negocios.beans;
public class Armadura extends Item{
	private int bonusCA;
	private int bonusMaxDes;
	private int penalidadeArmadura;
	private String tipo;
	
	public Armadura(String nome, float peso, boolean isAnimal, String definicao, int bonusCA, int bonusMaxDes, int penalidadeArmadura, String tipo) {
		super(nome, peso, isAnimal, definicao);
		this.bonusCA = bonusCA;
		this.bonusMaxDes = bonusMaxDes;
		this.penalidadeArmadura = penalidadeArmadura;
		this.tipo = tipo;	
	}

	public int getBonusCA() {
		return bonusCA;
	}

	public void setBonusCA(int bonusCA) {
		this.bonusCA = bonusCA;
	}

	public int getBonusMaxDes() {
		return bonusMaxDes;
	}

	public void setBonusMaxDes(int bonusMaxDes) {
		this.bonusMaxDes = bonusMaxDes;
	}

	public int getPenalidadeArmadura() {
		return penalidadeArmadura;
	}

	public void setPenalidadeArmadura(int penalidadeArmadura) {
		this.penalidadeArmadura = penalidadeArmadura;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}	
}