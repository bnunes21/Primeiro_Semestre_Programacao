package ProvaRefazendo;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		double []notas = new double [10];
		
		for (int i =0; i<notas.length; i++) {
			System.out.print("Informe as notas dos processadores " +i+ " :" );
			notas[i]=scanner.nextDouble();
		}
		double soma=0;
		double media =0;
		int counter=0;
		for (int i =0; i<notas.length; i++) {
			soma +=notas[i];
			media = soma/notas.length; 
			if (notas[i]>media ) {
				counter++;
			}
		}
		System.out.print("O numero de notas acima da média foram: " +counter );
	}

}
