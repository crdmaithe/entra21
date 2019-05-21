package Exercicio12;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {

		int velMax = Integer.parseInt(JOptionPane.showInputDialog("Informe a velocidade máxima permitida:"));
		int velocidade = Integer.parseInt(JOptionPane.showInputDialog("Informe a velocidade do veículo:"));
		int resto = velocidade - velMax;

		if (velocidade <= velMax) {
			JOptionPane.showMessageDialog(null, "Bom motorista.");
		} else if (resto <= 10) {
			JOptionPane.showMessageDialog(null, "Você ultrapassou o limite de velocidade, multa de R$ 50");
		} else if (resto <= 29) {
			JOptionPane.showMessageDialog(null, "Você ultrapassou o limite de velocidade, multa de R$ 100");
		} else if (resto >= 30) {
			JOptionPane.showMessageDialog(null, "Você ultrapassou o limite de velocidade, multa de R$ 200");
		}
	}
}
