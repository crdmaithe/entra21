package teste;

import java.util.Arrays;

public class Exercicio {

	public static void main(String[] args) {
		
		int[] numeros = {5, 9 , 7};
		
		Arrays.sort(numeros);
		
		for(int indice=0; indice<3; indice++) {
			System.out.println(numeros[indice]);
		}

	}

}
