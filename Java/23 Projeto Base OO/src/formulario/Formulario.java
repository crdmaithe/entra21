package formulario;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import acao.Acao;
import beans.Curso;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Formulario extends JFrame {
	private JTextField txtNome;
	private JTextField txtArea;
	private JTable table;
	private static int codigoCurso;

	private void limparCampos() {
		// Limpar os campos
		txtNome.setText("");
		txtArea.setText("");

		// Focus
		txtNome.requestFocus();
	}

	public Formulario() {

		JButton btnCancelar = new JButton("Cancelar");
		JButton btnExcluir = new JButton("Excluir");

		// Objeto de classe Acao
		Acao a = new Acao();

		getContentPane().setEnabled(false);
		getContentPane().setLayout(null);

		JLabel lblNome = new JLabel("Nome:");
		lblNome.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNome.setBounds(10, 19, 63, 44);
		getContentPane().add(lblNome);

		JLabel lblArea = new JLabel("\u00C1rea:");
		lblArea.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblArea.setBounds(10, 75, 63, 30);
		getContentPane().add(lblArea);

		txtNome = new JTextField();
		txtNome.setBounds(69, 33, 338, 20);
		getContentPane().add(txtNome);
		txtNome.setColumns(10);

		txtArea = new JTextField();
		txtArea.setBounds(69, 80, 338, 20);
		getContentPane().add(txtArea);
		txtArea.setColumns(10);

		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				// Criar um objeto curso
				Curso c = new Curso();
				c.setNomeCurso(txtNome.getText());
				c.setAreaCurso(txtArea.getText());

				// Efetuar o cadastro
				a.cadastrar(c);

				limparCampos();

				// Atualizar tabela
				table.setModel(a.selecionar());

			}
		});
		btnCadastrar.setBounds(10, 135, 89, 23);
		getContentPane().add(btnCadastrar);

		JButton btnAlterar = new JButton("Alterar");
		btnAlterar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				// Instanciar um objeto da classe Curso
				Curso c = new Curso();
				c.setNomeCurso(txtNome.getText());
				c.setAreaCurso(txtArea.getText());

				// Realiza a alteração
				a.alterar(codigoCurso, c);

				limparCampos();

				// Atualizar listagem de cursos
				table.setModel(a.selecionar());

				// Botões
				btnCadastrar.setEnabled(true);
				btnAlterar.setEnabled(false);
				btnExcluir.setEnabled(false);
				btnCancelar.setEnabled(false);

			}
		});
		btnAlterar.setEnabled(false);
		btnAlterar.setBounds(117, 135, 89, 23);
		getContentPane().add(btnAlterar);

		btnExcluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				// Remover curso
				a.excluir(codigoCurso);

				// Atualizar listagem de cursos
				table.setModel(a.selecionar());

				limparCampos();

				// Botões
				btnCadastrar.setEnabled(true);
				btnAlterar.setEnabled(false);
				btnExcluir.setEnabled(false);
				btnCancelar.setEnabled(false);

			}
		});
		btnExcluir.setEnabled(false);
		btnExcluir.setBounds(226, 135, 89, 23);
		getContentPane().add(btnExcluir);

		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				limparCampos();

				// Botões
				btnCadastrar.setEnabled(true);
				btnAlterar.setEnabled(false);
				btnExcluir.setEnabled(false);
				btnCancelar.setEnabled(false);

			}
		});
		btnCancelar.setEnabled(false);
		btnCancelar.setBounds(335, 135, 89, 23);
		getContentPane().add(btnCancelar);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(417, 172, -398, 149);
		getContentPane().add(scrollPane);

		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(10, 167, 414, 205);
		getContentPane().add(scrollPane_1);

		table = new JTable();
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {

				// Obter o índice da tabela
				int indice = table.getSelectedRow();

				// Adicionar o valor do indice no atributo
				codigoCurso = indice;

				// Selecionando dados do curso
				txtNome.setText(table.getValueAt(indice, 0).toString());
				txtArea.setText(table.getValueAt(indice, 1).toString());

				// Botões
				btnCadastrar.setEnabled(false);
				btnAlterar.setEnabled(true);
				btnExcluir.setEnabled(true);
				btnCancelar.setEnabled(true);

			}
		});
		table.setModel(a.selecionar());
		scrollPane_1.setViewportView(table);

		JLabel lblIndice = new JLabel("");
		lblIndice.setBounds(0, 0, 48, 14);
		getContentPane().add(lblIndice);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 422);
	}
}
