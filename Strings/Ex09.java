package Strings;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		String verbo = new String ();
		
		System.out.print("Digite um verbo");
		verbo = scanner.nextLine();
		
		verbo = verbo.substring(0,(verbo.length()-2));
		System.out.println("Eu " + verbo + "o");
		System.out.println("Tu " + verbo + "as");
		System.out.println("Ele " + verbo + "a");
		System.out.println("Nós " + verbo + "amos");
		System.out.println("Vós " + verbo + "ais");
		System.out.println("Eles " + verbo + "am");
	}

}
