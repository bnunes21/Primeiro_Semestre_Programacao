package Repeticao;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		System.out.print("Informe a quantidade de numeros a serem lidos: ");
		int leitura = scanner.nextInt();
		int numeros = 0;
		int total =0;
		int menorNumero=9999;
		int maiorNumero=0;
		
		for (int i = 0; i<leitura;i++) {
			System.out.print("Informe o numero" +i);
			numeros=scanner.nextInt();
			
			if(numeros>maiorNumero) {
				maiorNumero=numeros;
			}
			if (numeros < menorNumero) {
	            menorNumero = numeros;
	            }

	            total += numeros;
	        }

		 System.out.println("A média dos números é: " + (total / leitura));
	        System.out.println("O menor número é: " + menorNumero);
	        System.out.println("O maior número é: " + maiorNumero);
		
		scanner.close();
	}

}
