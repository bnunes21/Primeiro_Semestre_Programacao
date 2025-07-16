package ProvaRefazendo;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		int [][] valores = new int [4][4];
		
		for (int i=0; i<valores.length; i++) {
			for(int j=0; j<valores[i].length; j++) {
			System.out.print("Insira os valores de " +i+ " e " + j + " : ");
			valores[i][j]=scanner.nextInt();
		}
	  }
		int soma=0;
		int somaRegular=0;
		for (int i=0; i<valores.length; i++) {
			for(int j=0; j<valores[i].length; j++) {
				somaRegular +=valores[i][j];
		if(i==j) {
			soma+=valores[i][j];
			}
		}
	}
		int somaTotal=0;
		for (int i=0; i<valores.length; i++) {
			for(int j=0; j<valores[i].length; j++) {
				somaTotal = soma+somaRegular;
			}
			}
		System.out.println(" A soma da diagonal principal é "+ soma);
		System.out.println(" A soma regular é  "+ somaRegular);
		System.out.println(" A soma dos dois valores é  "+ somaTotal);

		
	}

}
