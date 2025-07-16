package Array;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int []numeros = new int [10];
		int numero1=0;
		for (int i =0; i<numeros.length; i++) {
			System.out.print("Informe o "+i+ " numero: ");
			numeros[i]=scanner.nextInt();
		}
		System.out.print("Informe mais um numero: ");
		numero1 = scanner.nextInt();
		
		int counter=0;
		
		for (int i = 0; i<numeros.length; i++) {
			if (numeros[i]==numero1) {
				counter++;	
			}
		}
System.out.print("O numero " +numero1+ " Aparece " + counter+ "Vez");
		
		
		scanner.close();
	}

}
