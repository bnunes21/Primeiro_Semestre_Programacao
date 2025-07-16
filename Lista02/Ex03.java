package Lista02;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		System.out.print("Informe o salario do funcionario: ");
		double salario = scanner.nextDouble();
		System.out.print("Informe o numero de horas trabalhadas: " );
		double hora = scanner.nextDouble();
		System.out.print("Informe o numero de horas extras: ");
		double horaExtra = scanner.nextDouble();
		
		double calc = salario/hora;
		double calcExtra = calc*0.50;
				
		
		
		if(horaExtra>0) {
		double calcHora = calcExtra *horaExtra; 	
		double calc2 = calcHora+salario;
		System.out.println("O Valor do salario foi de "+salario+ " O valor por hora foi de "+calc+ " O valor de Hora extra foi de "+calcHora+ "O valor total é de " +calc2);
		}
		else {
			System.out.println("O Valor do salario foi de "+salario+ " O valor por hora foi de "+calc);
		}
				scanner.close();
	}

}
