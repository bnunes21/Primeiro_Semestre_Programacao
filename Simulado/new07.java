package Simulado;

import java.util.Scanner;

public class new07 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		String palavra = new String ();
		
		System.out.print("Digite uma palavra: " );
		palavra=scanner.nextLine();
		
		
		
		for (int i=1; i<palavra.length(); i++) {
			System.out.println(palavra.substring(0,i));
		}
		for (int i=1; i<palavra.length(); i++) {
			System.out.println(palavra.substring(0,i));
		}
	}

}
