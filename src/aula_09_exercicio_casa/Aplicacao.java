package aula_09_exercicio_casa;

public class Aplicacao {
	public static void main(String[] args) {

		Cachorro cao = new Cachorro("Dogão", "vira-lata");

		CachorroAdestrado caoAdestrado = new CachorroAdestrado("Nezuko", "pitbull");

		imprime(cao);
		imprime(caoAdestrado);

	}

	public static void imprime(Cachorro cao) {

		System.out.println("Nome: " + cao.getNome());
		System.out.println("Raça: " + cao.getRaca());
		System.out.println(cao.dormir());
		System.out.println(cao.latir());
		System.out.println(cao.comer());
		System.out.println();

	}

	public static void imprime(CachorroAdestrado cao) {

		System.out.println("Nome: " + cao.getNome());
		System.out.println("Raça: " + cao.getRaca());
		System.out.println(cao.dormir());
		System.out.println(cao.latir());
		System.out.println(cao.comer());

		System.out.println(cao.deitar());
		System.out.println(cao.fingirDeMorto());
		System.out.println(cao.rolar());

	}

}
