package controller; //GbP

public class Questao14 {

	/*
	 * Desenvolver um programa que calcule o fatorial do número 5, ou seja, 5!.
	 * Desta forma, temos que 5! = 5 . 4 . 3 .2 . 1 ou 5! = 1 . 2 . 3 . 4 . 5,
	 * equivalente a 120.
	 * 
	 */

	public static void main(String[] args) {

		int cont = 1, mul = 1;

		while (cont <= 5) {
			mul *= cont;
			cont++;
		}
		System.out.println("O fatorial de 5 é " + mul);

	}

}
