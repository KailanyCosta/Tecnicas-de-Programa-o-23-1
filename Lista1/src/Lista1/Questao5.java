package Lista1;

import java.util.Scanner;

public class Questao5 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int a,b;
		
		System.out.println("Qual o valor de a: ");
		a = input.nextInt();
		System.out.println("Qual o valor de b: ");
		b = input.nextInt();
		
		input.close();
			
		if(a>10 || a+b==20)
			System.out.println("numero valido");
		else
			System.out.println("numero nao valido");


	}

}
