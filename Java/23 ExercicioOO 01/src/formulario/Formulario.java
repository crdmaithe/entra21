package formulario;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import acao.Acao;
import beans.Jogos;
import dados.Dados;

import java.awt.Font;
import java.awt.Color;
import java.awt.Cursor;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JToolBar;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;
import java.awt.BorderLayout;

public class Formulario extends JFrame {
	private JTextField textNome;
	private JTextField textValor;
	private JTable table_1;
	private static int codigoJogo;
	private JComboBox comboGenero = new JComboBox();
	private JComboBox comboClass = new JComboBox();
	private JComboBox comboPlatf = new JComboBox();
	private int indice;

	private void limparCampos() {
		// Limpar os campos
		textNome.setText("");
		textValor.setText("");
		comboGenero.setSelectedIndex(0);
		comboClass.setSelectedIndex(0);
		comboPlatf.setSelectedIndex(0);

		// Focus
		textNome.requestFocus();

	}

	private void duplicidade() {
		for (int indice = 0; indice < Dados.arrayJogos.size(); indice++) {
			if (textNome.getText().equals(Dados.arrayJogos.get(indice).getNomeJogo())
					&& comboPlatf.getSelectedItem().toString().equals(Dados.arrayJogos.get(indice).getPlataforma())) {
				JOptionPane.showMessageDialog(null, "Este jogo j� existe");
			}
		}
	}

