package Strings;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		String frase = new String ();
		
		System.out.print("Digite uma frase ");
		frase = scanner.nextLine();
		
		char []vogal = frase.toUpperCase().toCharArray();
		
		
		
		int counterA=0;
		int counterE=0;
		int counterI=0;
		int counterO=0;
		int counterU=0;
		
		for (int i=0; i<vogal.length; i++) {
			if (vogal[i]=='A') {
				counterA++;
			}else if (vogal[i]=='E') {
				counterE++;
			}else if(vogal[i]=='I') {
				counterI++;
			}else if(vogal[i]=='O') {
				counterO++;
			}else if(vogal[i]=='U') {
				counterU++;
			}
		}
		System.out.print(" A frase digitada foi "+ frase);
		System.out.print(" A quantidade de cada vogal é A = "+ counterA + " E =" + counterE +" I =" + counterI+ " O =" + counterO +" U =" + counterU);
	}

}
