import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Principal {

	public static void main(String[] args) {

		// JFrame
		JFrame f = new JFrame();
		f.setSize(400, 300);
		f.setLayout(null);
		f.setLocationRelativeTo(null);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Quantidade de produtos adquiridos
		JTextField campoQtd = new JTextField("0");
		campoQtd.setBounds(100, 10, 100, 20);

		// Quantidade de produtos adquiridos
		JTextField campoQtd2 = new JTextField("0");
		campoQtd2.setBounds(100, 10, 100, 20);

		// Quantidade de produtos adquiridos
		JTextField campoQtd3 = new JTextField("0");
		campoQtd3.setBounds(100, 10, 200, 20);

		// Quantidade de produtos adquiridos
		JTextField campoQtd4 = new JTextField("0");
		campoQtd4.setBounds(100, 10, 200, 20);

		// Quantidade de produtos adquiridos
		JTextField campoQtd5 = new JTextField("0");
		campoQtd5.setBounds(100, 10, 200, 20);

		// Painel de produtos
		JPanel painelProdutos = new JPanel();
		painelProdutos.setBackground(Color.GRAY);
		painelProdutos.setLayout(null);
		painelProdutos.setBounds(10, 50, 365, 190);

		// Produtos
		JButton prod01 = new JButton("01");
		prod01.setBounds(10, 10, 50, 20);
		prod01.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				int qtdAtual1 = Integer.parseInt(campoQtd.getText()) + 1;
				campoQtd.setText(String.valueOf(qtdAtual1));
			}
		});

		JButton prod02 = new JButton("02");
		prod02.setBounds(60, 10, 50, 20);
		prod02.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				int qtdAtual2 = Integer.parseInt(campoQtd2.getText()) + 1;
				campoQtd2.setText(String.valueOf(qtdAtual2));
			}
		});

		JButton prod03 = new JButton("03");
		prod03.setBounds(110, 10, 50, 20);
		prod03.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				int qtdAtua3 = Integer.parseInt(campoQtd3.getText()) + 1;
				campoQtd3.setText(String.valueOf(qtdAtua3));
			}
		});

		JButton prod04 = new JButton("04");
		prod04.setBounds(10, 50, 50, 20);
		prod04.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				int qtdAtual4 = Integer.parseInt(campoQtd4.getText()) + 1;
				campoQtd4.setText(String.valueOf(qtdAtual4));
			}
		});

		JButton prod05 = new JButton("05");
		prod05.setBounds(60, 50, 50, 20);
		prod05.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				int qtdAtual5 = Integer.parseInt(campoQtd5.getText()) + 1;
				campoQtd5.setText(String.valueOf(qtdAtual5));
			}
		});

		// Adicionar elementos ao painel
		painelProdutos.add(prod01);
		painelProdutos.add(prod02);
		painelProdutos.add(prod03);
		painelProdutos.add(prod04);
		painelProdutos.add(prod05);

		// Adicionar elementos ao formulário
		f.add(campoQtd);
		f.add(painelProdutos);

		// Exibir o formulário
		f.setVisible(true);

	}

}
