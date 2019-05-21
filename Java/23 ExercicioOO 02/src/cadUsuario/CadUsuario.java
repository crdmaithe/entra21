package cadUsuario;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class CadUsuario extends JFrame {
	private JTextField txtNome;
	private JTextField txtConfirma;
	private JTextField txtSenha;
	private JTextField txtData;
	private JTable table;

	public CadUsuario() {
		getContentPane().setLayout(null);

		JFrame cadastUsuario = new JFrame();

		JLabel lblCadastroDoUsurio = new JLabel("Cadastro do Usu\u00E1rio");
		lblCadastroDoUsurio.setFont(new Font("Trebuchet MS", Font.PLAIN, 17));
		lblCadastroDoUsurio.setBounds(187, 39, 160, 31);
		getContentPane().add(lblCadastroDoUsurio);

		JLabel lblNomeCompleto = new JLabel("Nome usu\u00E1rio:");
		lblNomeCompleto.setBounds(10, 94, 80, 14);
		getContentPane().add(lblNomeCompleto);

		txtNome = new JTextField();
		txtNome.setBounds(82, 91, 174, 20);
		getContentPane().add(txtNome);
		txtNome.setColumns(10);

		txtConfirma = new JTextField();
		txtConfirma.setBounds(126, 176, 168, 20);
		getContentPane().add(txtConfirma);
		txtConfirma.setColumns(10);

		JLabel lblSenha = new JLabel("Senha:");
		lblSenha.setBounds(10, 138, 48, 14);
		getContentPane().add(lblSenha);

		JLabel lblConfirmaoDeSenha = new JLabel("Confirma\u00E7\u00E3o de senha:");
		lblConfirmaoDeSenha.setBounds(10, 179, 115, 14);
		getContentPane().add(lblConfirmaoDeSenha);

		txtSenha = new JTextField();
		txtSenha.setColumns(10);
		txtSenha.setBounds(52, 135, 168, 20);
		getContentPane().add(txtSenha);

		JComboBox comboTipo = new JComboBox();
		comboTipo.setBounds(373, 91, 142, 21);
		getContentPane().add(comboTipo);
		comboTipo.addItem("");
		comboTipo.addItem("Administrador");
		comboTipo.addItem("Usuário");

		JLabel lblTipoDoUsurio = new JLabel("Tipo do usu\u00E1rio:");
		lblTipoDoUsurio.setBounds(276, 94, 89, 14);
		getContentPane().add(lblTipoDoUsurio);

		JLabel lblDataCadastro = new JLabel("Data cadastro:");
		lblDataCadastro.setBounds(258, 138, 72, 14);
		getContentPane().add(lblDataCadastro);

		txtData = new JTextField();
		txtData.setBounds(338, 135, 96, 20);
		getContentPane().add(txtData);
		txtData.setColumns(10);

		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.setBounds(28, 232, 89, 23);
		getContentPane().add(btnCadastrar);

		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.setBounds(158, 232, 89, 23);
		getContentPane().add(btnExcluir);

		JButton btnAlterar = new JButton("Alterar");
		btnAlterar.setBounds(289, 232, 89, 23);
		getContentPane().add(btnAlterar);

		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(415, 232, 89, 23);
		getContentPane().add(btnCancelar);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 269, 518, 228);
		getContentPane().add(scrollPane);

		table = new JTable();
		scrollPane.setViewportView(table);

	}
}
