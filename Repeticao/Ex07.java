package Repeticao;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		double valor=0;
		int opcao=0;
		double total=0;
		int i=0;
		
		System.out.print("Digite 1 para adcionar uma mercadoria ou 2 para sair: ");
		opcao = scanner.nextInt();
		
		while (opcao==1) {
			System.out.print("Informe o valor da mercadoria: ");
			valor = scanner.nextDouble();
			System.out.print("Digite 1 para adicionar uma mercadoria ou 2 para sair: ");
			opcao = scanner.nextInt();
			total+=valor;
			i++;
		}
		double calc = total /i;
		System.out.println("O valor total do estoque é "+total+ " a média de mercadorias é " +calc);
		
		
		
		
		
	}

}
