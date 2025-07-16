package Lista02;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		System.out.print("Informe o numero de macas compradas: ");
		int maca = scanner.nextInt();
		
		if (maca<12) {
			double calc = (maca*1.30);
			System.out.println("O valor total da compra foi de " + calc);
		} 
		if (maca>12) {
			double calc = (maca*1.00);
			System.out.println("O valor total da compra foi de " + calc);
		}
		scanner.close();		
	}

}
