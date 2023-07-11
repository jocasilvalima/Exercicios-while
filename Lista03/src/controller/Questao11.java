package controller;//GbP

import util.Teclado;

public class Questao11 {
	
	/*Elaborar um programa que apresente o valor de uma potência de uma 
	 * base qualquer (Variável b) elevada a um expoente qualquer 
	 * (Variável e), ou seja, de b e . (Sem usar Math.pow();)
     */
	
	
	public static void main(String[] args) {
		
		int i = 1;
		int base = Teclado.lerInt("digite a basa da potência");
		int pot = Teclado.lerInt("digite o numero da potência");
		int mul = 1;
		
		while (i <= pot) {
			mul *= base;
			
			i++;
		}
		System.out.println(base + " elevado a " + pot + " = " + mul);

	}

}
