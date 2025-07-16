package Array;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		int []numeros = new int [10];
		
		for(int i = 0; i<numeros.length;i++) {
			System.out.print("Digite o " +i+ " numero: ");
			numeros[i]= scanner.nextInt();
		}
		System.out.print("Informe um numero para realizar a busca" );
		int numero3 = scanner.nextInt();
		String Mensagem = "NÃO ACHEI";
		
		for (int i =0; i<numeros.length;i++) {
			if (numero3==numeros[i]) {
				Mensagem = "Achei" ;
			}
			}
		System.out.println(Mensagem);
		scanner.close();
		}
		}
		
	


