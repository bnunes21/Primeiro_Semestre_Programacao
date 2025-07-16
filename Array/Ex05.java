package Array;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		double []notas = new double [10];
		
		for (int i =0; i<notas.length;i++) {
			System.out.print("Informe a nota do "+i+ " Aluno: ");
			notas[i]=scanner.nextDouble();
		}
		int counter=0;
		double media =0;
		double total=0;
		
		for(int i=0; i<notas.length; i++) {
			total +=notas[i];
			media = total/notas.length;
		}
		
		for(int i=0; i<notas.length; i++) {
			if(notas[i]>media) {
				counter++;
			}
		}
		System.out.println("A média foi de " + media+ " O numero de alunos que ficou acima da média foi de " + counter);
	}

}
