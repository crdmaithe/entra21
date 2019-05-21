package Exercicio09;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {

		int num01 = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o primeiro valor"));
		int num02 = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o segundo valor"));
		int num03 = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o terceiro valor"));
		int menorNum = 0;

		if (num01 <= menorNum) {
			menorNum = num01;
		} else if (num02 <= menorNum) {
			menorNum = num02;
		} else {
			menorNum = num03;
		}

		JOptionPane.showMessageDialog(null, "O menor número é: " + menorNum);

	}

}
