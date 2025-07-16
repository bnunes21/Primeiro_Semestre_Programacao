package ProvaRefazendo;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		int []temperatura = new int [10];
		
		for (int i =0; i<temperatura.length; i++) {
			System.out.print("Informe a temperatura das placas " + i + " :");
			temperatura[i]=scanner.nextInt();
		}
		int receberTemperatura = enviarTemperatura (temperatura);
		int receberMenorTemperatura = enviarMenorTemperatura (temperatura);
		System.out.println("A menor temperatura é " +receberMenorTemperatura);
		System.out.println("A menor maior temperatura é " +receberTemperatura);

	}
	
	static int enviarTemperatura(int [] temperatura ) {
		int maiorTemperatura = temperatura[0];
		for (int i =0; i<temperatura.length; i++) {
			if (temperatura[i]>maiorTemperatura) {
				maiorTemperatura=temperatura[i];
			}
		}
			
		return maiorTemperatura; 
	}
	static int enviarMenorTemperatura(int [] temperatura ) {
		int menorTemperatura = temperatura[0];
		for (int i =0; i<temperatura.length; i++) {
			if (temperatura[i]<menorTemperatura) {
				menorTemperatura=temperatura[i];
			}
		}
			
		return menorTemperatura; 
	}
	
}
