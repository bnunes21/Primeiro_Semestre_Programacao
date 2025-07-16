package Strings;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		String texto = new String ();
		
		System.out.print ("Informe um texto: ");
		texto = scanner.nextLine();
		
		System.out.print ("Digite uma palavra: ");
		String palavra = scanner.nextLine();
		
		System.out.print ("Digite a palavra da troca: ");
		String troca = scanner.nextLine();
		
		
		String novaTroca = texto.replace(palavra, troca);
		
		String[] palavras = texto.split(" "); 
		int counter = 0;
		for(int i = 0; i < palavras.length; i++) {
			if(palavras[i].equals(palavra)) {
				counter++;
			} 
		}
	
	System.out.println(texto);
	System.out.println(novaTroca);
	System.out.println(counter);

}
}


