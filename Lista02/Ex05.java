package Lista02;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		System.out.print("Informe a quantidade do produto em estoque: ");
		int estoque = scanner.nextInt();
		System.out.print("Informe a quantidade maxima do produto em estoque: ");
		int maxima = scanner.nextInt();
		System.out.print("Informe a quantidade minima do produto em estoque: ");
		int minima = scanner.nextInt();
		
		double calcMedia = (maxima+minima)/2;
		
		if (estoque>=calcMedia) {
			System.out.println("NÃO EFETUAR A COMPRA DO PRODUTO");			
		}
		else 
			System.out.println("EFETUAR A COMPRA DO PRODUTO");
		
		
		scanner.close();
	}

}
