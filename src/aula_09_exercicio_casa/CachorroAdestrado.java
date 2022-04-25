package aula_09_exercicio_casa;

public class CachorroAdestrado extends Cachorro {

	public CachorroAdestrado(String nome, String raca) {
		super(nome, raca);

	}

	public String deitar() {
		return "deitado";
	}

	public String rolar() {
		return "rolando";
	}

	public String fingirDeMorto() {
		return "figindo de morto";
	}

}
