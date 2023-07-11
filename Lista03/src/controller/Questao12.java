package controller; //GbP

import util.Teclado;

public class Questao12 {

	/*
	 * Desenvolver um programa que peça ao usuário para digitar diversos números
	 * reais, e ao final, exibir o maior e o menor número que foram digitados, além
	 * da média entre TODOS os números digitados pelo usuário. A inserçãode números
	 * deve parar quando o usuário digitar o número -1, e este número -1 não deve
	 * ser considerado nemcomo maior, nem como menor, e nem na contagem da média
	 */

	public static void main(String[] args) {

		double num = Teclado.lerDouble("Digite qualquer numero quando quiser para digite -1");
		double maior = num, menor = num, cont = 1, soma = 0;

		while (num != -1) {

			if (maior < num) {
				maior = num;
			} // fim if

			if (menor > num) {
				menor = num;
			} // fim do if

			soma += num;

			num = Teclado.lerDouble("Digite qualquer numero quando quiser para digite -1");
			cont++;
		} // fim do while

		double media = soma / (cont - 1);

		if (menor == -1) {
			System.out.println("você digitou a sida do programa");
		} // fim do if
		else {
			System.out.println("o maior numero é: " + maior);
			System.out.println("o menor numero é " + menor);
			System.out.println("a media é: " + media);
		} // fim do else
		System.out.println("fim do programa");
	}
}
