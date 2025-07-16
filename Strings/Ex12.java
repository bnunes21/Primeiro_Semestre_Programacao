package Strings;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		String nome = new String ();
		
		System.out.print ("Informe o nome por inteiro: ");
		nome = scanner.nextLine();
		
		String []troca = nome.split(" ");
		
		String sobrenome = troca[troca.length - 1];
		String nomes = "";
		
		for(int i = 0; i < troca.length-1; i++) {
			nomes = nomes + " " + troca[i];
		}
		System.out.println(sobrenome.toUpperCase() + "," + nomes + ".");
		scanner.close();
		
	}

}
