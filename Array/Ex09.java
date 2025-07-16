package Array;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		int [][]a = new int [4][4];
		
	
		
		for (int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length; j++) {
				System.out.print("Preencha a matriz: ");
				a[i][j]=scanner.nextInt();
			}
		}
		int posicaoI=0;
		int posicaoJ=0;
		
		int menorElemento=a[0][0];
		int maiorElemento=a[0][0];
		
		for (int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length; j++) {
				if(a[i][j]<menorElemento) {
					menorElemento=a[i][j];
					posicaoI=i;
					posicaoJ=j;
				}
			}
				}
		System.out.println(" O menor elemento é " + menorElemento+ " linha " + posicaoI+ " coluna " +posicaoJ);

	}

}
