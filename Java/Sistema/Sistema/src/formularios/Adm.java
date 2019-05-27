package formularios;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import beans.Loja;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Adm extends JFrame {

	private JPanel contentPane;
	private JTextField textConta;
	private JTextField textSenha;

	public Adm() {

		Loja loja = new Loja();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblConta = new JLabel("Conta:");
		lblConta.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblConta.setBounds(60, 99, 48, 14);
		contentPane.add(lblConta);

		JLabel lblSenha = new JLabel("Senha:");
		lblSenha.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblSenha.setBounds(60, 129, 48, 17);
		contentPane.add(lblSenha);

		textConta = new JTextField();
		textConta.setBounds(118, 98, 225, 20);
		contentPane.add(textConta);
		textConta.setColumns(10);

		textSenha = new JTextField();
		textSenha.setBounds(118, 129, 226, 20);
		contentPane.add(textSenha);
		textSenha.setColumns(10);

		JLabel lblAcessoAoSistema = new JLabel("Acesso ao sistema");
		lblAcessoAoSistema.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblAcessoAoSistema.setBounds(141, 37, 144, 35);
		contentPane.add(lblAcessoAoSistema);

		JButton btnEnter = new JButton("Entrar");
		btnEnter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (textConta.getText().equals(loja.loginA) && textSenha.getText().equals(loja.senhaA)) {

					Escolha1 esc1 = new Escolha1();
					esc1.setVisible(true);
					esc1.setLocationRelativeTo(null);
				} else {
					JOptionPane.showMessageDialog(null, "Acesso negado!");
				}

			}
		});
		btnEnter.setBounds(60, 172, 112, 35);
		contentPane.add(btnEnter);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				setVisible(false);
				
			}
		});
		btnVoltar.setBounds(231, 172, 112, 35);
		contentPane.add(btnVoltar);
	}
}
