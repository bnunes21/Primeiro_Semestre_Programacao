package Simulado;

import java.util.Scanner;

public class Ex02String {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		String texto = new String();
		System.out.print("Digite o texto: ");
		texto=scanner.nextLine();
		
		String []palavra=texto.split(" ");
		
		a(palavra);
		
	}
	
	static void a (String [] palavra) {
		for(int i=0; i<palavra.length; i++) {
			System.out.println(palavra[i]);
		}
	}

}
