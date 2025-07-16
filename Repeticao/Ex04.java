package Repeticao;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		double total=0;
		double numero=0;
			for (int i =1; i<11; i++) {
				System.out.print("Informe o "+i+ " Numero: ");
				numero = scanner.nextInt();
			total +=numero;
			}
			double calc = total /10;
			System.out.println(calc);
	}

}
