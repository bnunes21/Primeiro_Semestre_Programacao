package ProvaRefazendo;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		String texto = new String ("A nvidia é uma empresa fundada em 20-04-1993. No dia 20-04-2023 a nvidia comemorou 30 anos de existência, desenvolvendo excelentes placas de vídeo.");
	
		String novoTexto = texto.replace('-', '/').replace("nvidia","NVIDIA");
	
	
	System.out.print(novoTexto);
	}
}
