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
	
	public Personagem(Nivel n){
		this.nivel = n;
	}
	
	public Atributos getForca() {
		return forca;
	}

	public void setForca(Atributos forca) {
		this.forca = forca;
	}

	public Atributos getDestreza() {
		return destreza;
	}

	public void setDestreza(Atributos destreza) {
		this.destreza = destreza;
	}

	public Atributos getConstituicao() {
		return constituicao;
	}

	public void setConstituicao(Atributos constituicao) {
		this.constituicao = constituicao;
	}

	public Atributos getInteligencia() {
		return inteligencia;
	}

	public void setInteligencia(Atributos inteligencia) {
		this.inteligencia = inteligencia;
	}

	public Atributos getSabedoria() {
		return sabedoria;
	}

	public void setSabedoria(Atributos sabedoria) {
		this.sabedoria = sabedoria;
	}

	public Atributos getCarisma() {
		return carisma;
	}

	public void setCarisma(Atributos carisma) {
		this.carisma = carisma;
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

	public int getClasseArmaadura() {
		return classeArmaadura;
	}

	public void setClasseArmaadura(int classeArmaadura) {
		this.classeArmaadura = classeArmaadura;
	}

	public Classe getClasse() {
		return classe;
	}

	public void setClasse(Classe classe) {
		this.classe = classe;
	}

	public Moedas getTL() {
		return TL;
	}

	public void setTL(Moedas tL) {
		TL = tL;
	}

	public Moedas getTO() {
		return TO;
	}

	public void setTO(Moedas tO) {
		TO = tO;
	}

	public Moedas getTP() {
		return TP;
	}

	public void setTP(Moedas tP) {
		TP = tP;
	}

	public Moedas getTS() {
		return TS;
	}

	public void setTS(Moedas tS) {
		TS = tS;
	}

	public Tendencia getTendencia() {
		return tendencia;
	}

	public void setTendencia(Tendencia tendencia) {
		this.tendencia = tendencia;
	}

	public Nivel getNivel() {
		return nivel;
	}

	public void setNivel(Nivel nivel) {
		this.nivel = nivel;
	}

	public Arma getArma() {
		return arma;
	}

	public void setArma(Arma arma) {
		this.arma = arma;
	}

	public static void main(String[] args) {
		Personagem p = new Personagem(new Nivel(1));
		p.constituicao = Atributos.Constituicao;
		p.constituicao.setValorAtributo(16);
		System.out.println(Resistencias.getTesteFortitude(p.nivel.getMeioNivel(), p.constituicao, 0));
	}
	
	
}