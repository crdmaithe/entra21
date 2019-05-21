package Exercício01;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {

		/*
		 * String nome = "Amanda"; int idade = 25; String cidade = "Curitiba";
		 * 
		 * System.out.println("Olá "+ nome + ", você tem "+ idade+
		 * " anos de idade e mora em "+ cidade+ ".");
		 */

		String nome = JOptionPane.showInputDialog("Informe seu nome");
		int idade = Integer.parseInt(JOptionPane.showInputDialog("Informe sua idade"));
		String cidade = JOptionPane.showInputDialog("Informe sua cidade");

		JOptionPane.showMessageDialog(null,	"Olá " + nome + ", você tem " + idade + " anos de idade e mora em " + cidade + ".");

	}

}
