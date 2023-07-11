package controller;//GbP

public class Questao15 {

	/*
	 * Desenvolver um programa que apresente a série de Fibonacci até o décimo
	 * quinto termo. A série de Fibonacci é formada pela sequência
	 * 1,1,2,3,5,8,13,21,34, ... etc. Ela se caracteriza pela soma de um termo
	 * posterior com seu anterior subsequente.
	 */
	public static void main(String[] args) {

		int ant = 1, pos = 1, cont = 1;

		while (cont <= 15) {

			System.out.print(ant + " ");
			int soma = ant + pos;
			ant = pos;
			pos = soma;
			cont++;
		}

	}

}
