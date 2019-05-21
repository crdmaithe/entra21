package Exercicio07;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		int numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o valor:"));
		int tabuada = numero;

		String estrutura = "";

		for (int i = 0; i <= 10; i++) {
			estrutura += i + " X " + numero + " = " + (i * numero) + "\n";
		}

		JOptionPane.showMessageDialog(null, estrutura);
	}

}
