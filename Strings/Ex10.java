package Strings;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		String numero = new String ();
		
		System.out.print("Digite os numeros : " );
		numero=scanner.nextLine();
		
		String nova = numero.replace("1", "Um, ")
				.replace("2", " Dois, ")
				.replace("3", " Três, ")
				.replace("4", " Quatro, ")
				.replace("5", " Cinco, ")
				.replace("6", " Seis, ")
				.replace("7", " Sete, ")
				.replace("8", " Oito, ")
				.replace("9", " Nove, ");
		
		System.out.print(nova);
					
	}

}
