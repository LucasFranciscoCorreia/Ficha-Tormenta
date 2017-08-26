package br.ufrpe.negocios.beans;

public class Nivel {

	private int lvlAtual;
	private int expAtual;
	private int expProximoNivel;
	private int i;
	
	public int getLvlAtual() {
		return lvlAtual;
	}

	public int getExpAtual() {
		return expAtual;
	}

	public int getExpProximoNivel() {
		return expProximoNivel;
	}
	
	private void upar(){
		//TODO subir nivel de personagem, classe  e alterar exp para proximo nivel
	}
	
	public Nivel(int lvlAtual, int ouroInicial){
		this.lvlAtual = lvlAtual;
		this.expProximoNivel = 0;
		for(i = 1;i <= lvlAtual;i++){
			this.expAtual = expProximoNivel;
			this.expProximoNivel += i*1000;
		}
		Moedas.TO.setMoedas(ouroInicial);;
	}

	public void ganharExp(int i){
		this.expAtual += i;
	}
	
	public static void main(String[] args) {
		Nivel n = new Nivel(2,100);
		System.out.println(n.getExpAtual());
		System.out.println(n.getExpProximoNivel());
		System.out.println(n.getLvlAtual());
	}
}