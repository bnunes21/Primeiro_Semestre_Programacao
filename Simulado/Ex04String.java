package Simulado;

import java.util.Scanner;

public class Ex04String {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		String frase = new String ();
		String palavra = new String ();

		System.out.print("Digite uma frase: ");
		frase = scanner.nextLine();
		
		System.out.print("Digite uma palavra: ");
		palavra = scanner.nextLine();
		
		int aurelio = papa(palavra, frase);
		System.out.print(aurelio);
	}
	
	static int papa (String palavra, String frase) {
		String []timoteo = frase.split(" ");
		
		int counter =0;
		for (int i=0; i<timoteo.length; i++) {
			if (timoteo[i].equalsIgnoreCase(palavra)) {
				counter++;
			}
		}
			return counter;
		}
	}


