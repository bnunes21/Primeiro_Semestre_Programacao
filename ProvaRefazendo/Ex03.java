package ProvaRefazendo;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		int []lotes = new int [10];
		
		for (int i =0; i<lotes.length; i++) {
			System.out.print("Informe a classificação dos processadores" + i+ " : ");
			lotes[i]=scanner.nextInt();
			
			
		}
		passarNumeros(lotes);
	}
	
	static void passarNumeros (int []lotes) {
		for (int i =0; i<lotes.length; i++) {
		if (lotes[i]<25) {
			System.out.println(" O lote "+i+ " de classificação " +lotes[i]+ " foi Reprovado ");
		}else if (lotes[i]>24 && lotes[i]<76) {
			System.out.println(" O lote "+i+ " de classificação " +lotes[i]+ " foi Aprovado em Segunda linha ");
		}else if (lotes[i]>75) {
			System.out.println(" O lote "+i+ " de classificação " +lotes[i]+ " foi Aprovado em Primira linha ");
		}
		}
	}

}
