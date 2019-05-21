package Exercicio03;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {

		double nota1 = Double.parseDouble(JOptionPane.showInputDialog("Informe a nota 1:"));
		double nota2 = Double.parseDouble(JOptionPane.showInputDialog("Informe a nota 2:"));
		double nota3 = Double.parseDouble(JOptionPane.showInputDialog("Informe a nota 3:"));
		double nota4 = Double.parseDouble(JOptionPane.showInputDialog("Informe a nota 4:"));

		double media = (nota1 + nota2 + nota3 + nota4) / 4;

		JOptionPane.showMessageDialog(null, "Sua média é: " + media);

		if (media >= 7) {
			JOptionPane.showMessageDialog(null, "Você está aprovado.");
		} else if (media >= 5) {
			JOptionPane.showMessageDialog(null, "Você está em exame.");
		} else if (media <= 4.9) {
			JOptionPane.showMessageDialog(null, "Você está reprovado.");
		}

	}

}
