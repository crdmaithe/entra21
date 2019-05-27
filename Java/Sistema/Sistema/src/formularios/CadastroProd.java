package formularios;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import acao.AcaoColab;
import acao.AcaoProd;
import beans.Loja;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SpinnerModel;
import javax.swing.SpinnerNumberModel;
import javax.swing.JComboBox;
import javax.swing.JSpinner;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;

public class CadastroProd extends JFrame {

	private JPanel contentPane;
	public static JTextField textProduto;
	public static JTextField textCodigo;
	public static JTextField textPreco;
	public static int indice;
	public static int codigoProd;
	public static JTable table;
	public static JSpinner spinnerQtd = new JSpinner();

	public static JComboBox comboDepart = new JComboBox();

	// Botões
	public static JButton btnAlterar = new JButton("Alterar");
	public static JButton btnExcluir = new JButton("Excluir");
	public static JButton btnVoltar = new JButton("Voltar");
	public static JButton btnCadastrar = new JButton("Cadastrar");

	public CadastroProd() {

		AcaoProd a = new AcaoProd();

		Loja loja = new Loja();

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 548, 542);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblCadastroDeProdutos = new JLabel("Cadastro de Produtos");
		lblCadastroDeProdutos.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblCadastroDeProdutos.setBounds(172, 11, 196, 33);
		contentPane.add(lblCadastroDeProdutos);

		JLabel lblProduto = new JLabel("Produto:");
		lblProduto.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblProduto.setBounds(22, 71, 49, 14);
		contentPane.add(lblProduto);

		JLabel lblCdigo = new JLabel("C\u00F3digo:");
		lblCdigo.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblCdigo.setBounds(319, 70, 49, 16);
		contentPane.add(lblCdigo);

		JLabel lblPreo = new JLabel("Pre\u00E7o:");
		lblPreo.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblPreo.setBounds(22, 99, 49, 14);
		contentPane.add(lblPreo);

		JLabel lblDepartamento = new JLabel("Departamento:");
		lblDepartamento.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblDepartamento.setBounds(22, 128, 86, 14);
		contentPane.add(lblDepartamento);

		textProduto = new JTextField();
		textProduto.setBounds(81, 69, 214, 20);
		contentPane.add(textProduto);
		textProduto.setColumns(10);

		textCodigo = new JTextField();
		textCodigo.setColumns(10);
		textCodigo.setBounds(378, 68, 125, 20);
		contentPane.add(textCodigo);

		textPreco = new JTextField();
		textPreco.setColumns(10);
		textPreco.setBounds(81, 96, 214, 20);
		contentPane.add(textPreco);

		comboDepart.setBounds(118, 124, 177, 25);
		contentPane.add(comboDepart);
		comboDepart.addItem("");
		comboDepart.addItem("Terror");
		comboDepart.addItem("RPG");
		comboDepart.addItem("Battle Royale");
		comboDepart.addItem("Luta");
		comboDepart.addItem("Aventura");

		JLabel lblQuantidade = new JLabel("Quantidade:");
		lblQuantidade.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblQuantidade.setBounds(319, 111, 70, 16);
		contentPane.add(lblQuantidade);

		spinnerQtd.setBounds(399, 110, 29, 20);
		contentPane.add(spinnerQtd);

		// Botão Cadastrar
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				a.valores();

				// Atualiza a tabela
				table.setModel(a.selecionar());

				a.limparCampos();

				btnCadastrar.setEnabled(true);
				btnAlterar.setEnabled(false);
				btnExcluir.setEnabled(false);
			}
		});
		btnCadastrar.setBounds(29, 180, 97, 25);
		contentPane.add(btnCadastrar);

		// Botão Alterar
		btnAlterar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				AcaoProd a = new AcaoProd();
				Loja loja = new Loja();

				loja.setProduto(CadastroProd.textProduto.getText());
				loja.setCodigo(CadastroProd.textCodigo.getText());
				loja.setPreco(CadastroProd.textPreco.getText());
				loja.setDepartamento(CadastroProd.comboDepart.getSelectedItem().toString());
				int quant = Integer.parseInt(CadastroProd.spinnerQtd.getValue().toString());

				loja.setQuantidade(quant);

				a.alterar(codigoProd, loja);

				a.limparCampos();

				// Atualizar tabela
				table.setModel(a.selecionar());

				btnCadastrar.setEnabled(true);
				btnAlterar.setEnabled(false);
				btnExcluir.setEnabled(false);

			}
		});
		btnAlterar.setEnabled(false);
		btnAlterar.setBounds(152, 180, 97, 25);
		contentPane.add(btnAlterar);

		// Botão Voltar
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				setVisible(false);

			}
		});
		btnVoltar.setBounds(406, 180, 97, 25);
		contentPane.add(btnVoltar);

		// Botão Excluir
		btnExcluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				a.excluir(codigoProd);

				// Limpa os campos
				a.limparCampos();

				// Atualizar tabela
				table.setModel(a.selecionar());

				btnCadastrar.setEnabled(true);
				btnAlterar.setEnabled(false);
				btnExcluir.setEnabled(false);
			}
		});
		btnExcluir.setEnabled(false);
		btnExcluir.setBounds(282, 180, 97, 25);
		contentPane.add(btnExcluir);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 221, 512, 282);
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
				textProduto.setText(table.getValueAt(indice, 0).toString());
				textCodigo.setText(table.getValueAt(indice, 1).toString());
				textPreco.setText(table.getValueAt(indice, 2).toString());
				table.getValueAt(indice, 3);
				comboDepart.setSelectedItem(table.getValueAt(indice, 4).toString());

				// Botões
				btnCadastrar.setEnabled(false);
				btnAlterar.setEnabled(true);
				btnExcluir.setEnabled(true);
			}
		});
		scrollPane.setColumnHeaderView(table);
		table.setModel(a.selecionar());
		scrollPane.setViewportView(table);

	}
}
