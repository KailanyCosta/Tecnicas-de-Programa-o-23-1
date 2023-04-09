package Lista2;

import java.util.Scanner;

public class Questao4 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Insira um numero:");
		int numero = entrada.nextInt();
		int contador = 0, resultado = 0;
		
		while(contador<=10) {
			resultado = numero*contador;
			System.out.println(numero + " x " + contador + " = " + resultado);
			contador++;
		}
		
		entrada.close();

	}

}
