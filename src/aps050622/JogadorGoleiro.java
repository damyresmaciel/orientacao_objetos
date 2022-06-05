package aps050622;

public class JogadorGoleiro extends Jogador {
	private int reflexos;
	private double altura;

	public JogadorGoleiro(String nome, int idade, int habilidade, int reflexos, double altura) {
		super(nome, idade, habilidade);
		this.reflexos = reflexos;
		this.altura = altura;
		setHabilidade(habilidade);

	}

	@Override
	public int getHabilidade() {
		return super.getHabilidade();
	}

	@Override
	public void setHabilidade(int habilidade) {
		habilidade = ((habilidade * 5) + (((int) (altura * 100)) * 2) + (reflexos * 3)) / 10;
		super.setHabilidade(habilidade);
	}

	public int getReflexos() {
		return reflexos;
	}

	public void setReflexos(int reflexos) {
		this.reflexos = reflexos;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	@Override
	public String toString() {
		return "\n\t\t" + super.toString() 
				+ ", reflexos: " + reflexos 
				+ ", altura: " + altura 
				+ ", habilidade: " + super.getHabilidade();
	}

}
