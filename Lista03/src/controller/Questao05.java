package controller;//GbP

import util.Teclado;

public class Questao05 {

	/*
	 * Desenvolver um programa que apresente os resultados de uma tabela de um
	 * número qualquer. Ela deve serimpressa no seguinte formato: Considerando como
	 * exemplo o fornecimento do número 2
	 * 
	 * 2 . 1 = 2 2 . 2 = 4 2 . 3 = 6 2 . 4 = 8 2 . 5 = 10 (...) 2 . 10 = 20
	 */

	public static void main(String[] args) {
		System.out.println("__________________");
		int num = Teclado.lerInt("Digite o um numero:");
		System.out.println("__________________");
		int i = 1;
		while (i <= 10) {
			// int mul = num * i;
			System.out.println(num + "." + i + " = " + (num * i));
			i++;

		}

	}

}
