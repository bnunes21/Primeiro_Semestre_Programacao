package Repeticao;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		System.out.print("Informe um numero ");
		int numero1 = scanner.nextInt();
		System.out.print("Informe mais um numero ");
		int numero2 = scanner.nextInt();
		
		while(numero2==0) {
			System.out.print("NUMERO INVÁLIDO ");
			System.out.print("Informe mais um numero ");
			numero2 = scanner.nextInt();
		}
		double calc = numero1/numero2;
		System.out.println("O valor da divisão foi de: " +calc);
		
		
		scanner.close();
	}

}
