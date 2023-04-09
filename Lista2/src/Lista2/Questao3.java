package Lista2;

import java.util.Scanner;
import java.util.Random;

public class Questao3 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in); 
		Random random = new Random();
		System.out.println("Adivinhe um numero entre 1 e 100: ");
		int numerocorreto = random.nextInt(100);
		int numero = entrada.nextInt();
		
		while(numero != numerocorreto) {
			
			if(numero < numerocorreto)
				System.out.println("O numero a ser adivinhado eh maior.");
			else
				System.out.println("O numero a ser adivinhado eh menor.");
			
			System.out.println("Tente novamente:");
			numero = entrada.nextInt();	
			}
		
		entrada.close();
		System.out.println("Parabens, voce acertou o numero!!");
		
		}
	
	}


