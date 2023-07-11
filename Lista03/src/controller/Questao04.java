package controller;//Gbp

public class Questao04 {

	/*
	 * Desenvolver um programa que apresente o valor da soma dos cem primeiros
	 * números inteiros (1 + 2 + 3 + 4 + ...+ 97 + 98 + 99 + 100)
	 */

	public static void main(String[] args) {

		int i = 1, soma = 0;

		while (i <= 100) {
			soma += i;
			i++;
		}
		System.out.println(soma);
	}

}
