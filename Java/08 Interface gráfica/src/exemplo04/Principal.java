package exemplo04;

import javax.swing.JComboBox;
import javax.swing.JFrame;

public class Principal {

	public static void main(String[] args) {

		// criar um formulário

		JFrame formulario = new JFrame();
		formulario.setSize(500, 300);
		formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		formulario.setTitle("Meu quarto formulário");
		formulario.setLocationRelativeTo(null);
		formulario.setLayout(null);

		// Caixa de combinação
		JComboBox<String> combo = new JComboBox<String>();
		combo.setBounds(10, 10, 470, 30);
		combo.addItem("Opção 01");
		combo.addItem("Opção 02");
		combo.addItem("Opção 03");

		// Adicionar combo ao formulário
		formulario.add(combo);

		// Exibir formulário e os componentes
		formulario.setVisible(true);

	}

}
