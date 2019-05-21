package Exercicio06;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		// vetor de nomes
		String[] nomes = new String[2];

		// variável para armazenar o nome
		String nome;

		// perguntar dois nomes
		int indice = 0;
		while (indice < 2) {
			nome = JOptionPane.showInputDialog("Informe o " + (indice + 1) + " nome");

			// validar o nome
			boolean validaNome = false;

			// validar o nome
			for (int i = 0; i < 2; i++) {
				if (nomes[i].equals(nome)) {
					validaNome = true;
				}
			}
			if (validaNome == true) {
				JOptionPane.showMessageDialog(null, "Nome já informado");
			} else {
				nomes[indice] = nome;
				indice++;
			}
		}
	}
}
