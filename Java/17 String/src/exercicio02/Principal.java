package exercicio02;

import javax.swing.JOptionPane;

public class Principal {
	public static void main(String[] args) {

		int vogais = 0;
		String letra;

		String palavra = JOptionPane.showInputDialog("Informe a palavra: ");
		int tamanho = palavra.length();

		for (int i = 0; i < tamanho; i++) {
			letra = String.valueOf(palavra.charAt(i));
			if (letra.equals("a") || letra.equals("e") || letra.equals("i") || letra.equals("o") || letra.equals("u")) {
				vogais++;
			}

		}
		JOptionPane.showMessageDialog(null, "Quantidade de vogais: " + vogais);
	}

}