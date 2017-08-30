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

	public int getMeioNivel(){
		return this.lvlAtual/2;
	}
	private void upar(){
		this.expAtual = expProximoNivel;
		this.expProximoNivel += i*1000;
		this.lvlAtual++;
		//TODO subir nivel de personagem, classe  e alterar exp para proximo nivel
	}


	public Nivel(int lvlAtual) throws NivelInvalidoException{
		if(lvlAtual >0){
			this.lvlAtual = lvlAtual;
			this.expProximoNivel = 0;
			for(i = 1;i <= lvlAtual;i++){
				upar();
			}
			Moedas.TO.setMoedas(ouroInicial());;
		}else{
			throw new NivelInvalidoException();
		}
	}

	private int ouroInicial() {
		int res = 0;
		switch(this.lvlAtual){

		case 1:
			res = 100;
			break;

		case 2: 
			res = 300;
			break;

		case 3: 
			res = 600;
			break;

		case 4: 
			res = 1000;
			break;

		case 5: 
			res = 2000;
			break;

		case 6:
			res = 3000;
			break;

		case 7: 
			res = 5000;
			break;

		case 8: 
			res = 7000;
			break;

		case 9: 
			res = 10000;
			break;

		case 10: 
			res = 13000;
			break;

		case 11:
			res = 19000;
			break;

		case 12:
			res = 27000;
			break;

		case 13:
			res = 36000;
			break;

		case 14:
			res = 49000;
			break;

		case 15:
			res = 66000;
			break;

		case 16:
			res = 88000;
			break;

		case 17:
			res = 110000;
			break;

		case 18:
			res = 150000;
			break;

		case 19:
			res = 200000;
			break;

		case 20:
			res = 260000;
			break;

		default:
			res = 100;
		}

		return res;
	}

	public void ganharExp(int i){
		this.expAtual += i;
		if(expAtual >= expProximoNivel){
			int salvar = expAtual;
			upar();
			expAtual = salvar;
		}
	}
}