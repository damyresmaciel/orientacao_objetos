package aps050622;

public class JogadorAtacante extends Jogador {

	private int velocidade;
	private int tecnica;
	private double altura;
	private int reflexos;

	public JogadorAtacante(String nome, int idade, int habilidade, int velocidade, int tecnica, double altura,
			int reflexos) {
		super(nome, idade, habilidade);
		this.velocidade = velocidade;
		this.tecnica = tecnica;
		this.altura = altura;
		this.reflexos = reflexos;
		setHabilidade(habilidade);
	}

	@Override
	public int getHabilidade() {
		return super.getHabilidade();
	}

	@Override
	public void setHabilidade(int habilidade) {
		habilidade =  ((habilidade*5) + (velocidade*2) + (tecnica*3)) /10;
		super.setHabilidade(habilidade);
	}

	public int getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}

	public int getTecnica() {
		return tecnica;
	}

	public void setTecnica(int tecnica) {
		this.tecnica = tecnica;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public int getReflexos() {
		return reflexos;
	}

	public void setReflexos(int reflexos) {
		this.reflexos = reflexos;
	}

	@Override
	public String toString() {
		return "\n\t\t" + super.toString()
						+ ", velocidade: " + velocidade 
						+ ", técnica: " + tecnica
						+ ", altura: " + altura
						+ ", reflexos: " + reflexos
						+ ", habilidade: " + super.getHabilidade();
	}

}
