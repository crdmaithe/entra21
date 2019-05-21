package Exercicio23;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {

		double altura = Double.parseDouble(JOptionPane.showInputDialog("Informe sua altura"));
		double peso = Double.parseDouble(JOptionPane.showInputDialog("Informe seu peso"));

		double imc = peso / (altura * altura);

		JOptionPane.showMessageDialog(null, "seu imc é: " + imc);

		if (imc < 17) {
			JOptionPane.showMessageDialog(null, "Você está muito abaixo do peso");
		} else if (imc < 18.49) {
			JOptionPane.showMessageDialog(null, "Você está abaixo do peso");
		} else if (imc < 24.99) {
			JOptionPane.showMessageDialog(null, "Você está com o peso normal");
		} else if (imc < 29.99) {
			JOptionPane.showMessageDialog(null, "Você está acima do peso");
		} else if (imc < 34.99) {
			JOptionPane.showMessageDialog(null, "Você está com Obesidade I");
		} else if (imc < 39.99) {
			JOptionPane.showMessageDialog(null, "Você está com Obesidade II(Severa)");
		} else if (imc > 40) {
			JOptionPane.showMessageDialog(null, "Você está com Obesidade II(Mórbida)");
		}
	}
}