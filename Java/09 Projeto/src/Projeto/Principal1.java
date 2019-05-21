package Projeto;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Principal1 {

	static String preco50 = "3499.90";
	static double preco32 = 999.90;
	static double precoDell = 2399.90;
	static double total50 = 0;
	static double totalDell = 0;
	static double total32 = 0;
	static double totalCompra = 0;

	public static void main(String[] args) {
		// cria um formulário
		JFrame formulario = new JFrame();
		formulario.setSize(600, 300);
		formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		formulario.setTitle("Compras");
		formulario.setLocationRelativeTo(null);
		formulario.setLayout(null);

		JLabel rotulo0 = new JLabel();

		// Botão
		JButton botao = new JButton();
		botao.setText("Departamentos");
		// botao.setSize(100, 20);
		botao.setBounds(220, 80, 150, 65);

		// Ação no botão
		botao.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				// Tela de departamentos
				JFrame depart = new JFrame();
				depart.setSize(400, 200);
				depart.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				depart.setTitle("Escolha um departamento");
				depart.setLocationRelativeTo(null);
				depart.setLayout(null);

				// Caixa de combinação
				JComboBox<String> combo = new JComboBox<String>();
				combo.setBounds(50, 20, 300, 50);
				combo.addItem("TVs e Notebook.");
				combo.addItem("Moveis.");
				combo.addItem("Eletrodomesticos.");

				// Botão
				JButton btn = new JButton("OK");
				btn.setBounds(120, 85, 150, 35);

				// Ação no botão
				btn.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {

						// cria um formulário
						JFrame tv = new JFrame();
						tv.setSize(600, 300);
						tv.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
						tv.setTitle("Produtos");
						tv.setLocationRelativeTo(null);
						tv.setLayout(null);

						// Rótulo
						JLabel rotulo50 = new JLabel();
						rotulo50.setText("SmartTV 50' 4k: ");
						rotulo50.setBounds(10, 30, 130, 30);

						// Rótulo
						JLabel rotuloDell = new JLabel();
						rotuloDell.setText("Notebook Dell 1T 8GB RAM: ");
						rotuloDell.setBounds(10, 50, 200, 30);

						// Rótulo
						JLabel rotulo32 = new JLabel();
						rotulo32.setText("SmartTV 32' Full HD: ");
						rotulo32.setBounds(10, 70, 200, 30);

						// Rótulo
						JLabel preco50 = new JLabel();
						preco50.setText("3499.90");
						preco50.setBounds(250, 30, 130, 30);

						// Rótulo
						JLabel preco32 = new JLabel();
						preco32.setText("999.90");
						preco32.setBounds(257, 70, 200, 30);

						// Rótulo
						JLabel precoDell = new JLabel();
						precoDell.setText("2399.90");
						precoDell.setBounds(250, 50, 200, 30);

						// Botão
						JButton botao1 = new JButton();
						botao1.setText("+");
						// botao.setSize(150, 75);
						botao1.setBounds(360, 35, 45, 20);

						// Quantidade de produtos
						JTextField campoQtd = new JTextField("1");
						campoQtd.setBounds(420, 35, 30, 20);

						// Ação no botão
						botao1.addActionListener(new ActionListener() {

							@Override
							public void actionPerformed(ActionEvent e) {
								int qtdAtual1 = Integer.parseInt(campoQtd.getText()) + 1;
								campoQtd.setText(String.valueOf(qtdAtual1));

								total50 = (qtdAtual1 * 3499.90);
								rotulo0.setText("Total R$ " + (totalCompra));
							}
						});

						// Botão
						JButton botao2 = new JButton();
						botao2.setText("-");
						// botao.setSize(150, 75);
						botao2.setBounds(470, 35, 45, 20);

						// Ação no botão
						botao2.addActionListener(new ActionListener() {

							@Override
							public void actionPerformed(ActionEvent e) {

								int qtdAtual2 = Integer.parseInt(campoQtd.getText()) - 1;
								campoQtd.setText(String.valueOf(qtdAtual2));

								total50 = (totalCompra - 3499.90);
								rotulo0.setText("Total R$ " + (totalCompra));
							}

						});

						// Quantidade de produtos
						JTextField campoQtd1 = new JTextField("0");
						campoQtd1.setBounds(420, 55, 30, 20);

						// Botão
						JButton botao3 = new JButton();
						botao3.setText("+");
						// botao.setSize(100, 20);
						botao3.setBounds(360, 55, 45, 20);

						// Ação no botão
						botao3.addActionListener(new ActionListener() {

							@Override
							public void actionPerformed(ActionEvent e) {
								int qtdAtual3 = Integer.parseInt(campoQtd1.getText()) + 1;
								campoQtd1.setText(String.valueOf(qtdAtual3));

								totalDell = (qtdAtual3 * 2399.90);
								rotulo0.setText("Total R$ " + (totalCompra));
							}
						});

						// Botão
						JButton botao4 = new JButton();
						botao4.setText("-");
						// botao.setSize(150, 75);
						botao4.setBounds(470, 55, 45, 20);

						// Ação no botão
						botao4.addActionListener(new ActionListener() {

							@Override
							public void actionPerformed(ActionEvent e) {

								int qtdAtual4 = Integer.parseInt(campoQtd1.getText()) - 1;
								campoQtd1.setText(String.valueOf(qtdAtual4));

								totalDell = (totalCompra - 2399.90);
								rotulo0.setText("Total R$ " + (totalCompra));
							}

						});

						// Quantidade de produtos
						JTextField campoQtd2 = new JTextField("0");
						campoQtd2.setBounds(420, 75, 30, 20);

						// Botão
						JButton botao5 = new JButton();
						botao5.setText("+");
						// botao.setSize(100, 20);
						botao5.setBounds(360, 75, 45, 20);

						// Ação no botão
						botao5.addActionListener(new ActionListener() {

							@Override
							public void actionPerformed(ActionEvent e) {
								int qtdAtual5 = Integer.parseInt(campoQtd2.getText()) + 1;
								campoQtd2.setText(String.valueOf(qtdAtual5));

								total32 = (qtdAtual5 * 999.90);
								rotulo0.setText("Total R$ " + (totalCompra));
							}
						});

						// Botão
						JButton botao6 = new JButton();
						botao6.setText("-");
						// botao.setSize(150, 75);
						botao6.setBounds(470, 75, 45, 20);

						// Ação no botão
						botao6.addActionListener(new ActionListener() {

							@Override
							public void actionPerformed(ActionEvent e) {

								int qtdAtual6 = Integer.parseInt(campoQtd2.getText()) - 1;
								campoQtd2.setText(String.valueOf(qtdAtual6));

								totalDell = (totalCompra - 999.90);
								rotulo0.setText("Total R$ " + (totalCompra));
							}

						});

						// Botão
						JButton botaoAdd = new JButton();
						botaoAdd.setText("Adicionar o carrinho");
						// botao.setSize(150, 75);
						botaoAdd.setBounds(470, 200, 45, 20);

						// Ação no botão
						botao6.addActionListener(new ActionListener() {

							@Override
							public void actionPerformed(ActionEvent e) {

								int qtdAtual6 = Integer.parseInt(campoQtd2.getText()) - 1;
								campoQtd2.setText(String.valueOf(qtdAtual6));

								totalDell = (totalCompra - 999.90);
								rotulo0.setText("Total R$ " + (totalCompra));
							}

						});

						// Rótulo

						rotulo0.setText("Total R$ " + totalCompra);
						rotulo0.setBounds(300, 150, 200, 30);

						tv.add(rotulo50);
						tv.add(rotuloDell);
						tv.add(rotulo32);
						tv.add(rotulo0);

						tv.add(preco50);
						tv.add(preco32);
						tv.add(precoDell);

						tv.add(botao1);
						tv.add(botao2);
						tv.add(botao3);
						tv.add(botao4);
						tv.add(botao5);
						tv.add(botao6);
						tv.add(botaoAdd);

						tv.add(campoQtd);
						tv.add(campoQtd1);
						tv.add(campoQtd2);

						tv.setVisible(true);

					}
				});
				depart.add(combo);
				depart.add(btn);

				// Exibir formulário e os componentes
				depart.setVisible(true);
			}

		});
		// Adicionar elementos ao formulário
		formulario.add(botao);

		// Exibir formulário e os componentes
		formulario.setVisible(true);
	}

}
