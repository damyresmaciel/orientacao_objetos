package aps050622;

import java.util.Date;

public class Programa {

	public static void main(String[] args) {

		Jogador pedroAtacante = new JogadorAtacante("Pedro", 21, 45, 2, 1, 1.80, 2);
		Jogador marcosAtacante = new JogadorAtacante("Marcos", 22, 2, 4, 3, 1.75, 4);
		Jogador alvesDefesa = new JogadorDefesa("Alves", 19, 5, 3, 2, 1.65, 3);
		Jogador oliveiraDefesa = new JogadorDefesa("Oliveira", 25, 3, 2, 1, 1.85, 4);
		Jogador silvaGoleiro = new JogadorGoleiro("Silva", 30, 1, 1, 1.70);

		Jogador andreAtacante = new JogadorAtacante("André", 23, 5, 2, 1, 1.68, 1);
		Jogador pauloAtacante = new JogadorAtacante("Paulo", 22, 2, 4, 3, 1.70, 3);
		Jogador ronaldoDefesa = new JogadorDefesa("Ronaldo", 19, 5, 3, 2, 1.73, 4);
		Jogador julioDefesa = new JogadorDefesa("Júlio", 25, 3, 2, 1, 1.65, 2);
		Jogador juniorGoleiro = new JogadorGoleiro("Júnior", 30, 1, 1, 1.75);

		Time timeCasa = new Time("Italia");
		timeCasa.insereJogador(pedroAtacante);
		timeCasa.insereJogador(marcosAtacante);
		timeCasa.insereJogador(alvesDefesa);
		timeCasa.insereJogador(oliveiraDefesa);
		timeCasa.insereJogador(silvaGoleiro);
		
		Time timeVisitante = new Time("Espanha");
		timeVisitante.insereJogador(andreAtacante);
		timeVisitante.insereJogador(pauloAtacante);
		timeVisitante.insereJogador(ronaldoDefesa);
		timeVisitante.insereJogador(julioDefesa);
		timeVisitante.insereJogador(juniorGoleiro);

		Partida partida = new Partida(new Date(), timeCasa, timeVisitante);

		System.out.println(partida.toString());
		
		System.out.println();
		
		partida.golVisitante(andreAtacante);
		partida.golVisitante(pauloAtacante);
		partida.golCasa(marcosAtacante);
		
		System.out.println();
		System.out.println("Resultado final: " + partida.getPlacar());


	}

}
