package String2;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		String palavra = new String();
		
		System.out.print("Digite uma palavra: ");
		palavra=scanner.nextLine();
		
		char[]A=palavra.toUpperCase().toCharArray();
		int countA = 0;
		int countE = 0;
		int countI = 0;
		int countO = 0;
		int countU = 0;
		
		int counter=0;
		for (int i =0; i<A.length; i++) {
			counter++;
		}
		
		for (int i =0; i<A.length; i++) {
			switch(A[i]) {
			case 'A':{
				countA++;
				break;
			}
			case 'E':{
				countE++;
				break;
			}
			case 'I':{
				countI++;
				break;
			}
			case 'O':{
				countO++;
				break;
			}
			case 'U':{
				countU++;
				break;
			}
		}
	}
		
		System.out.println(counter);
		System.out.println(A);
		System.out.println(countA++);
		System.out.println(countE++);
		System.out.println(countI++);
		System.out.println(countO++);
		System.out.println(countU++);

	}

}
