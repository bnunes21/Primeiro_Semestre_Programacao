package Strings;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		String frase = new String ();
		
		System.out.print("Digite uma frase " );
		frase = scanner.nextLine();
		
		System.out.print ("Digite uma palavra");
		String palavra = scanner.nextLine();
		
		String []verificar = frase.split(" ");
		
		int counter =0;
		for (int i=0; i<verificar.length; i++) {
		if (verificar[i].equalsIgnoreCase(palavra)) {
			counter ++;
		}
	}
		System.out.println("A frase digitada é: "+ frase);
		System.out.println("A palavra digitada foi: " +palavra);
		System.out.println("O numero de vezes que a palavra " + palavra+ " Aparece na frase é de "+counter);
	}

}
