package Lista1;

import java.util.Scanner;

public class Questao6 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		int a,b;  
		
		System.out.println("Insira o valor de a: ");
		a = teclado.nextInt();
		
		if(a>10)
			System.out.println("a > 10");
		else
			System.out.println("a <= 10");
		
		System.out.println("Insira o valor de b: ");
		b = teclado.nextInt();
		
		teclado.close();
		
		if(a+b==20)
			System.out.println("a + b == 20");
		else
			System.out.println("a + b != 20");

	}

}
