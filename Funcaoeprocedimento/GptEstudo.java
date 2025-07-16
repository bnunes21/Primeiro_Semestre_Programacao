package Funcaoeprocedimento;

import java.util.Scanner;

public class GptEstudo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		int []a = new int [10];
		
		for (int i=0; i<a.length; i++) {
			System.out.print("Informe o " +i+ " Numero: ");
			a[i]=scanner.nextInt();
		}
		int pares=par(a);
		
		System.out.print(pares);
		
		
	}
	static int par (int [] a) {
		
		int counter=0; 
		for(int i=0; i<a.length; i++) {
			if (a[i]%2==0) {
				counter++;
			}
		}
		return counter;
		
	}

}
