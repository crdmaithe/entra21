package Exercicio19;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {

		int dist = Integer.parseInt(JOptionPane.showInputDialog("Informe a dist�ncia percorrida: "));
		double tempo = Double
				.parseDouble(JOptionPane.showInputDialog("Informe o tempo que levou para percorrer essa dist�ncia: "));
		double vm = dist / tempo;

		JOptionPane.showMessageDialog(null, "A velocidade m�dia percorrida foi: " + vm);
	}

}
