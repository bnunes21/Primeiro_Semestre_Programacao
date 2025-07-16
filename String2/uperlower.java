package String2;

import java.util.Scanner;

public class uperlower {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		String frase = new String();
		String palavra = new String(); 
		
		
		System.out.print("Digite uma frase: " );
		frase = scanner.nextLine();
		
		String []caractere=frase.split(" ");
		char []carac=frase.toUpperCase().toCharArray();
		
		System.out.print("Digite a palavra" );
		palavra=scanner.nextLine();
		
		String novaTroca= frase
		.replace("a", "4").replace("A", "4")
		.replace("e", "3").replace("E", "3")
		.replace("i", "1").replace("I", "1")
		.replace("o", "0").replace("O", "0")
		.replace("u", "2").replace("U", "2");
		
		
		int counter =0;
		int count=0;
		
		for (int i =0; i<carac.length; i++) {
			count++;
		}
		
		
		for (int i =0; i<caractere.length; i++) {
			if (caractere[i].equals(palavra)) {
			counter++;
		}
		}
		for (int i =0; i<caractere.length; i++) {
			System.out.println(caractere[i]);
		}
		
		System.out.println("Em caixa alta = " + frase.toUpperCase());
		System.out.println("Em caixa baixa = " + frase.toLowerCase());
		System.out.println("Quantas palavras iguais = " + counter);
		System.out.println("Quantos caracteres = " + count);
		System.out.println(novaTroca);
		
		
	}

}
