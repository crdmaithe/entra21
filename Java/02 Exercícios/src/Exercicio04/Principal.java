package Exercicio04;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {

		String produto = JOptionPane.showInputDialog(null, "Informe o produto:");
		double valor = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o valor do produto"));
		String pagamento = JOptionPane.showInputDialog(null, "Informe a forma de pagamento");
		boolean desconto1;
		double desconto = (valor * 10) / 100;

		if (pagamento.equals("a vista") && valor > 500) {
			desconto1 = true;
			if (desconto1 = true) {
				valor = valor - ((valor * 10) / 100);
			}
		} else {
			JOptionPane.showMessageDialog(null, "O produto não tem desconto");
		}
		JOptionPane.showMessageDialog(null, "O produto " + produto + " custará " + valor);
	}

}
