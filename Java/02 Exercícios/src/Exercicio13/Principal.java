package Exercicio13;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {

		int num = Integer.parseInt(JOptionPane.showInputDialog("Informe um n�mero"));
		int antes = num - 1;
		int depois = num + 1;

		JOptionPane.showMessageDialog(null, "O n�mero antecessor do " + num + " �: " + antes);
		JOptionPane.showMessageDialog(null, "O n�mero sucessor do " + num + " �: " + depois);
	}
}