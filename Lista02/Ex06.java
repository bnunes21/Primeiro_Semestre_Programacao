package Lista02;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		System.out.print("Informe o nome do time1: ");
		String time1 = scanner.nextLine();
		System.out.print("Informe o nome do time2: ");
		String time2 = scanner.nextLine();
		
		System.out.print("Informe o numero de gols marcados pelo time: " +time1);
		int timeA =scanner.nextInt();
		System.out.print("Informe o numero de gols marcados pelo time: " +time2);
		int timeB =scanner.nextInt();
		
		if (timeA>timeB) {
			System.out.println("O time: "+time1+ "Foi o vencedor da partida");
			
		}
		if (timeA<timeB) {
			System.out.println("O time: "+time2+ "Foi o vencedor da partida");	
		}
		if (timeA==timeB) {
			System.out.println("EMPATE");
		}
	}

}
