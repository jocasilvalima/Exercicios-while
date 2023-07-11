package controller;//GbP

import util.Teclado;

public class Questao06 {

	/*
	 * Desenvolver um programa que leia um número n qualquer menor ou igual a 50 e
	 * apresente o valor obtido da multiplicação sucessiva de n por 3 enquanto
	 * oproduto for menor que 250. (n x 3; n x 3 x 3; n x 3 x' 3 x 3 etc...).
	 */

	public static void main(String[] args) {

		int num = Teclado.lerInt("Digite qualquer numero de 1 a 50.");

		if (num <= 50) {

			int mul = num;

			while (mul <= 250) {

				System.out.println(mul);

				mul *= 3;
			}
		} else {
			System.out.println("ERRO Você tem que digitar um numero menor ou igual a 50.");
		}

	}

}
