package Exemplo03;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		// Vetor de n�meros
		int[] numeros = new int[10];

		// La�o FOR
		Scanner obterNumero = new Scanner(System.in);

		for (int indice = 0; indice < numeros.length; indice++) {
			System.out.println("Informe o " + (indice + 1) + "� numero");
			numeros[indice] = obterNumero.nextInt();

		}

		// Finalizar Scanner
		obterNumero.close();

		// Listar os valores FOREACH
		for (int n : numeros) {
			System.out.println(n);
		}
	}
}
