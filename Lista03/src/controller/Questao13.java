package controller;//GbP

public class Questao13 {
	
	/*13) Desenvolver um programa que imprima a tabuada de 3 a 6.
	 */

	public static void main(String[] args) {
		int num1 = 3,num2;
		
		while (num1 <=6) {
			
			num2 = 0;
			
			while(num2 <= 10) {
				System.out.println(num1 + " . " + num2 + " = " +(num1*num2));
			
			num2++;	
			}//fim do mum2
				
				
			num1++;
		}//fim do while num1
		

	}

}
