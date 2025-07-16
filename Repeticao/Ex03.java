package Repeticao;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		

		System.out.print("Informe um numero entre 1 e 10: ");
		int numero = scanner.nextInt();
		
		while (numero>10||numero<1) {
			System.out.println(" NUMERO INVALIDO ");
			System.out.print("Informe um numero entre 1 e 10: ");
			numero = scanner.nextInt();
		}
		for(int i =1; i<11;i++) {
			int calc = numero*i;
			
			System.out.println("A tabuada do numero "+numero+" x "+i+ " = " +calc);
		}
		
		
		scanner.close();
	}

}
