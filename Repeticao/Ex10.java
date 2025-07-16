package Repeticao;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		int opcao=0;
		double salario=0;
		int filhos = 0;
		int contador =0;
		double totalSalario=0;
		int totalFilhos=0;
		double maiorSalario=0;
		double salarioMenor=0;
		
		System.out.print("Digite 1 para informar e 2 para sair: " );
		opcao = scanner.nextInt();
		
		while (opcao==1) {
			System.out.print("Informe o valor salario: ");
			salario=scanner.nextDouble();
			totalSalario+=salario;
			
			System.out.print("Informe o numero de filhos: ");
			filhos = scanner.nextInt();
			totalFilhos+=filhos;
			
			System.out.print("Deseja informar mais ? digite 1 para sim e 2 para não: " );
			opcao = scanner.nextInt();
			contador ++;
			if (salario>maiorSalario) {
				maiorSalario = salario;
			if(salario<1000.00) {
				salarioMenor++;
			}
		}
	
			
		}double mediaFilho = totalFilhos/contador;
		double mediaSalario = totalSalario/contador;
		double calc = (salarioMenor/contador)*100;
		
		System.out.print(" A média de filhos é de: " +mediaFilho + " A média de salario é " +mediaSalario+ " O maior salario é "+maiorSalario+ "A porcentagem do Menor salario é %: " + calc);
		
		scanner.close();
	}

}
