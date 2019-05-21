package exemplo05;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Principal {

	public static void main(String[] args) {

		// criar um formulário
		JFrame formulario = new JFrame();
		formulario.setSize(500, 300);
		formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		formulario.setTitle("Meu terceiro formulário");
		formulario.setLocationRelativeTo(null);
		formulario.setLayout(null);

		// Botãoes
		JButton btn01 = new JButton("Botão 01");
		btn01.setBounds(10, 10, 150, 30);
		JButton btn02 = new JButton("Botão 02");
		btn02.setBounds(190, 10, 150, 30);

		// Painéis
		JPanel painel01 = new JPanel();
		painel01.setBounds(10, 50, 330, 150);
		painel01.setBackground(Color.YELLOW);

		JPanel painel02 = new JPanel();
		painel02.setBounds(10, 50, 330, 150);
		painel02.setBackground(Color.BLUE);

		// Adicionar elementos ao painel02
		JButton botao = new JButton("Clique aqui");
		botao.setSize(150, 30);
		painel02.add(botao);

		// Ações nos botões
		btn01.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				painel01.setVisible(false);
				painel02.setVisible(true);

			}
		});

		btn02.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				painel01.setVisible(true);
				painel02.setVisible(false);

			}
		});

		// adicionar elementos ao formulário
		formulario.add(btn01);
		formulario.add(btn02);
		formulario.add(painel01);
		formulario.add(painel02);

		// Exibir formulario e os componentes
		formulario.setVisible(true);

	}

}
