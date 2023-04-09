package Lista2;

import java.util.Scanner;

public class Questao2 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int soma=0, numeros=1;
		System.out.println("Digite uma sequencia de numeros:");
		
		while (numeros>0) {
			numeros = entrada.nextInt();
			if(numeros>0)
				soma = soma + numeros;}
		
		entrada.close();
		
		System.out.println("Nao eh permitido numeros negativos.");
		System.out.println("A soma dos numeros positivos digitados eh: " + soma);

	}

}
