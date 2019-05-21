package Exercicio08;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {

		double valor1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o primeiro valor:"));
		double valor2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o segundo valor:"));
		String operacao = JOptionPane.showInputDialog(null, "Informe o tipo de operação:");
		double total;

		if (operacao.equals("*")) {
			total = valor1 * valor2;
		} else if (operacao.equals("+")) {
			total = valor1 + valor2;
		} else if (operacao.equals("-")) {
			total = valor1 - valor2;
		} else {
			total = valor1 / valor2;
		}

		JOptionPane.showMessageDialog(null, "O total é: " + total);
	}

}