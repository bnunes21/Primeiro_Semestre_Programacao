package Array;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		double []temperatura = new double [12];
		
	
		
		double total =0;
		int counter=0;
		
		for (int i =0; i<temperatura.length; i++) {
			System.out.print("Informe a temperatura do mes " +i+ " ");
			temperatura[i]=scanner.nextDouble();
			total+=temperatura[i];
			
		}
		double media = total/temperatura.length;
		double menorTemperatura=temperatura[0];
		double maiorTemperatura=temperatura[0];
	
		for (int i=0; i<temperatura.length; i++) {
			if (temperatura[i]<media&&temperatura[i]<menorTemperatura) {
				menorTemperatura=temperatura[i];
			}
		}
		for (int i=0; i<temperatura.length; i++) {
			if (temperatura[i]>media&&temperatura[i]>maiorTemperatura) {
				maiorTemperatura=temperatura[i];
			}
		}
		
		for (int i=0; i<temperatura.length; i++) {
			if (temperatura[i]<media) {
				counter++;
			}
		}
		
			System.out.println(" A menor temperatura do ano foi: " + menorTemperatura);
			System.out.println(" A maior temperatura do ano foi: " + maiorTemperatura);
			System.out.println(" A média foi" + media);
			System.out.println(" A quantidade de meses em que foi menor " +counter);

			
		}
	}


