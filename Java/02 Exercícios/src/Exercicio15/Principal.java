package Exercicio15;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {

		int aptoS = 45;
		int aptoD = 65;
		int suiteL = 110;

		String quarto = "Escolha seu quarto: ";
		quarto += "\n1- Apto simples";
		quarto += "\n2- Apto duplo";
		quarto += "\n3- Su�te luxo";

		int respostaQt = Integer.parseInt(JOptionPane.showInputDialog(null, quarto));
		int respostaD = Integer
				.parseInt(JOptionPane.showInputDialog(null, "Informe quantos dias voc� ficar� hospedado"));

		switch (respostaQt) {

		case 1:
			JOptionPane.showMessageDialog(null, "Sua hospedagem custar�: " + (aptoS * respostaD));
			break;
		case 2:
			JOptionPane.showMessageDialog(null, "Sua hospedagem custar�: " + (aptoD * respostaD));
			break;
		case 3:
			JOptionPane.showMessageDialog(null, "Sua hospedagem custar�: " + (suiteL * respostaD));

		}
	}
}