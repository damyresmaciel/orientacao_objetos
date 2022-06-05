package aps050622;

import java.util.Date;

public class Partida {
	private Date data;
	private Time timeCasa;
	private Time timeVisitante;
	private int placarCasa;
	private int placarVisitante;

	public Partida(Date data, Time timeCasa, Time timeVisitante) {
		this.data = data;
		this.timeCasa = timeCasa;
		this.timeVisitante = timeVisitante;
	}

	public String getPlacar() {
		return timeCasa.getNome() + " " + timeCasa.getGols() + " x " + timeVisitante.getGols() + " " + timeVisitante.getNome();
	}

	public void golCasa(Jogador jogador) {
		timeCasa.somaGol();
		jogador.somaGol();
		System.out.println("Gol do time da casa, " + timeCasa.getNome() + ", " + jogador.getNome() + ", " + jogador.getGols());

	}

	public void golVisitante(Jogador jogador) {
		timeVisitante.somaGol();
		jogador.somaGol();
		System.out.println("Gol do time visitante, " + timeVisitante.getNome() + ", " + jogador.getNome() + ", " + jogador.getGols());

	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public Time getTimeCasa() {
		return timeCasa;
	}

	public void setTimeCasa(Time timeCasa) {
		this.timeCasa = timeCasa;
	}

	public Time getTimeVisitante() {
		return timeVisitante;
	}

	public void setTimeVisitante(Time timeVisitante) {
		this.timeVisitante = timeVisitante;
	}

	public int getPlacarCasa() {
		return placarCasa;
	}

	public void setPlacarCasa(int placarCasa) {
		this.placarCasa = placarCasa;
	}

	public int getPlacarVisitante() {
		return placarVisitante;
	}

	public void setPlacarVisitante(int placarVisitante) {
		this.placarVisitante = placarVisitante;
	}

	public String toString() {
		return "\nPartida data: " + data 
				+ "\n\nPlacar: " + getPlacar() 
				+ "\n\nTime casa: " + timeCasa.imprimeTime()
				+ "\n\nTime visitante: " + timeVisitante.imprimeTime();
	}

}
