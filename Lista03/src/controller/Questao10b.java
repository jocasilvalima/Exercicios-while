package controller;//GbP

public class Questao10b {

	/*
	 * Desenvolver um programa que apresente as potências de 3 variando de 0 a 15.
	 * Deve ser considerado que qualquer número elevado a zero é 1, e elevado a 1 é
	 * ele próprio. A apresentação deve observar a seguinte exibição na tela:
	 * 
	 * 3 elevado à 0 = 1 3 elevado à 1 = 3 3 elevado à 2 = 9 (...) 3 elevado à 15 =
	 * 14348907
	 * 
	 * OBS: Tente fazer em uma classe utilizando Math.pow() e em outra classe sem
	 * utilizar Math.pow()
	 */

	public static void main(String[] args) {

		int i = 0, mul = 1;

		while (i <= 15) {
			
			System.out.println("3 elevado a " + i + " = " + mul + "²");
			mul *= 3;
			i++;
		}

	}

}
