package Strings;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		String texto = new String();
		
		System.out.print("Digite um texto: ");
		texto = scanner.nextLine();
		
		palavra(texto);
	}
	static void palavra (String texto) {
		String []palavras = texto.split(" ");
		
		int counter=0;
		
		for (int i = 0; i<palavras.length;i++) {
			counter++;
		}
		System.out.println("Total de palavras digitadas: "+ counter);
	}

}
