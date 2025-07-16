package String2;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		String palavra = new String ();
		
		System.out.print("Digite uma palavra " );
		palavra= scanner.nextLine();
		
		String gervazio = palavra
				.replace("a", "4").replace("A", "4")
				.replace("e", "3").replace("E", "3")
				.replace("i", "1").replace("I", "1")
				.replace("o", "0").replace("O", "0")
				.replace("u", "2").replace("U", "2");
		
		for (int i=1; i<palavra.length()+1; i++) {
			System.out.println(palavra.substring(0,i).toUpperCase());
			
		}
		for (int i=palavra.length();i>0; i--) {
			System.out.println(palavra.substring(0,i-1).toUpperCase());
			
		}
		System.out.println(gervazio);
	}

}
