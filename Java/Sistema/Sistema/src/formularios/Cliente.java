package formularios;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import acao.AcaoProd;
import beans.Loja;
import dados.Dados;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;

public class Cliente extends JFrame {

	private JPanel contentPane;
	private JTextField textBusca;
	public static JTable table;

	public static int indice;
	private static int codigoProd;
	public static int carrinho1;

	public Cliente() {

		AcaoProd a = new AcaoProd();
		Loja loja = new Loja();

		JButton btnAdicionarAoCarrinho = new JButton("Adicionar ao carrinho");

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 697, 625);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblProdutos = new JLabel("Produtos");
		lblProdutos.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblProdutos.setBounds(291, 22, 78, 25);
		contentPane.add(lblProdutos);

		JLabel lblDepartamentos = new JLabel("Departamentos");
		lblDepartamentos.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblDepartamentos.setBounds(267, 81, 105, 16);
		contentPane.add(lblDepartamentos);

		JComboBox comboDepart = new JComboBox();
		comboDepart.setBounds(382, 80, 162, 22);
		contentPane.add(comboDepart);
		comboDepart.addItem("");
		comboDepart.addItem("Terror");
		comboDepart.addItem("RPG");
		comboDepart.addItem("Battle Royale");
		comboDepart.addItem("Luta");
		comboDepart.addItem("Aventura");

		textBusca = new JTextField();
		textBusca.setBounds(69, 81, 188, 20);
		contentPane.add(textBusca);
		textBusca.setColumns(10);

		JLabel lblBusar = new JLabel("Buscar");
		lblBusar.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblBusar.setBounds(20, 82, 48, 14);
		contentPane.add(lblBusar);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

			}
		});
		scrollPane.setBounds(10, 130, 661, 395);
		contentPane.add(scrollPane);

		table = new JTable();

		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {

				// Obter o índice da tabela
				indice = table.getSelectedRow();

				// Adicionar o valor do indice no atributo
				codigoProd = indice;

				// Selecionando dados do curso
				CadastroProd.textProduto.setText(table.getValueAt(indice, 0).toString());
				CadastroProd.textCodigo.setText(table.getValueAt(indice, 1).toString());
				CadastroProd.textPreco.setText(table.getValueAt(indice, 2).toString());
				table.getValueAt(indice, 3);
				comboDepart.setSelectedItem(table.getValueAt(indice, 4).toString());

			}
		});
		scrollPane.setColumnHeaderView(table);
		table.setModel(a.selecionar());

		scrollPane.setViewportView(table);

		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				for (int indice = 0; indice < Dados.arrayProdutos.size(); indice++) {
					if (textBusca.getText().equals(Dados.arrayProdutos.get(indice).getProduto()) || comboDepart
							.getSelectedItem().toString().equals(Dados.arrayProdutos.get(indice).getDepartamento())) {

						Dados.arrayProdutos.get(indice).getProduto().toString();
						// loja.setProduto(CadastroProd.textProduto.getText());
						// loja.setCodigo(CadastroProd.textCodigo.getText());
						// loja.setPreco(CadastroProd.textPreco.getText());
						// loja.setDepartamento(CadastroProd.comboDepart.getSelectedItem().toString());
						// int quant = Integer.parseInt(CadastroProd.spinnerQtd.getValue().toString());

					} else {
						JOptionPane.showMessageDialog(null, "Produto não existe");
					}
				}

			}
		});
		btnBuscar.setBounds(566, 71, 105, 41);
		contentPane.add(btnBuscar);

		// Botão Adicionar ao carrinho
		btnAdicionarAoCarrinho.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				for(int i = 0; i< Dados.arrayProdutos.size(); i++) {
					if(Dados.arrayProdutos.get(i).getProduto().equals(table.getValueAt(codigoProd, 0))) {
						Loja e = new Loja();
						e.setProduto(CadastroProd.textProduto.getText());
						e.setPreco(CadastroProd.textPreco.getText());
						e.setQuantidade(AcaoProd.quant);
						Dados.arrayCarrinho.add(e);
					}
				}

			}
		});
		btnAdicionarAoCarrinho.setBounds(267, 539, 162, 36);
		contentPane.add(btnAdicionarAoCarrinho);

		JButton btnVoltar_1 = new JButton("Voltar");
		btnVoltar_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				setVisible(false);

			}
		});
		btnVoltar_1.setBounds(58, 539, 150, 36);
		contentPane.add(btnVoltar_1);
		
		JButton btnCarrinho = new JButton("Carrinho");
		btnCarrinho.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Carrinho carrinho = new Carrinho();
				carrinho.setVisible(true);
				carrinho.setLocationRelativeTo(null);
			}
		});
		btnCarrinho.setBounds(484, 539, 150, 36);
		contentPane.add(btnCarrinho);
	}
}
