package Array;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		String []nome = new String[10];
		
		for(int i =0; i<nome.length;i++) {
		System.out.print("Informe o " +i+ "Nome: ");
		nome[i] = scanner.nextLine();
		}
		
		for(int i =0;i<nome.length;i++) {
			System.out.println(i + " "+nome[i]);
		}
		System.out.println(" ------------------------------------------------------------");

		for(int i =nome.length-1;i>=0;i--) {
			System.out.println(i + " "+nome[i]);
	
		}
	scanner.close();
	 }
	}