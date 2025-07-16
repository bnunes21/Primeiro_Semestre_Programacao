package Lista02;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);	
	
		double total = 0;
		for(int i = 1; i <3; i++) {
			System.out.println("Informe a " +i+ " Nota do aluno: ");
			double nota = scanner.nextDouble();
			total+=nota;
		}
		double calc = total/2;
		if(calc>=7) {
			System.out.println("Aprovado");
			System.out.println("A Média foi de: "+calc);
		}
		else 
			System.out.println("REPROVADO - ARROMBADO");
			System.out.println("Média: "+calc);
		
		
		
		
	
	scanner.close();
	}

}
