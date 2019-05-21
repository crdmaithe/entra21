package Projeto;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

public class Principal {

	// Declarando variáveis
	// Tvs e Notebooks
	static double preco50 = 3999.90;
	static double precoDell = 2499.90;
	static double preco32 = 999.90;
	static int tv50 = 0;
	static int tv32 = 0;
	static int dell = 0;

	// Móveis
	static double precoSofa = 599.90;
	static double precoCasal = 399.90;
	static double precoSolt = 599.90;
	static int sofa = 0;
	static int camaCasal = 0;
	static int camaSolt = 0;

	// Eletrodomésticos
	static double precoMicro = 599.90;
	static double precoGelad = 399.90;
	static double precoForno = 599.90;
	static int micro = 0;
	static int gelad = 0;
	static int forno = 0;

	// Total compra
	static double totalCompra = 0;
	static double totalCompra01 = 0;
	static double totalCompra02 = 0;

	static double frete = 15.00;

	public static void main(String[] args) {

		// cria um formulário
		JFrame formulario = new JFrame();
		formulario.setSize(600, 300);
		formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		formulario.setTitle("Compras");
		formulario.setLocationRelativeTo(null);
		formulario.setLayout(null);

		// rotulo usado np TotalCompra
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
				combo.addItem("TVs e Notebooks");
				combo.addItem("Moveis");
				combo.addItem("Eletrodomesticos");

				// Ação no botão
				combo.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {

						// verifica se o combo selecionado é o de TVs e
						// Notebooks
						if (combo.getSelectedItem().toString().equals("TVs e Notebooks")) {

							// cria um formulário
							JFrame tv = new JFrame();
							tv.setSize(500, 250);
							tv.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
							tv.setTitle("TVs e Notebooks.");
							tv.setLocationRelativeTo(null);
							tv.setLayout(null);

							// Radio Button TV 50
							JRadioButton radio50 = new JRadioButton("SmartTV 50' 4k: R$ " + preco50);
							radio50.setBounds(10, 30, 250, 30);
							radio50.setActionCommand("Produto adicionado no carrinho.");

							// ação do botão
							radio50.addActionListener(new ActionListener() {

								// soma 1 na quantidade de tvs 50'
								@Override
								public void actionPerformed(ActionEvent e) {
									tv50++;
								}
							});

							// Radio Button Notebook
							JRadioButton radioDell = new JRadioButton("Notebook Dell 1T 8GB RAM: R$ " + precoDell);
							radioDell.setBounds(10, 50, 250, 30);
							radioDell.setActionCommand("Produto adicionado no carrinho.");

							radioDell.addActionListener(new ActionListener() {

								// soma 1 quantidade de notebooks
								@Override
								public void actionPerformed(ActionEvent e) {
									dell++;
								}
							});

							// Radio Button TV 32
							JRadioButton radio32 = new JRadioButton("SmartTV 32' Full HD: R$ " + preco32);
							radio32.setBounds(10, 70, 250, 30);
							radio32.setActionCommand("Produto adicionado no carrinho.");

							radio32.addActionListener(new ActionListener() {

								@Override
								public void actionPerformed(ActionEvent e) {
									tv32++;
								}
							});

							// Agrupar botões de rádio
							final ButtonGroup bg = new ButtonGroup();
							bg.add(radio50);
							bg.add(radioDell);
							bg.add(radio32);

							// Botão
							JButton btn = new JButton("Adicionar produto no carrinho");
							btn.setBounds(115, 120, 250, 30);

							// Ação no botão

							btn.addActionListener(new ActionListener() {

								public void actionPerformed(ActionEvent e) {

									try {
										JOptionPane.showMessageDialog(null, bg.getSelection().getActionCommand());

										int ok = JOptionPane.showConfirmDialog(null, "Deseja seguir para o carrinho?");
										switch (ok) {
										case 0:

											// Tela do carrinho
											JFrame carrinho = new JFrame();
											carrinho.setSize(500, 250);
											carrinho.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
											carrinho.setTitle("Carrinho de compras.");
											carrinho.setLocationRelativeTo(null);
											carrinho.setLayout(null);

											JLabel rotuloProd = new JLabel();
											rotuloProd.setText("Produtos");
											rotuloProd.setBounds(50, 15, 80, 30);

											JLabel rotuloQtd = new JLabel();
											rotuloQtd.setText("Quantidade");
											rotuloQtd.setBounds(210, 15, 100, 30);

											JLabel rotuloPreco = new JLabel();
											rotuloPreco.setText("Preço");
											rotuloPreco.setBounds(400, 15, 100, 30);

											JLabel rotuloFrete = new JLabel();
											rotuloFrete.setText("Frete fixo: R$ " + frete);
											rotuloFrete.setBounds(300, 120, 200, 30);

											// se a quantidade de tvs 50' é !=
											// 0, executa o código abaixo
											if (tv50 != 0) {
												// Rótulo
												JLabel rotulo50 = new JLabel();
												rotulo50.setText("SmartTV 50' 4k: ");
												rotulo50.setBounds(10, 30, 200, 30);

												JLabel preco01 = new JLabel();
												preco01.setText("" + (tv50 * preco50));
												preco01.setBounds(395, 30, 100, 30);

												JLabel qtd01 = new JLabel();
												qtd01.setText("" + tv50);
												qtd01.setBounds(230, 30, 100, 30);

												totalCompra = totalCompra + (tv50 * preco50);
												rotulo0.setText("Total R$ " + totalCompra);

												carrinho.add(rotulo50);
												carrinho.add(qtd01);
												carrinho.add(preco01);
											}
											// se a quantidade de notebooks é !=
											// 0, executa o código abaixo
											if (dell != 0) {
												// Rótulos
												JLabel rotuloDell = new JLabel();
												rotuloDell.setText("Notebook Dell 1T 8GB RAM: ");
												rotuloDell.setBounds(10, 50, 200, 30);

												JLabel preco02 = new JLabel();
												preco02.setText("" + (dell * precoDell));
												preco02.setBounds(395, 50, 100, 30);

												JLabel qtd02 = new JLabel();
												qtd02.setText("" + dell);
												qtd02.setBounds(230, 50, 100, 30);

												totalCompra = totalCompra + (dell * precoDell);
												rotulo0.setText("Total R$ " + totalCompra);

												carrinho.add(rotuloDell);
												carrinho.add(qtd02);
												carrinho.add(preco02);
											}
											// se a quantidade de tvs 32' é !=
											// 0, executa o código abaixo
											if (tv32 != 0) {
												// Rótulos
												JLabel rotulo32 = new JLabel();
												rotulo32.setText("SmartTV 32' Full HD ");
												rotulo32.setBounds(10, 70, 200, 30);

												JLabel preco03 = new JLabel();
												preco03.setText("" + (tv32 * preco32));
												preco03.setBounds(395, 70, 100, 30);

												JLabel qtd03 = new JLabel();
												qtd03.setText("" + tv32);
												qtd03.setBounds(230, 70, 100, 30);

												totalCompra = totalCompra + (tv32 * preco32);
												rotulo0.setText("Total R$ " + totalCompra);

												carrinho.add(qtd03);
												carrinho.add(rotulo32);
												carrinho.add(preco03);
											}

											// mostra o valor total das compras
											rotulo0.setBounds(320, 150, 200, 30);
											rotulo0.setText("Total R$ " + (frete + totalCompra));

											carrinho.setVisible(true);

											carrinho.add(rotuloFrete);
											carrinho.add(rotuloQtd);
											carrinho.add(rotuloProd);
											carrinho.add(rotuloPreco);
											carrinho.add(rotulo0);

											break;
										case 1:
											break;
										case 2:
											JOptionPane.showMessageDialog(null, "Você cancelou");
											break;
										}

									} catch (Exception er) {
										int pgnt = JOptionPane.showConfirmDialog(null,
												"Nenhum produto selecionado. Deseja voltar aos departamentos?");
										switch (pgnt) {
										case 0:
											tv.setVisible(false);
											depart.setVisible(true);
											break;
										case 1:

											break;
										case 2:
											JOptionPane.showMessageDialog(null, "Você cancelou");
											break;
										default:
											JOptionPane.showMessageDialog(null, "Você saiu");
										}

									}
								}
							});

							// Adicionar elementos ao formulário
							formulario.add(radio50);
							formulario.add(radioDell);
							formulario.add(radio32);
							formulario.add(btn);

							tv.add(radio50);
							tv.add(radioDell);
							tv.add(radio32);
							tv.add(btn);

							tv.setVisible(true);

						}
						// verifica se o combo selecionado é o de Moveis
						if (combo.getSelectedItem().toString().equals("Moveis")) {

							// cria um formulário
							JFrame moveis = new JFrame();
							moveis.setSize(500, 250);
							moveis.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
							moveis.setTitle("Moveis.");
							moveis.setLocationRelativeTo(null);
							moveis.setLayout(null);

							// Radio Button Sofá
							JRadioButton radioSofa = new JRadioButton("Sofá 2 lug.: R$ " + precoSofa);
							radioSofa.setBounds(10, 30, 250, 30);
							radioSofa.setActionCommand("Produto adicionado no carrinho.");

							radioSofa.addActionListener(new ActionListener() {

								@Override
								public void actionPerformed(ActionEvent e) {
									sofa++;
								}
							});

							// Radio Button Cama casal
							JRadioButton radioCasal = new JRadioButton("Cama casal tam. padrão: R$ " + precoCasal);
							radioCasal.setBounds(10, 50, 250, 30);
							radioCasal.setActionCommand("Produto adicionado no carrinho.");

							radioCasal.addActionListener(new ActionListener() {

								@Override
								public void actionPerformed(ActionEvent e) {
									camaCasal++;
								}
							});

							// Radio Button Cama solteiro
							JRadioButton radioSolt = new JRadioButton("Cama solteiro tam. padrão: R$ " + precoSolt);
							radioSolt.setBounds(10, 70, 250, 30);
							radioSolt.setActionCommand("Produto adicionado no carrinho.");

							radioSolt.addActionListener(new ActionListener() {

								@Override
								public void actionPerformed(ActionEvent e) {
									camaSolt++;
								}
							});

							// Agrupar botões de rádio
							final ButtonGroup bg = new ButtonGroup();
							bg.add(radioSofa);
							bg.add(radioCasal);
							bg.add(radioSolt);

							// Botão
							JButton btn1 = new JButton("Adicionar produto no carrinho");
							btn1.setBounds(115, 120, 250, 30);

							// Ação no botão

							btn1.addActionListener(new ActionListener() {

								public void actionPerformed(ActionEvent e) {

									try {
										// getSelection: obtém o Rádio Button
										// selecionado
										// getActionCommand: retorna um valor do
										// rádio Button
										JOptionPane.showMessageDialog(null, bg.getSelection().getActionCommand());

										int ok = JOptionPane.showConfirmDialog(null, "Deseja seguir para o carrinho? ");

										switch (ok) {
										case 0:
											// Tela do carrinho

											JFrame carrinho1 = new JFrame();
											carrinho1.setSize(500, 250);
											carrinho1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
											carrinho1.setTitle("Carrinho de compras.");
											carrinho1.setLocationRelativeTo(null);
											carrinho1.setLayout(null);

											JLabel rotuloProd = new JLabel();
											rotuloProd.setText("Produtos");
											rotuloProd.setBounds(50, 15, 80, 30);

											JLabel rotuloQtd = new JLabel();
											rotuloQtd.setText("Quantidade");
											rotuloQtd.setBounds(210, 15, 100, 30);

											JLabel rotuloPreco = new JLabel();
											rotuloPreco.setText("Preço");
											rotuloPreco.setBounds(400, 15, 100, 30);

											JLabel rotuloFrete = new JLabel();
											rotuloFrete.setText("Frete fixo: R$ " + frete);
											rotuloFrete.setBounds(300, 120, 200, 30);

											if (sofa != 0) {
												// Rótulo
												JLabel rotuloSofa = new JLabel();
												rotuloSofa.setText("Sofá 2 lug. ");
												rotuloSofa.setBounds(10, 30, 200, 30);

												JLabel preco01 = new JLabel();
												preco01.setText("" + (sofa * precoSofa));
												preco01.setBounds(395, 30, 100, 30);

												JLabel qtd01 = new JLabel();
												qtd01.setText("" + sofa);
												qtd01.setBounds(230, 30, 100, 30);

												totalCompra01 = totalCompra01 + (sofa * precoSofa);
												rotulo0.setText("Total R$ " + totalCompra01);

												carrinho1.add(qtd01);
												carrinho1.add(preco01);

												carrinho1.add(rotuloSofa);
											}
											if (camaCasal != 0) {
												// Rótulo
												JLabel rotuloCasal = new JLabel();
												rotuloCasal.setText("Cama casal tam. padrão ");
												rotuloCasal.setBounds(10, 50, 200, 30);

												JLabel preco02 = new JLabel();
												preco02.setText("" + (camaCasal * precoCasal));
												preco02.setBounds(395, 50, 100, 30);

												JLabel qtd02 = new JLabel();
												qtd02.setText("" + camaCasal);
												qtd02.setBounds(230, 50, 100, 30);

												totalCompra01 = totalCompra01 + (camaCasal * precoCasal);
												rotulo0.setText("Total R$ " + totalCompra01);

												carrinho1.add(qtd02);
												carrinho1.add(preco02);

												carrinho1.add(rotuloCasal);
											}
											if (camaSolt != 0) {
												// Rótulo
												JLabel rotuloSolt = new JLabel();
												rotuloSolt.setText("Cama solteiro tam. padrão ");
												rotuloSolt.setBounds(10, 70, 300, 30);

												JLabel preco03 = new JLabel();
												preco03.setText("" + (camaSolt * precoSolt));
												preco03.setBounds(395, 70, 100, 30);

												JLabel qtd03 = new JLabel();
												qtd03.setText("" + camaSolt);
												qtd03.setBounds(230, 70, 100, 30);

												totalCompra01 = totalCompra01 + (camaSolt * precoSolt);
												rotulo0.setText("Total R$ " + totalCompra01);

												carrinho1.add(qtd03);
												carrinho1.add(preco03);

												carrinho1.add(rotuloSolt);
											}

											rotulo0.setBounds(320, 150, 200, 30);
											rotulo0.setText("Total R$ " + (frete + totalCompra01));

											carrinho1.setVisible(true);

											carrinho1.add(rotuloFrete);
											carrinho1.add(rotuloQtd);
											carrinho1.add(rotuloProd);
											carrinho1.add(rotuloPreco);
											carrinho1.add(rotulo0);

										case 1:
											break;
										}

									} catch (Exception er) {
										int pgnt = JOptionPane.showConfirmDialog(null,
												"Nenhum produto selecionado. Deseja voltar aos departamentos?");
										switch (pgnt) {
										case 0:
											moveis.setVisible(false);
											depart.setVisible(true);
											break;
										case 1:
											break;
										case 2:

										}

									}
								}
							});

							// Adicionar elementos ao formulário
							formulario.add(radioSofa);
							formulario.add(radioCasal);
							formulario.add(radioSolt);
							formulario.add(btn1);

							moveis.add(radioSofa);
							moveis.add(radioCasal);
							moveis.add(radioSolt);
							moveis.add(btn1);

							moveis.setVisible(true);

						}

						if (combo.getSelectedItem().toString().equals("Eletrodomesticos")) {

							// cria um formulário
							JFrame eletro = new JFrame();
							eletro.setSize(500, 250);
							eletro.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
							eletro.setTitle("Eletrodomesticos");
							eletro.setLocationRelativeTo(null);
							eletro.setLayout(null);

							// Radio Button Microondas
							JRadioButton radioMicro = new JRadioButton("Microondas 33L: R$ " + precoMicro);
							radioMicro.setBounds(10, 30, 250, 30);
							radioMicro.setActionCommand("Produto adicionado no carrinho.");

							radioMicro.addActionListener(new ActionListener() {

								@Override
								public void actionPerformed(ActionEvent e) {
									micro++;
								}
							});

							// Radio Button Geladeira
							JRadioButton radioGelad = new JRadioButton("Geladeira 334L: R$ " + precoGelad);
							radioGelad.setBounds(10, 50, 250, 30);
							radioGelad.setActionCommand("Produto adicionado no carrinho.");

							radioGelad.addActionListener(new ActionListener() {

								@Override
								public void actionPerformed(ActionEvent e) {
									gelad++;
								}
							});

							// Radio Button Forno
							JRadioButton radioForno = new JRadioButton("Forno 50L: R$ " + precoForno);
							radioForno.setBounds(10, 70, 250, 30);
							radioForno.setActionCommand("Produto adicionado no carrinho.");

							radioForno.addActionListener(new ActionListener() {

								@Override
								public void actionPerformed(ActionEvent e) {
									forno++;
								}
							});

							// Agrupar botões de rádio
							final ButtonGroup bg = new ButtonGroup();
							bg.add(radioMicro);
							bg.add(radioGelad);
							bg.add(radioForno);

							// Botão
							JButton btn2 = new JButton("Adicionar produto no carrinho");
							btn2.setBounds(115, 120, 250, 30);

							// Ação no botão

							btn2.addActionListener(new ActionListener() {

								public void actionPerformed(ActionEvent e) {

									try {
										// getSelection: obtém o Rádio Button
										// selecionado
										// getActionCommand: retorna um valor do
										// rádio Button
										JOptionPane.showMessageDialog(null, bg.getSelection().getActionCommand());

										int ok = JOptionPane.showConfirmDialog(null, "Deseja seguir para o carrinho? ");

										switch (ok) {
										case 0:

											// Tela do carrinho
											JFrame carrinho2 = new JFrame();
											carrinho2.setSize(500, 250);
											carrinho2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
											carrinho2.setTitle("Carrinho de compras.");
											carrinho2.setLocationRelativeTo(null);
											carrinho2.setLayout(null);

											JLabel rotuloProd = new JLabel();
											rotuloProd.setText("Produtos");
											rotuloProd.setBounds(50, 15, 80, 30);

											JLabel rotuloQtd = new JLabel();
											rotuloQtd.setText("Quantidade");
											rotuloQtd.setBounds(210, 15, 100, 30);

											JLabel rotuloPreco = new JLabel();
											rotuloPreco.setText("Preço");
											rotuloPreco.setBounds(400, 15, 100, 30);

											JLabel rotuloFrete = new JLabel();
											rotuloFrete.setText("Frete fixo: R$ " + frete);
											rotuloFrete.setBounds(300, 120, 200, 30);

											if (micro != 0) {
												// Rótulo
												JLabel rotuloMicro = new JLabel();
												rotuloMicro.setText("Microondas 33L ");
												rotuloMicro.setBounds(10, 30, 200, 30);

												JLabel preco01 = new JLabel();
												preco01.setText("" + (micro * precoMicro));
												preco01.setBounds(395, 30, 100, 30);

												JLabel qtd01 = new JLabel();
												qtd01.setText("" + micro);
												qtd01.setBounds(230, 30, 100, 30);

												totalCompra02 = totalCompra02 + (micro * precoMicro);
												rotulo0.setText("Total R$ " + totalCompra02);

												carrinho2.add(qtd01);
												carrinho2.add(preco01);

												carrinho2.add(rotuloMicro);
											}
											if (gelad != 0) {
												// Rótulo
												JLabel rotuloGelad = new JLabel();
												rotuloGelad.setText("Geladeira 334L ");
												rotuloGelad.setBounds(10, 50, 200, 30);

												JLabel preco02 = new JLabel();
												preco02.setText("" + (gelad * precoGelad));
												preco02.setBounds(395, 50, 100, 30);

												JLabel qtd02 = new JLabel();
												qtd02.setText("" + gelad);
												qtd02.setBounds(230, 50, 100, 30);

												totalCompra02 = totalCompra02 + (gelad * precoGelad);
												rotulo0.setText("Total R$ " + totalCompra02);

												carrinho2.add(qtd02);
												carrinho2.add(preco02);

												carrinho2.add(rotuloGelad);
											}
											if (forno != 0) {
												// Rótulo
												JLabel rotuloForno = new JLabel();
												rotuloForno.setText("Forno 50L ");
												rotuloForno.setBounds(10, 70, 300, 30);

												JLabel preco03 = new JLabel();
												preco03.setText("" + (forno * precoForno));
												preco03.setBounds(395, 70, 100, 30);

												JLabel qtd03 = new JLabel();
												qtd03.setText("" + forno);
												qtd03.setBounds(230, 70, 100, 30);

												totalCompra02 = totalCompra02 + (forno * precoForno);
												rotulo0.setText("Total R$ " + totalCompra02);

												carrinho2.add(qtd03);
												carrinho2.add(preco03);

												carrinho2.add(rotuloForno);
											}

											rotulo0.setBounds(320, 150, 200, 30);
											rotulo0.setText("Total R$ " + (totalCompra02 + frete));

											carrinho2.setVisible(true);

											carrinho2.add(rotuloFrete);
											carrinho2.add(rotuloQtd);
											carrinho2.add(rotuloProd);
											carrinho2.add(rotuloPreco);
											carrinho2.add(rotulo0);

										case 2:
											break;
										}

									} catch (Exception er) {
										int pgnt = JOptionPane.showConfirmDialog(null,
												"Nenhum produto selecionado. Deseja voltar aos departamentos?");
										switch (pgnt) {
										case 0:
											eletro.setVisible(false);
											depart.setVisible(true);
											break;

										case 1:
											break;
										case 2:

										}

									}
								}
							});

							// Adicionar elementos ao formulário
							formulario.add(radioMicro);
							formulario.add(radioGelad);
							formulario.add(radioForno);
							formulario.add(btn2);

							eletro.add(radioMicro);
							eletro.add(radioGelad);
							eletro.add(radioForno);
							eletro.add(btn2);

							eletro.setVisible(true);

						}
					}

				});
				depart.add(combo);
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