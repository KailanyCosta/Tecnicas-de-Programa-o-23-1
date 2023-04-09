package Lista2;

import java.util.Scanner;

public class Questao7 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Insira um numero: ");
		int numero = entrada.nextInt();
		int divisor = 1;
		int resultado = 1;
		int primo=0;
		int numeroInicial= numero;
		
		if(numero<=2)
			System.out.println("2 eh o menor numero primo");
		else {
			while(primo!=numero) {
				numero--;
				if(numero%2 != 0 || numero==2) {
					while((divisor <= (numero/2)) && resultado<4) {
						if(numero % divisor == 0) {
							resultado++;
						}
					divisor++;
					}	
				}
				if(resultado==2)
					primo=numero;
				
				divisor=1;
				resultado=1;
			}
			System.out.println("O maior numero primo menor que " +numeroInicial+ " eh: " +primo);
		}
		
		entrada.close();
		
		}	
}

