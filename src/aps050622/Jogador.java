package aps050622;

public class Jogador {

	private String nome;
	protected int idade;
	protected int habilidade;
	private int gols;
	private int camisa;

	public Jogador(String nome, int idade, int habilidade) {
		this.nome = nome;
		this.idade = idade;
		this.habilidade = habilidade;
	}

	public void somaGol() {
		this.gols++;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public int getHabilidade() {
		return habilidade;
	}

	public void setHabilidade(int habilidade) {
		this.habilidade = habilidade;
	}

	public int getGols() {
		return gols;
	}

	public void setGols(int gols) {
		this.gols = gols;
	}

	public int getCamisa() {
		return camisa;
	}

	public void setCamisa(int camisa) {
		this.camisa = camisa;
	}
	
	@Override
	public String toString() {
		return "nome: " + nome 
				+ ", idade: " + idade
				+ ", gols: " + gols
				+ ", camisa: " + camisa;
	}


}
