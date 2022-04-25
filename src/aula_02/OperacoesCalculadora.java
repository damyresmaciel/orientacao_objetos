package aula_02;

public class OperacoesCalculadora {

	public static void main(String[] args) {

		Calculadora operacao = new Calculadora();

		double soma = operacao.somar(12, 12);

		double subtracao = operacao.subtrair(10, 5);

		double multiplicar = operacao.multiplicar(10, 12);

		double divisao = operacao.dividir(14, 7);

		System.out.println("A soma dos números é " + soma);

		System.out.println("A subtração dos números é " + subtracao);

		System.out.println("A multiplicação dos números é " + multiplicar);
		
		System.out.println("A divisão dos números é " + divisao);
	}
}
