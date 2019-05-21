package formularios;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import acao.Acao;
import beans.Salario;

import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import javax.swing.JSpinner;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.Action;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JButton;
import java.awt.event.ActionListener;

public class Formulario extends JFrame {
	private JTextField txtColab;
	private JTextField txtBruto;
	private JTextField txtTransp;
	private JTextField txtLiquido;
	private JTable table;
	private JTextField txtImposto;
	private static int codigoSalario;
	JComboBox comboCargo = new JComboBox();

	public void salarios() {
		if (comboCargo.getSelectedItem().toString().equals("Estagiario")) {
			String salarEst = "900";
			salarEst = txtBruto.toString();
		}
	}

	public Formulario() {

		// Objeto de classe Acao
		Acao a = new Acao();

		getContentPane().setLayout(null);

		JLabel lblColaborador = new JLabel("Colaborador");
		lblColaborador.setBounds(10, 45, 74, 14);
		getContentPane().add(lblColaborador);

		txtColab = new JTextField();
		txtColab.setBounds(82, 42, 251, 20);
		getContentPane().add(txtColab);
		txtColab.setColumns(10);

		JLabel lblCargo = new JLabel("Cargo:");
		lblCargo.setBounds(369, 45, 40, 14);
		getContentPane().add(lblCargo);

		comboCargo.setBounds(412, 41, 217, 20);
		getContentPane().add(comboCargo);
		comboCargo.addItem("");
		comboCargo.addItem("Estagi�rio");
		comboCargo.addItem("Desenvolvedor Jr");
		comboCargo.addItem("Desenvolvedor Pleno");
		comboCargo.addItem("Desenvolvedor S�nior");
		comboCargo.addItem("Analista de sistemas Jr");
		comboCargo.addItem("Analista de sistemas Pleno");
		comboCargo.addItem("Analista de sistemas S�nior");
		comboCargo.addItem("Arquiteto de Software");

		JLabel lblSalrioBruto = new JLabel("Sal\u00E1rio Bruto:");
		lblSalrioBruto.setBounds(10, 84, 83, 14);
		getContentPane().add(lblSalrioBruto);

		txtBruto = new JTextField();
		txtBruto.setEditable(false);
		txtBruto.setBounds(103, 82, 183, 17);
		getContentPane().add(txtBruto);
		txtBruto.setColumns(10);

		salarios();

		JCheckBox chckbxFidelidade = new JCheckBox("Clube fidelidade");
		chckbxFidelidade.setBounds(349, 80, 134, 23);
		getContentPane().add(chckbxFidelidade);

		JCheckBox chckbxSaude = new JCheckBox("Plano de sa\u00FAde");
		chckbxSaude.setBounds(497, 80, 132, 23);
		getContentPane().add(chckbxSaude);

		JSpinner spinnerFaltas = new JSpinner();
		spinnerFaltas.setBounds(111, 161, 99, 20);
		getContentPane().add(spinnerFaltas);

		JLabel lblFaltasNoMs = new JLabel("Faltas no m\u00EAs");
		lblFaltasNoMs.setBounds(15, 164, 86, 14);
		getContentPane().add(lblFaltasNoMs);

		JCheckBox chckbxValeTransporte = new JCheckBox("Vale transporte");
		chckbxValeTransporte.setBounds(10, 126, 116, 23);
		getContentPane().add(chckbxValeTransporte);

		txtTransp = new JTextField();
		txtTransp.setBounds(132, 127, 96, 20);
		getContentPane().add(txtTransp);
		txtTransp.setColumns(10);

		JLabel lblImpostoDeRenda = new JLabel("Imposto de renda");
		lblImpostoDeRenda.setBounds(361, 130, 102, 14);
		getContentPane().add(lblImpostoDeRenda);

		JLabel lblSalrioLquido = new JLabel("Sal\u00E1rio L\u00EDquido");
		lblSalrioLquido.setBounds(369, 164, 85, 14);
		getContentPane().add(lblSalrioLquido);

		txtLiquido = new JTextField();
		txtLiquido.setEnabled(false);
		txtLiquido.setBounds(483, 161, 105, 20);
		getContentPane().add(txtLiquido);
		txtLiquido.setColumns(10);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 252, 630, 267);
		getContentPane().add(scrollPane);

		table = new JTable();
		scrollPane.setViewportView(table);
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {

				// Obter o �ndice da tabela
				int indice = table.getSelectedRow();

				// Adicionar o valor do indice no atributo
				codigoSalario = indice;

				// Selecionando dados do curso
				txtColab.setText(table.getValueAt(indice, 0).toString());
				txtBruto.setText(table.getValueAt(indice, 1).toString());

			}
		});
		table.setModel(a.selecionar());

		JButton btnNewButton = new JButton("Cadastrar colaborador");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				// Criar um objeto curso
				Salario s = new Salario();
				s.setColaborador(txtColab.getText());
				s.setSalarioL(txtLiquido.getText());

				// Efetuar o cadastro
				a.cadastrar(s);

				// limparCampos();

				// Atualizar tabela
				table.setModel(a.selecionar());

			}
		});
		btnNewButton.setBounds(85, 203, 169, 38);
		getContentPane().add(btnNewButton);

		JButton btnEstatsticas = new JButton("Estat\u00EDsticas");
		btnEstatsticas.setBounds(399, 203, 147, 38);
		getContentPane().add(btnEstatsticas);

		txtImposto = new JTextField();
		txtImposto.setEnabled(false);
		txtImposto.setBounds(473, 127, 134, 20);
		getContentPane().add(txtImposto);
		txtImposto.setColumns(10);

	}

}
