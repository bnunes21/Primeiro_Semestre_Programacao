package Array;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		int [][] a = new int [3] [3];
		
		for(int i =0; i<a.length; i++) {
			for(int j=0; j<a[i].length;j++) {
				System.out.print("Informe o numero da matriz: ");
				a[i][j]=scanner.nextInt();
			}
		}
		System.out.print("Informe mais um numero ");
		int numeroConf=scanner.nextInt();
		
		for(int i =0; i<a.length; i++) {
			for(int j=0; j<a[i].length;j++) {
				int calc = a[i][j]*numeroConf;
				System.out.println(numeroConf + "x" + a[i][j]+ " = " +calc);
			}

		}
	
	}
	
}
