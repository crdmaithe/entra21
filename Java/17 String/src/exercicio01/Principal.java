package exercicio01;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {

		String palavra = JOptionPane.showInputDialog("Informe uma palavra: "), modificada = "", letra;
		int tamanho = palavra.length();

		for (int i = 0; i < tamanho; i++) {
			letra = String.valueOf(palavra.charAt(i));
			if (i % 2 == 0)
				letra = letra.toUpperCase();
			else
				letra = letra.toLowerCase();
			modificada += letra;
		}
		JOptionPane.showMessageDialog(null, modificada);
	}
}