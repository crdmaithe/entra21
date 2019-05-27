package formularios;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import acao.AcaoColab;
import beans.Loja;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CadastroColab extends JFrame {

	private JPanel contentPane;
	public static JTextField textNome;
	public static JTextField textEmail;
	public static JTextField textTelef;
	private int indice;
	private static int codigoColab;
	private JTable table;

	public CadastroColab() {

		AcaoColab a = new AcaoColab();
		Loja loja = new Loja();

		JButton btnCadastrar = new JButton("Cadastrar");
		JButton btnAlterar = new JButton("Alterar");
		JButton btnExcluir = new JButton("Excluir");
		
		btnCadastrar.setEnabled(true);
		btnAlterar.setEnabled(false);
		btnExcluir.setEnabled(false);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 548, 542);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblCadastroDeColaboradores = new JLabel("Cadastro de colaboradores");
		lblCadastroDeColaboradores.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblCadastroDeColaboradores.setBounds(142, 22, 243, 37);
		contentPane.add(lblCadastroDeColaboradores);

		JLabel lblNome = new JLabel("Nome:");
		lblNome.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNome.setBounds(21, 77, 48, 14);
		contentPane.add(lblNome);

		JLabel lblEmail = new JLabel("E-mail:");
		lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblEmail.setBounds(21, 102, 48, 14);
		contentPane.add(lblEmail);

		JLabel lblTelefone = new JLabel("Telefone:");
		lblTelefone.setBounds(21, 127, 48, 14);
		contentPane.add(lblTelefone);

		// Botão Cadastrar
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				// Adiciona os valores na tabela
				a.valores();

				// Atualiza a tabela
				table.setModel(a.selecionar());

				// Limpa os campos de texto
				a.limparCampos();

				btnCadastrar.setEnabled(true);
				btnAlterar.setEnabled(false);
				btnExcluir.setEnabled(false);

			}
		});
		btnCadastrar.setBounds(413, 33, 94, 23);
		contentPane.add(btnCadastrar);

		// Botão Alterar
		btnAlterar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				loja.setNome(CadastroColab.textNome.getText());
				loja.setEmail(CadastroColab.textEmail.getText());
				loja.setTelefone(CadastroColab.textTelef.getText());

				a.alterar(codigoColab, loja);

				a.limparCampos();

				// Atualizar tabela
				table.setModel(a.selecionar());

				btnCadastrar.setEnabled(true);
				btnAlterar.setEnabled(false);
				btnExcluir.setEnabled(false);

			}
		});
		btnAlterar.setBounds(413, 67, 94, 23);
		contentPane.add(btnAlterar);

		// Botão Excluir
		btnExcluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				a.excluir(codigoColab);

				// Limpa os campos
				a.limparCampos();

				// Atualizar tabela
				table.setModel(a.selecionar());

				btnCadastrar.setEnabled(true);
				btnAlterar.setEnabled(false);
				btnExcluir.setEnabled(false);

			}
		});
		btnExcluir.setBounds(413, 102, 94, 23);
		contentPane.add(btnExcluir);

		textNome = new JTextField();
		textNome.setBounds(79, 75, 309, 20);
		contentPane.add(textNome);
		textNome.setColumns(10);

		textEmail = new JTextField();
		textEmail.setColumns(10);
		textEmail.setBounds(79, 100, 309, 20);
		contentPane.add(textEmail);

		textTelef = new JTextField();
		textTelef.setColumns(10);
		textTelef.setBounds(79, 124, 309, 20);
		contentPane.add(textTelef);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 177, 512, 315);
		contentPane.add(scrollPane);

		table = new JTable();

		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {

				// Obter o índice da tabela
				indice = table.getSelectedRow();

				// Adicionar o valor do indice no atributo
				codigoColab = indice;

				// Selecionando dados do curso
				textNome.setText(table.getValueAt(indice, 0).toString());
				textEmail.setText(table.getValueAt(indice, 1).toString());
				textTelef.setText(table.getValueAt(indice, 2).toString());

				// Botões
				btnCadastrar.setEnabled(false);
				btnAlterar.setEnabled(true);
				btnExcluir.setEnabled(true);

			}
		});
		scrollPane.setColumnHeaderView(table);
		table.setModel(a.selecionar());

		scrollPane.setViewportView(table);
		
		JButton btnNewButton = new JButton("Voltar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				setVisible(false);
			}
		});
		btnNewButton.setBounds(413, 135, 94, 23);
		contentPane.add(btnNewButton);

	}
}
