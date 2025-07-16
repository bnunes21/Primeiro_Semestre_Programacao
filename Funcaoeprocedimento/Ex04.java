package Funcaoeprocedimento;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		int [][] A = new int [4][4];
		
		for(int i=0; i<A.length;i++) {
			for (int j=0; j<A[i].length; j++) {
		System.out.print("Informe os numeros da matriz" +i +j);
			A[i][j]=scanner.nextInt();
			
			}
		}
		
		int pares = contarPares(A);
		System.out.print(pares);
		
	}
	static int contarPares(int [][] A) {
		int counter=0;
		for (int i=0; i<A.length; i++) {
			for (int j=0; j<A[i].length; j++) {
				if (A[i][j]%2==0) {
					counter++;
				}
			}
		}
		
		
		return counter;
	}
}
