package Funcaoeprocedimento;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		int []A = new int [10];
		
		for(int i =0; i<A.length; i++) {
		System.out.print("Informe a pontuação do aluno");
		A[i] = scanner.nextInt();
		}
		
		int pont = media (A);
		System.out.print(pont);
	}
	
	
	static int media (int []A) {
		int soma =0;
		for (int i=0; i<A.length; i++) {
			soma +=A[i];
		}
		
		
		int calc = soma/A.length;
		return calc;
		}
	}



