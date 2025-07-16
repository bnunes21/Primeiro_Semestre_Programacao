package Simulado;

import java.util.Scanner;

public class Ex01String {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		String palavra = new String();
		
		System.out.print("Digite uma palavra: ");
		palavra = scanner.nextLine();
		
		char []letras = palavra.toCharArray(); 
		
		
		
		for (int i = letras.length-1;i>=0; i--) {
			System.out.print(letras[i]);
			
		}
		
	}

}
