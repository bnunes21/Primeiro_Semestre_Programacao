package String2;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		String frase = new String();
		System.out.print("Digite uma frase: " );
		frase = scanner.nextLine();
		int vogalquantA =0;
		int vogalquantE =0;
		int vogalquantI =0;
		int vogalquantO =0;
		int vogalquantU =0;
		
		char []vogais = frase.toUpperCase().toCharArray();
		
		for(int i =0; i<vogais.length; i++) {
			switch(vogais[i]) {
			case 'A':{
				vogalquantA++;
				break;
			}
			case 'E':{
				vogalquantE++;
				break;
			}
			case 'I':{
				vogalquantI++;
				break;
			}
			case 'O':{
				vogalquantO++;
				break;
			}
			case 'U':{
				vogalquantU++;
				break;
				
				}
			}
		}
		System.out.println("Frase " +frase);
		System.out.println("VOGAL A = " +vogalquantA);
		System.out.println("VOGAL E = " +vogalquantE);
		System.out.println("VOGAL I = " +vogalquantI);
		System.out.println("VOGAL O = " +vogalquantO);
		System.out.println("VOGAL U = " +vogalquantU);
	}

}
