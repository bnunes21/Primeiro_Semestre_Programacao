package Simulado;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int [][]aurelio = new int [4][4];
		
		for (int i =0; i<aurelio.length; i++) {
			for (int j=0; j<aurelio[i].length; j++) {
				System.out.print(" Digite os numeros meu consagrado " );
				aurelio[i][j]=scanner.nextInt();
			}
		}
		
		int  menorAu=aurelio[0][0];
		int  maiorAu=aurelio[0][0];
		int posiauI=0;
		int posiauJ=0;
		
		for (int i =0; i<aurelio.length; i++) {
			for (int j=0; j<aurelio[i].length; j++) {
				if(aurelio[i][j]>maiorAu) {
					maiorAu=aurelio[i][j];
					posiauI=i;
					posiauJ=j;
				}
			}
		}
		System.out.print(posiauI+" " +" "+posiauJ+ " " +maiorAu);
	}

}
