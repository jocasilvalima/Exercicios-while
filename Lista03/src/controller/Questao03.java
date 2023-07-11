package controller;//GbP

public class Questao03 {

	/*
	 * Desenvolver um programa que apresente os quadrados dos números inteiros de 15
	 * a 200.
	 */

	public static void main(String[] args) {

		int i = 15;

		while (i <= 200) {
			System.out.println(i + " elevado ao quadrado é: " + Math.pow(i, 2) + ("²"));
			i++;
		}

	}

}
