package Exercicio11;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		double nota1 = Double.parseDouble(JOptionPane.showInputDialog("Informe a nota 1: "));
		double nota2 = Double.parseDouble(JOptionPane.showInputDialog("Informe a nota 2: "));
		double nota3 = Double.parseDouble(JOptionPane.showInputDialog("Informe a nota 3: "));
		double nota4 = Double.parseDouble(JOptionPane.showInputDialog("Informe a nota 4: "));
		double faltas = Double.parseDouble(JOptionPane.showInputDialog("Informe o número de faltas: "));
		double media = (nota1 + nota2 + nota3 + nota4) / 4;

		if (faltas > 15) {
			JOptionPane.showMessageDialog(null, "Você ultrapassou o limite de faltas, está reprovado.");
		} 
		else if (media == 10) {
			JOptionPane.showMessageDialog(null, "Parabéns, sua média é: " + media);
		}
		else if (media >= 9.0) {
			JOptionPane.showMessageDialog(null, "Ótimo, sua média é: " + media);
		}
		else if (media >= 7.0) {
			JOptionPane.showMessageDialog(null, "Bom, sua média é: " + media);
		} 
		else if (media >= 5.1) {
			JOptionPane.showMessageDialog(null, "Você está em exame. Sua média é:" + media);
		} 
		else if (media <= 5.0) {
			JOptionPane.showMessageDialog(null, "Você está reprovado. Sua média é: " + media);
		}
	}
}
