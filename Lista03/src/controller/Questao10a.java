package controller;//GbP

public class Questao10a {
	
	/*Desenvolver um programa que apresente as potências de 3 variando 
	 * de 0 a 15. Deve ser considerado que qualquer número elevado a zero
	 *  é 1, e elevado a 1 é ele próprio. A apresentação deve observar a seguinte exibição na tela:
     *  
     *   3 elevado à 0 = 1
     *   3 elevado à 1 = 3
     *   3 elevado à 2 = 9
     *     (...)
     *   3 elevado à 15 = 14348907
     *   
     *OBS: Tente fazer em uma classe utilizando Math.pow() e em outra classe sem utilizar Math.pow()
     */

	public static void main(String[] args) {
	  int num = 3, i = 0;
	  
	  while (i <= 15) {
		  System.out.println(num + " elevado a " + i + " = " + (Math.pow(num, i))+ "²");
		  //System.out.println(num + " elevado a " + i + " = " + (num * i)+ "²");
		  i++;
	  }
	 

	}

}