	public Formulario() {
		setSize(655, 611);
		getContentPane().setEnabled(false);
		getContentPane().setLayout(null);

		// Bot�o Cadastrar
		JButton btnCadastrar = new JButton("Cadastrar");

		// Bot�o Alterar
		JButton btnAlterar = new JButton("Alterar");

		// Bot�o Excluir
		JButton btnExcluir = new JButton("Excluir");

		// Bot�o Cancelar
		JButton btnCancelar = new JButton("Cancelar");

		// Objeto de classe Acao
		Acao a = new Acao();

		// Bot�es
		btnCadastrar.setEnabled(true);
		btnAlterar.setEnabled(false);
		btnExcluir.setEnabled(false);
		btnCancelar.setEnabled(false);

		// JLabels utilizados
		JLabel lblCadastroDeJogos = new JLabel("Cadastro de Jogos");
		lblCadastroDeJogos.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 23));
		lblCadastroDeJogos.setBounds(227, 21, 181, 38);
		getContentPane().add(lblCadastroDeJogos);

		JLabel lblNomeDoJogo = new JLabel("Nome:");
		lblNomeDoJogo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNomeDoJogo.setBounds(10, 93, 55, 14);
		getContentPane().add(lblNomeDoJogo);

		JLabel lblGnero = new JLabel("G\u00EAnero:");
		lblGnero.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblGnero.setBounds(360, 93, 55, 14);
		getContentPane().add(lblGnero);

		JLabel lblClassificaoIndicativa = new JLabel("Classifica\u00E7\u00E3o indicativa:");
		lblClassificaoIndicativa.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblClassificaoIndicativa.setBounds(10, 189, 140, 14);
		getContentPane().add(lblClassificaoIndicativa);

		JLabel lblPlataforma = new JLabel("Plataforma:");
		lblPlataforma.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblPlataforma.setBounds(10, 138, 75, 20);
		getContentPane().add(lblPlataforma);

		JLabel lblValor = new JLabel("Valor:");
		lblValor.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblValor.setBounds(360, 138, 48, 20);
		getContentPane().add(lblValor);

		// Campo de texto
		textNome = new JTextField();
		textNome.setBounds(59, 92, 214, 20);
		getContentPane().add(textNome);
		textNome.setColumns(10);

		// Combo do G�nero
		comboGenero.setBounds(418, 91, 135, 22);
		getContentPane().add(comboGenero);
		comboGenero.addItem("");
		comboGenero.addItem("Terror");
		comboGenero.addItem("RPG");
		comboGenero.addItem("Corrida");

		// Combo da Classifica��o
		comboClass.setBounds(160, 188, 135, 20);
		getContentPane().add(comboClass);
		comboClass.addItem("");
		comboClass.addItem("at� 12 anos");
		comboClass.addItem("12 � 14 anos");
		comboClass.addItem("14 � 17 anos");
		comboClass.addItem("acima de 18 anos");

		// Combo da Plataforma
		comboPlatf.setBounds(88, 139, 140, 22);
		getContentPane().add(comboPlatf);
		comboPlatf.addItem("");
		comboPlatf.addItem("PlayStation");
		comboPlatf.addItem("XBox");
		comboPlatf.addItem("Computador");
		comboPlatf.addItem("Switch");

		// Txt do valor
		textValor = new JTextField();
		textValor.setBounds(401, 140, 121, 20);
		getContentPane().add(textValor);
		textValor.setColumns(10);

		// Lista de jogos cadastrados
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 251, 619, 310);
		getContentPane().add(scrollPane);

		table_1 = new JTable();

		table_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {

				// Obter o �ndice da tabela
				indice = table_1.getSelectedRow();

				// Adicionar o valor do indice no atributo
				codigoJogo = indice;

				// Selecionando dados do curso
				textNome.setText(table_1.getValueAt(indice, 0).toString());
				comboGenero.setSelectedItem(table_1.getValueAt(indice, 1).toString());
				comboPlatf.setSelectedItem(table_1.getValueAt(indice, 2).toString());
				comboClass.setSelectedItem(table_1.getValueAt(indice, 3).toString());
				;
				textValor.setText(table_1.getValueAt(indice, 4).toString());

				// Bot�es
				btnCadastrar.setEnabled(false);
				btnAlterar.setEnabled(true);
				btnExcluir.setEnabled(true);
				btnCancelar.setEnabled(true);

			}
		});
		scrollPane.setColumnHeaderView(table_1);
		table_1.setModel(a.selecionar());
		scrollPane.setViewportView(table_1);

		// Bot�o cadastrar
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				duplicidade();

				// Criar um objeto Jogos
				Jogos j = new Jogos();
				j.setNomeJogo(textNome.getText());
				j.setValorJogo(textValor.getText());
				j.setGenero(comboGenero.getSelectedItem().toString());
				j.setClassif(comboClass.getSelectedItem().toString());
				j.setPlataforma(comboPlatf.getSelectedItem().toString());

				// Efetuar o cadastro
				a.cadastrar(j);

				limparCampos();

				// Atualizar tabela
				table_1.setModel(a.selecionar());

				btnCadastrar.setEnabled(true);
				btnAlterar.setEnabled(false);
				btnExcluir.setEnabled(false);

			}
		});
		btnCadastrar.setBounds(20, 217, 97, 23);
		getContentPane().add(btnCadastrar);

		// Bot�o alterar
		btnAlterar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				duplicidade();

				// Pega as informa��es que estavam na lista
				Jogos j = new Jogos();
				j.setNomeJogo(textNome.getText());
				j.setValorJogo(textValor.getText());
				j.setClassif(comboClass.getSelectedItem().toString());
				j.setPlataforma(comboPlatf.getSelectedItem().toString());
				;
				j.setGenero(comboGenero.getSelectedItem().toString());

				// Realiza a altera��o
				a.alterar(codigoJogo, j);

				limparCampos();

				// Atualizar tabela
				table_1.setModel(a.selecionar());

				btnCadastrar.setEnabled(true);
				btnAlterar.setEnabled(false);
				btnExcluir.setEnabled(false);
			}
		});
		btnAlterar.setBounds(184, 217, 89, 23);
		getContentPane().add(btnAlterar);

		// Bot�o Excluir
		btnExcluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				// Remove o jogo
				a.excluir(codigoJogo);

				// Limpa os campos
				limparCampos();

				// Atualizar tabela
				table_1.setModel(a.selecionar());

				btnCadastrar.setEnabled(true);
				btnAlterar.setEnabled(false);
				btnExcluir.setEnabled(false);
				btnCancelar.setEnabled(false);

			}
		});
		btnExcluir.setBounds(348, 217, 89, 23);
		getContentPane().add(btnExcluir);

		// Bot�o Cancelar
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				limparCampos();

				// Bot�es
				btnCadastrar.setEnabled(true);
				btnAlterar.setEnabled(false);
				btnExcluir.setEnabled(false);
				btnCancelar.setEnabled(false);

			}
		});
		btnCancelar.setBounds(528, 217, 89, 23);
		getContentPane().add(btnCancelar);

	}
}
