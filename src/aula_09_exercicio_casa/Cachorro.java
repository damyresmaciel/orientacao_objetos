package aula_09_exercicio_casa;

public class Cachorro {
	
	private String nome;
	private String raca;
	
	

	public Cachorro(String nome, String raca) {
		super();
		this.nome = nome;
		this.raca = raca;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}
	
	public String latir() {
		return "latindo";
	}
	public String dormir() {
		return "dormindo";
	}
	public String comer() {
		return "Comendo";
	}

	@Override
	public String toString() {
		return "Cachorro \nNome: " + nome + "\nRaça: " + raca;
	}
	
	

}
