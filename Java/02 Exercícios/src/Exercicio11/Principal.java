package Exercicio11;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		double nota1 = Double.parseDouble(JOptionPane.showInputDialog("Informe a nota 1: "));
		double nota2 = Double.parseDouble(JOptionPane.showInputDialog("Informe a nota 2: "));
		double nota3 = Double.parseDouble(JOptionPane.showInputDialog("Informe a nota 3: "));
		double nota4 = Double.parseDouble(JOptionPane.showInputDialog("Informe a nota 4: "));
		double faltas = Double.parseDouble(JOptionPane.showInputDialog("Informe o n�mero de faltas: "));
		double media = (nota1 + nota2 + nota3 + nota4) / 4;

		if (faltas > 15) {
			JOptionPane.showMessageDialog(null, "Voc� ultrapassou o limite de faltas, est� reprovado.");
		} 
		else if (media == 10) {
			JOptionPane.showMessageDialog(null, "Parab�ns, sua m�dia �: " + media);
		}
		else if (media >= 9.0) {
			JOptionPane.showMessageDialog(null, "�timo, sua m�dia �: " + media);
		}
		else if (media >= 7.0) {
			JOptionPane.showMessageDialog(null, "Bom, sua m�dia �: " + media);
		} 
		else if (media >= 5.1) {
			JOptionPane.showMessageDialog(null, "Voc� est� em exame. Sua m�dia �:" + media);
		} 
		else if (media <= 5.0) {
			JOptionPane.showMessageDialog(null, "Voc� est� reprovado. Sua m�dia �: " + media);
		}
	}
}
