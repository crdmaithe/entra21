package Exercicio06;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {

		int num01 = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o primeiro valor"));
		int num02 = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o segundo valor"));

		int total;

		if (num01 == num02) {
			total = num01 + num02;
		} else {
			total = num01 * num02;
		}

		JOptionPane.showMessageDialog(null, "O valor final é de : " + total);
	}

}
