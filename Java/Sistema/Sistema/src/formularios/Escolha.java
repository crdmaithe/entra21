package formularios;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSpinner;
import javax.swing.JLabel;
import java.awt.Font;

public class Escolha extends JFrame {

	private JPanel contentPane;

	public Escolha() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 356, 242);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JButton btnCliente = new JButton("Cliente");
		btnCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Cliente c = new Cliente();
				c.setVisible(true);
				c.setLocationRelativeTo(null);

			}
		});
		btnCliente.setBounds(10, 72, 139, 62);
		contentPane.add(btnCliente);

		JButton btnAdministrador = new JButton("Administrador");
		btnAdministrador.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Adm adm = new Adm();
				adm.setVisible(true);
				adm.setLocationRelativeTo(null);
			}
		});
		btnAdministrador.setBounds(187, 72, 143, 62);
		contentPane.add(btnAdministrador);
		
		JLabel lblLojaDeJogos = new JLabel("Loja de Jogos");
		lblLojaDeJogos.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblLojaDeJogos.setBounds(109, 11, 122, 38);
		contentPane.add(lblLojaDeJogos);
	}
}
