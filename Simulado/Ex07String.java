package Simulado;

import java.util.Scanner;

public class Ex07String {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		String palavra = new String();
		
		System.out.print(" Digite a palavra: " );
		palavra = scanner.nextLine();
		
		a(palavra);
	}
	
	
	static void a(String palavra) {
		for (int i=1; i<palavra.length()+1; i++) {
			System.out.println(palavra.substring(0,i).toUpperCase());
		}
		for (int i=palavra.length();i>0; i--) {
			System.out.println(palavra.substring(0,i).toUpperCase());
		
		}

	}
}