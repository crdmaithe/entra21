package Exemplo02;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {

		// Vetor de nomes
		String[] nomes = new String[3];

		// Vari�vel �ndice
		int indice = 0;

		// La�o while - Perguntar nomes

		while (indice < 3) {
			nomes[indice] = JOptionPane.showInputDialog((indice + 1) + "� nome");
			indice++;
		}

		// La�o while - Exibir nomes
		indice = 0;
		while (indice < 3) {
			System.out.println((indice + 1) + "� nome �: " + nomes[indice]);
			indice++;
		}
	}

}
