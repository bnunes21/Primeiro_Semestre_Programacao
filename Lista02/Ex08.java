package Lista02;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		System.out.print("Informe o seu login de acesso: ");
		int login = scanner.nextInt();
		System.out.print("Informe a sua senha de acesso: ");
		int senha = scanner.nextInt();
		
		if (login==12345&&senha==54321) {
			System.out.println("ACESSO PERMITIDO");
		}
		else {
			System.out.println("ACESSO NEGADO");
		}
		scanner.close();
	}

}
