package String2;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		String texto = new String ();
		
		System.out.print("Digite um texto qualquer :");
		texto = scanner.nextLine();
		
		String []palavras = texto.split(" ");
		
		int counter =0;
		for (int i = 0; i<palavras.length; i++) {
		counter++;
		}
		System.out.print(counter);
	}

}
