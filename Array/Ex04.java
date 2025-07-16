package Array;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		int [] numeros = new int [10];
		
		for (int i =0; i<numeros.length;i++) {
			System.out.print("Informe o "+i+ " numero: ");
			numeros[i]=scanner.nextInt();
			while(numeros[i]<0) {
				System.out.print("Numero inválido");
				System.out.print("Informe o "+i+ " numero: ");
				numeros[i]=scanner.nextInt();
			}
		}
		int maiorNumero=numeros[0];
		int menorNumero=numeros[0];
		int indiceMaior=0;
		int indiceMenor=0;
		
		for (int i =0; i<numeros.length;i++) {
			if(numeros[i]>maiorNumero) {
				maiorNumero=numeros[i];
				indiceMaior=i;
			}
			if(numeros[i]<menorNumero) {
				menorNumero=numeros[i];
				indiceMenor=i;
			}
		}
		System.out.println(maiorNumero+ " " +indiceMaior );
		System.out.println(menorNumero+ " " +indiceMenor );
	
				
			
		
		
		}
	}


