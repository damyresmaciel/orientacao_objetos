package aps050622;

public class JogadorDefesa extends Jogador {
	private int cobertura;
	private int desarme;
	private double altura;
	private int reflexos;

	public JogadorDefesa(String nome, int idade, int habilidade, int cobertura, int desarme, double altura, int reflexos) {
		super(nome, idade, habilidade);
		this.cobertura = cobertura;
		this.desarme = desarme;
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
		habilidade =  ((habilidade*5) + (cobertura*3) + (desarme*2)) /10;
		super.setHabilidade(habilidade);
	}

	public int getCobertura() {
		return cobertura;
	}

	public void setCobertura(int cobertura) {
		this.cobertura = cobertura;
	}

	public int getDesarme() {
		return desarme;
	}

	public void setDesarme(int desarme) {
		this.desarme = desarme;
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
		return "\n\t\t"+ super.toString() 
				+ ", cobertura: " + cobertura 
				+ ", desarme: " + desarme 
				+ ", altura: " + altura 
				+ ", reflexos: " + reflexos 
				+ ", habilidade: " + super.getHabilidade();
	}

	

}
