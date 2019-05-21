package Exercicio02;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {

		double valor = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor do produto"));
		double desconto = (valor * 10) / 100;

		JOptionPane.showMessageDialog(null, "O valor do produto com desconto é de: " + (valor - desconto));
	}

}
