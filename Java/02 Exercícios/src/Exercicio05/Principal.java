package Exercicio05;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {

		int dia = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o dia do mês:"));

		if (dia < 1 || dia > 28) {
			JOptionPane.showMessageDialog(null, "Data inválida");
		}

	}

}
