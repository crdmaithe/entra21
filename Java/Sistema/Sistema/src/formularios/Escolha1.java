package formularios;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Escolha1 extends JFrame {

	private JPanel contentPane;

	public Escolha1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 438, 340);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnCadastroDeColaboradores = new JButton("Cadastro de Colaboradores");
		btnCadastroDeColaboradores.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				CadastroColab cadastroColab = new CadastroColab();
				cadastroColab.setVisible(true);
				cadastroColab.setLocationRelativeTo(null);
			}
		});
		btnCadastroDeColaboradores.setBounds(191, 173, 200, 92);
		contentPane.add(btnCadastroDeColaboradores);
		
		JButton btnCadastroDeProdutos = new JButton("Cadastro de Produtos");
		btnCadastroDeProdutos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				CadastroProd cadastroProd = new CadastroProd();
				cadastroProd.setVisible(true);
				cadastroProd.setLocationRelativeTo(null);
			}
		});
		btnCadastroDeProdutos.setBounds(29, 35, 200, 92);
		contentPane.add(btnCadastroDeProdutos);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				setVisible(false);
				
			}
		});
		btnVoltar.setBounds(29, 205, 97, 29);
		contentPane.add(btnVoltar);
		
		JButton btnEstoque = new JButton("Estoque");
		btnEstoque.setBounds(294, 67, 97, 29);
		contentPane.add(btnEstoque);
	}

}
