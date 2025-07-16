package String2;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		String texto = new String();
		
		System.out.print("Digite um texto ");
		texto = scanner.nextLine();
		
		String []palavras=texto.split(" ");
		
		for (int i=0; i<palavras.length; i++) {
			System.out.println(palavras[i]);
		}
				
		scanner.close();
	}

}
