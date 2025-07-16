package Funcaoeprocedimento;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		System.out.print("Informe a idade do nadador: " );
		int idade = scanner.nextInt();
		
		x(idade);
	}
	
	static void x (int idade) {
		if (idade<11) {
			System.out.println("Mirim");
		}
		if (idade>=11&&idade<=14) {
			System.out.println("Infantil");
		}
		if (idade>=15&&idade<=19) {
			System.out.println("Juvenil");
		}
		if (idade>19) {
			System.out.println("Adulto");
		}
	}

}
