package Strings;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner (System.in);
		String palavra =new String();
		System.out.print("Digite uma palavra: ");
		palavra =scanner.nextLine();
		
		char[] letras = palavra.toCharArray();
		
		
		for(int i=palavra.length()-1;i>=0; i--) {
			System.out.print(letras[i]);
			
		}
		
	}

}
