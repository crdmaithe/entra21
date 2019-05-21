package formulario;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import acao.Acao;
import beans.IMC;

import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Formulario extends JFrame {

	private JPanel contentPane;
	public static JTextField txtNome;
	public static JTextField txtIdade;
	public static JTextField txtAltura;
	public static JTextField txtPeso;
	public static JTable table;
	public static double imc;
	public static int idade;
	public static double peso;
	public static double altura;
	
	
	
	// Bot�o Cadastrar
	public static JButton btnCadastrar = new JButton("Cadastrar");
	//Bot�o excluir
	public static JButton btnExcluir = new JButton("Excluir");
	//Bot�o Alterar
	public static JButton btnAlterar = new JButton("Alterar");

	public static int codigoIMC;
	
	private void limparCampos() {
		// Limpar os campos
		txtNome.setText("");
		txtIdade.setText("");
		txtAltura.setText("");
		txtPeso.setText("");
		
		// Focus
		txtNome.requestFocus();

	}

	public Formulario() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 496, 521);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		// Objeto de classe Acao
		Acao a = new Acao();

		JLabel lblNome = new JLabel("Nome:");
		lblNome.setBounds(20, 55, 48, 14);
		contentPane.add(lblNome);

		txtNome = new JTextField();
		txtNome.setBounds(59, 52, 150, 20);
		contentPane.add(txtNome);
		txtNome.setColumns(10);

		JLabel lblIdade = new JLabel("Idade:");
		lblIdade.setBounds(258, 55, 48, 14);
		contentPane.add(lblIdade);

		txtIdade = new JTextField();
		txtIdade.setBounds(299, 52, 118, 20);
		contentPane.add(txtIdade);
		txtIdade.setColumns(10);

		JLabel lblAltura = new JLabel("Altura:");
		lblAltura.setBounds(20, 102, 48, 14);
		contentPane.add(lblAltura);

		txtAltura = new JTextField();
		txtAltura.setBounds(59, 99, 96, 20);
		contentPane.add(txtAltura);
		txtAltura.setColumns(10);

		JLabel lblPeso = new JLabel("Peso");
		lblPeso.setBounds(258, 102, 48, 14);
		contentPane.add(lblPeso);

		txtPeso = new JTextField();
		txtPeso.setBounds(299, 99, 96, 20);
		contentPane.add(txtPeso);
		txtPeso.setColumns(10);

		JLabel lblClculaImc = new JLabel("C\u00E1lculo IMC");
		lblClculaImc.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblClculaImc.setBounds(195, 11, 96, 30);
		contentPane.add(lblClculaImc);

		//Bot�o Cadastrar
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Acao.cadastrar();
				limparCampos();
			}
		});
		btnCadastrar.setBounds(10, 146, 96, 23);
		contentPane.add(btnCadastrar);

		//Bot�o Alterar
		btnAlterar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Acao.alterarS();
				limparCampos();
				
			}
		});
		btnAlterar.setBounds(134, 146, 89, 23);
		contentPane.add(btnAlterar);

		//Bot�o Excluir
		btnExcluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Acao.excluirS(codigoIMC);
				limparCampos();				
			}
		});
		btnExcluir.setBounds(254, 146, 89, 23);
		contentPane.add(btnExcluir);

		JButton btnEstatstica = new JButton("Estat\u00EDstica");
		btnEstatstica.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
			}
		});
		btnEstatstica.setBounds(374, 146, 96, 23);
		contentPane.add(btnEstatstica);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 188, 460, 283);
		contentPane.add(scrollPane);

		table = new JTable();
		scrollPane.setViewportView(table);

		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {

				// Obter o �ndice da tabela
				int indice = table.getSelectedRow();

				// Adicionar o valor do indice no atributo
				codigoIMC = indice;

				// Selecionando dados do curso
				txtNome.setText(table.getValueAt(indice, 0).toString());
				txtIdade.setText(table.getValueAt(indice, 1).toString());
				txtAltura.setText(table.getValueAt(indice, 2).toString());
				txtPeso.setText(table.getValueAt(indice, 3).toString());

				// Bot�es
				btnCadastrar.setEnabled(false);
				btnAlterar.setEnabled(true);
				btnExcluir.setEnabled(true);
				// btnCancelar.setEnabled(true);

			}
		});
		scrollPane.setColumnHeaderView(table);
		table.setModel(a.selecionar());
		scrollPane.setViewportView(table);

	}
}
