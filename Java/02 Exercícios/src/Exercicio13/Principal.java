package Exercicio13;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {

		int num = Integer.parseInt(JOptionPane.showInputDialog("Informe um número"));
		int antes = num - 1;
		int depois = num + 1;

		JOptionPane.showMessageDialog(null, "O número antecessor do " + num + " é: " + antes);
		JOptionPane.showMessageDialog(null, "O número sucessor do " + num + " é: " + depois);
	}
}