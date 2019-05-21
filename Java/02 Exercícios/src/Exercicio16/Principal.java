package Exercicio16;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {

		String pedido = "\n1- Hambúrguer + Suco de Laranja = R$ 5,00";
		pedido += "\n2- Sanduíche natural + Suco de Uva = R$ 4,50";
		pedido += "\n3- Prato do dia R$ 8,00";
		pedido += "\n4- Pizza = R$12,00";
		pedido += "\n5- Lasanha = R$ 16,50";
		pedido += "\n6- Pão de queijo = R$ 1,00";
		pedido += "\n7- Bolo = R$ 2,50";

		int respostaPed = Integer.parseInt(JOptionPane.showInputDialog("Qual o número do pedido: " + pedido));
		double pagamento = Double.parseDouble(JOptionPane.showInputDialog("Pagamento:"));
		double troco = pagamento - respostaPed;

		switch (respostaPed) {
		case 1:
			JOptionPane.showMessageDialog(null, "Pedido escolhido: \n1- Hambúrguer + Suco de Laranja = R$ 5,00");
			if (pagamento > 5) {
				JOptionPane.showMessageDialog(null, "O valor do troco é: " + (pagamento - 5));
			} else if (pagamento == 5) {
				JOptionPane.showMessageDialog(null, "Não precisa de troco");
			} else {
				JOptionPane.showMessageDialog(null, "O valor está incorreto.");
			}
			break;
		case 2:
			JOptionPane.showMessageDialog(null, "Pedido escolhido: \n2- Sanduíche natural + Suco de Uva = R$ 4,50");
			if (pagamento > 4.5) {
				JOptionPane.showMessageDialog(null, "O valor do troco é: " + (pagamento - 4.5));
			} else if (pagamento == 4.5) {
				JOptionPane.showMessageDialog(null, "Não precisa de troco");
			} else {
				JOptionPane.showMessageDialog(null, "O valor está incorreto.");
			}
			break;
		case 3:
			JOptionPane.showMessageDialog(null, "Pedido escolhido: \n3- Prato do dia R$ 8,00");
			if (pagamento > 8) {
				JOptionPane.showMessageDialog(null, "O valor do troco é: " + (pagamento - 8));
			} else if (pagamento == 8) {
				JOptionPane.showMessageDialog(null, "Não precisa de troco");
			} else {
				JOptionPane.showMessageDialog(null, "O valor está incorreto.");
			}
			break;
		case 4:
			JOptionPane.showMessageDialog(null, "Pedido escolhido: \n4- Pizza = R$12,00");
			if (pagamento > 12) {
				JOptionPane.showMessageDialog(null, "O valor do troco é: " + (pagamento - 12));
			} else if (pagamento == 12) {
				JOptionPane.showMessageDialog(null, "Não precisa de troco");
			} else {
				JOptionPane.showMessageDialog(null, "O valor está incorreto.");
			}
			break;
		case 5:
			JOptionPane.showMessageDialog(null, "Pedido escolhido: \n5- Lasanha = R$ 16,50");
			if (pagamento > 16.5) {
				JOptionPane.showMessageDialog(null, "O valor do troco é: " + (pagamento - 16.5));
			} else if (pagamento == 16.5) {
				JOptionPane.showMessageDialog(null, "Não precisa de troco");
			} else {
				JOptionPane.showMessageDialog(null, "O valor está incorreto.");
			}
			break;
		case 6:
			JOptionPane.showMessageDialog(null, "Pedido escolhido: \n6- Pão de queijo = R$ 1,00");
			if (pagamento > 1) {
				JOptionPane.showMessageDialog(null, "O valor do troco é: " + (pagamento - 1));
			} else if (pagamento == 1) {
				JOptionPane.showMessageDialog(null, "Não precisa de troco");
			} else {
				JOptionPane.showMessageDialog(null, "O valor está incorreto.");
			}
			break;
		case 7:
			JOptionPane.showMessageDialog(null, "Pedido escolhido: \n7- Bolo = R$ 2,50");
			if (pagamento > 2.5) {
				JOptionPane.showMessageDialog(null, "O valor do troco é: " + (pagamento - 2.5));
			} else if (pagamento == 2.5) {
				JOptionPane.showMessageDialog(null, "Não precisa de troco");
			} else {
				JOptionPane.showMessageDialog(null, "O valor está incorreto.");
			}
			break;
		}
	}
}