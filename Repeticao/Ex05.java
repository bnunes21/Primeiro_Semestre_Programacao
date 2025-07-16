package Repeticao;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		double total =0; 
		double numero=0;
		for (int i = 1;i<11;i++) {
			System.out.print("Informe o " +i+ "numero: ");
		numero = scanner.nextDouble();
		if (numero<0) {
			total++;
			}
		}
		
		System.out.println("O total de numeros negaticos é: "+total);
			
		
		
		scanner.close();
	}

}
