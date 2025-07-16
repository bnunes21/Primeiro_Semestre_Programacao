package Lista02;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		
		String opcao = "";
		
		System.out.print("Informe o tipo de combustivel digite A para Alcool - digite G para Gasolina: ");
		opcao = scanner.nextLine();
		System.out.print("Informe a quantidade de litros abastecidos: ");
		int litros = scanner.nextInt();
		double calcA = litros*6.20;
		double calcG = litros*6.90;
				
		if (opcao.equals("A") && litros<=20) {
			double x = calcA*0.03;
			double y = calcA-x;
			System.out.print("O valor de desconto no abastecimento foi de: "+x+ " O valor total do abastecimento foi de "+y);
		}
		if (opcao.equals("A") && litros>20) {
			double x = calcA*0.05;
			double y = calcA-x;
			System.out.print("O valor de desconto no abastecimento foi de: "+x+ " O valor total do abastecimento foi de "+y);
		}	
		if (opcao.equals("G") && litros<=20) {
			double x = calcG*0.04;
			double y = calcG-x;
			System.out.print("O valor de desconto no abastecimento foi de: "+x+ " O valor total do abastecimento foi de "+y);
		}	
			if (opcao.equals("G") && litros>20) {
			double x = calcG*0.06;
			double y = calcG-x;
			System.out.print("O valor de desconto no abastecimento foi de: "+x+ " O valor total do abastecimento foi de "+y);
		}
				
		scanner.close();
	}

}
