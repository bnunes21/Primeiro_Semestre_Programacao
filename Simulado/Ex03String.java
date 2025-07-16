package Simulado;

import java.util.Scanner;

public class Ex03String {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		String palavras = new String ();
		
		
		System.out.print("Digite o seu texto: ");
		palavras=scanner.nextLine();
		
		int paranaue = chica(palavras);
		System.out.print(paranaue);
	}
		
		static int chica (String palavras) {
	
		char []carac = palavras.toCharArray();
		
		int counter=0;
		for (int i=0; i<carac.length; i++) {
			counter++;
			}
		
		return counter; 
		
	}

}
