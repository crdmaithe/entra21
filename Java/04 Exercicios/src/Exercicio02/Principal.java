package Exercicio02;

import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;

public class Principal {

	public static void main(String[] args) {
		String nome;
		double altura;
		int idade;
		double peso;
		int inc = 0;

		int verificarContinuar;
		boolean continuar = true;

		String sair = "sair";

		do {
			// Obter dados
			nome = JOptionPane.showInputDialog("Informe seu nome:");
			altura = Double.parseDouble(JOptionPane.showInputDialog("Informe sua altura:"));
			idade = Integer.parseInt(JOptionPane.showInputDialog("Informe sua idade:"));
			peso = Double.parseDouble(JOptionPane.showInputDialog("Informe seu peso:"));

			// Verifica se quer continuar
			verificarContinuar = JOptionPane.showConfirmDialog(null, "Continuar? ");
			if (verificarContinuar != 0) {
				continuar = false;
			}

		} while (continuar == true);

		JOptionPane.showMessageDialog(null, "Teve " + inc + " usuário(s) cadastrado(s).");

	}

}
