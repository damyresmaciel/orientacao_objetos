package aula_02;

public class OperacoesCalculadora {

	public static void main(String[] args) {

		Calculadora operacao = new Calculadora();

		double soma = operacao.somar(12, 12);

		double subtracao = operacao.subtrair(10, 5);

		double multiplicar = operacao.multiplicar(10, 12);

		double divisao = operacao.dividir(14, 7);

		System.out.println("A soma dos n�meros � " + soma);

		System.out.println("A subtra��o dos n�meros � " + subtracao);

		System.out.println("A multiplica��o dos n�meros � " + multiplicar);
		
		System.out.println("A divis�o dos n�meros � " + divisao);
	}
}
