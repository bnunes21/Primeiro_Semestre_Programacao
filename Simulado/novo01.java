package Simulado;

import java.util.Scanner;

public class novo01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		String palavra = new String ();
		
		System.out.print("Digite uma palavra: ");
		palavra = scanner.nextLine();
		
		char []aluisio = palavra.toCharArray();
		
		for(int i = palavra.length()-1;i>0;i--) {
			System.out.print(aluisio[i]);
			
		}
	}

}
