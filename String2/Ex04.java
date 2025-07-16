package String2;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		String frase = new String();
		String palavra = new String();
		
		System.out.print("Digite uma frase seu abençõado: ");
		frase = scanner.nextLine();
		
		System.out.print("Informe uma palavra");
		palavra = scanner.nextLine();
		
		String []verifi = frase.split(" ");
		
		int counter=0;
		
		for(int i = 0; i<verifi.length; i++) {
		if (verifi[i].equals(palavra)) {
		counter++;
		}
		}
		System.out.print(counter);
	}

}
