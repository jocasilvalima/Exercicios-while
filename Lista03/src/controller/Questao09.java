package controller; //GbP

public class Questao09 {

	/*
	 * Elaborar um programa que apresente no final a soma dos valores pares
	 * existentes na faixa de 0 até 500. Utilize um laço que efetue a variação de 2
	 * em 2.
	 */

	public static void main(String[] args) {
		int i = 0;
		int soma = 0;

		while (i <= 500) {
			if (i % 2 == 0) {
				soma += i;
			}
			i++;
		}
		System.out.println(soma);

	}

}
