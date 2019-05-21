package Exercicio10;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {

		double valor1 = 0.01;
		double valor2 = 0.05;
		double valor3 = 0.10;
		double valor4 = 0.25;
		double valor5 = 0.50;
		double valor6 = 1.0;

		double qntd1 = 0;
		double qntd2 = 0;
		double qntd3 = 0;
		double qntd4 = 0;
		double qntd5 = 0;
		double qntd6 = 0;

		double total;

		qntd1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe a quantidade de moedas de 0.01:"));
		qntd2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe a quantidade de moedas de 0.05:"));
		qntd3 = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe a quantidade de moedas de 0.10:"));
		qntd4 = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe a quantidade de moedas de 0.25:"));
		qntd5 = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe a quantidade de moedas de 0.50:"));
		qntd6 = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe a quantidade de moedas de 1.0:"));

		total = (qntd1 * valor1) + (qntd2 * valor2) + (qntd3 * valor3) + (qntd4 * valor4) + (qntd5 * valor5)
				+ (qntd6 * valor6);

		JOptionPane.showMessageDialog(null, "O valor total é de: " + total);

	}
}
