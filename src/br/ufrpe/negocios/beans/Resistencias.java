package br.ufrpe.negocios.beans;
public class Resistencias {
	public static int getTesteFortitude(int meioNivel, Atributos constituicao, int outros){
		if(constituicao == Atributos.Constituicao){
			return meioNivel+constituicao.getModificador() + outros;
		}else{
			//TODO exception Atributo invalido
		}
		return 0;
	}
	
	public static int getTesteReflexo(int meioNivel, Atributos destreza, int outros){
		if(destreza == Atributos.Destreza){
			return meioNivel+destreza.getModificador()+outros;
		}else{
			//TODO exception Atributo invalido
		}
		return 0;
	}
	
	public static int getTesteVontade(int meioNivel, Atributos sabedoria, int outros){
		if(sabedoria == Atributos.Sabedoria){
			return meioNivel+sabedoria.getModificador()+outros;
		}else{
			//TODO exception Atributo invalido
		}
		return 0;
	}
}