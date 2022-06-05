package aps050622;

import java.util.ArrayList;
import java.util.List;

public class Time {

	private String nome;
	private List<Jogador> jogadores = new ArrayList<>();
	private int vitorias;
	private int derrotas;
	private int empates;
	private int gols;

	public Time(String nome) {
		this.nome = nome;
	}
	
	public void somaGol() {
		this.gols++;
	}
	
	public void insereJogador (Jogador jogador) {
		this.jogadores.add(jogador);
	}

	public void imprimiJogadores() {
		for (Jogador jogador : jogadores) {
			System.out.println(jogador);
		}
	}

	public void somaVitoria() {
		this.vitorias++;
	}

	public void somaDerrota() {
		this.derrotas++;
	}

	public void somaEmpate() {
		this.empates++;
	}

	public String getNome() {
		return nome;
	}

	public int getGols() {
		return gols;
	}

	public void setGols(int gols) {
		this.gols = gols;
	}

	public String getResultado() {
		return "Vitórias: " + vitorias + ", Empates: " + empates + ", Derrotas: " + derrotas;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Jogador> getJogadores() {
		return jogadores;
	}

	public void setJogadores(List<Jogador> jogadores) {
		this.jogadores = jogadores;
	}

	public int getVitorias() {
		return vitorias;
	}

	public void setVitorias(int vitorias) {
		this.vitorias = vitorias;
	}

	public int getDerrotas() {
		return derrotas;
	}

	public void setDerrotas(int derrotas) {
		this.derrotas = derrotas;
	}

	public int getEmpates() {
		return empates;
	}

	public void setEmpates(int empates) {
		this.empates = empates;
	}

	public String imprimeTime() {
		return nome + ", " + getResultado() +  "\n" + "\tjogadores = " + jogadores;
	}

}
