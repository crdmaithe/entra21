package Exercicio14;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {

		int veiculo = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor do veículo:"));
		
		double imposto15 = veiculo * 0.15;
		double imposto20 = veiculo * 0.20;
		double distribuidor5 = veiculo * 0.05;
		double distribuidor10 = veiculo * 0.10;
		double distribuidor15 = veiculo * 0.15;

		if (veiculo <= 12000) {
			JOptionPane.showMessageDialog(null, "Isento de impostos.");
			JOptionPane.showMessageDialog(null, "Valor pago ao distribuidor: " + distribuidor5);
		} else if (veiculo <= 25000) {
			JOptionPane.showMessageDialog(null, "Você está pagando " + imposto15 + " de impostos");
			JOptionPane.showMessageDialog(null, "Valor do veículo sem impostos: " + (veiculo - imposto15));
			JOptionPane.showMessageDialog(null, "Valor pago ao distribuidor: " + distribuidor10);
		} else {
			JOptionPane.showMessageDialog(null, "Você está pagando " + imposto20 + " de impostos");
			JOptionPane.showMessageDialog(null, "Valor do veículo sem impostos: " + (veiculo - imposto20));
			JOptionPane.showMessageDialog(null, "Valor pago ao distribuidor: " + distribuidor15);
		}
	}
}
