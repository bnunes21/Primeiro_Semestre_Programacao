package Strings;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		String dataNascimento = new String ();
		
		System.out.print("Informe a sua data de nascimento no formato  31/08/1985: ");
		dataNascimento=scanner.nextLine();
		String select = dataNascimento.substring(3, 5);
		String selectDia = dataNascimento.substring(0, 2);
		String selectAno = dataNascimento.substring(6, 10);
		
		
		String troca = select.replace("01", "Janeiro")
				.replace("02", "Feveriro")
				.replace("03", "Março")
				.replace("04", "Abril")
				.replace("05", "Maio")
				.replace("06", "Junho")
				.replace("07", "Julho")
				.replace("08", "Agosto")
				.replace("09", "Setembro")
				.replace("10", "Outubro")
				.replace("11", "Novembro")
				.replace("12", "Dezembro");
		
		System.out.print("Você nasceu em "+selectDia + " de "+ troca + " de "+selectAno);
				
	}

}
