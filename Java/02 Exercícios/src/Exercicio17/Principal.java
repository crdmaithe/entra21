package Exercicio17;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {

		int valor1 = Integer.parseInt(JOptionPane.showInputDialog("Informe o primeiro valor: "));
		int valor2 = Integer.parseInt(JOptionPane.showInputDialog("Informe o segundo valor: "));
		int resto = valor1 % valor2;

		JOptionPane.showMessageDialog(null, "O valor do quociente é: " + resto);
	}

}
