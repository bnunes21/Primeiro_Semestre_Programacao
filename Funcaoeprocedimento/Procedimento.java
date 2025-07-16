package Funcaoeprocedimento;

import java.util.Scanner;

public class Procedimento {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		String frase = new String();
		String palavra = new String();
		
		System.out.print("Digite uma frase seu abençõado: ");
		frase = scanner.nextLine();
		
		System.out.print("Informe uma palavra");
		palavra = scanner.nextLine();
		
		int amadeu = A(palavra,frase);
		System.out.print(amadeu);
		
	}
	
		static int A (String palavra ,String frase ) {
		
		String []verifi = frase.split(" ");
		int counter=0;
		
		for(int i = 0; i<verifi.length; i++) {
		if (verifi[i].equalsIgnoreCase(palavra)) {
		counter++;
		
		}
	}
	
		return counter;
		
		}
	}
