package Array;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		int []a=new int [10];
		
		for (int i = 0; i<a.length; i++) {
			System.out.print("Digite o " +i+ " numero: ");
			a[i]=scanner.nextInt();
		}
		int subst=0;
		for (int i =0; i<a.length; i++) {
			for (int j=0; j<a.length-1; j++) {
			if(a[j]>a[j+1]) { 		// j+1 [é como o array verifica o visinho, no caso ele verifica o prox numero]
				subst=a[j];			// [ depois que ele confere, ele pega o numero maior é coloca no subst temporariamente 
				a[j]=a[j+1];		// [Agora o valor que estava à direita (a[j + 1]) vai para a esquerda (a[j]) - Se antes tínhamos [5, 3], agora ficou [3, 3], temporariamente.
				a[j+1]=subst;		// [Por fim, usamos o valor salvo em subst para colocar na posição da direita (a[j + 1])
				
			}
		}
	}
		for (int i=0; i<a.length; i++) {
			System.out.print(a[i]+" ");
		}
		
		// em ordem decrescente
	//	int abra=0;
		//	for (int i =0; i<a.length; i++) {
		//		for (int j=0; j<a.length-1-i; j++) {
		//		if(a[j]<a[j+1]) {
		//		abra=a[j];
		//		a[j]=a[j+1];
		//		a[j+1]=abra;
				
			
		
		scanner.close();
	}

}
