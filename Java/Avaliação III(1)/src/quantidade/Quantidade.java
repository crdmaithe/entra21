package quantidade;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import acao.Acao;
import formulario.Formulario;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Quantidade extends JFrame {

	private JPanel contentPane;
	private JTable table;

	public Quantidade() {
		
		Acao a = new Acao();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 386, 517);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 56, 350, 411);
		contentPane.add(scrollPane);

		table = new JTable();
		scrollPane.setViewportView(table);
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {

				// Obter o �ndice da tabela
				int indice = table.getSelectedRow();

				// Adicionar o valor do indice no atributo
				Formulario.codigoCarrinho = indice;


			}
		});
		table.setModel(a.selecionar());

		JLabel lblCompras = new JLabel("Compras");
		lblCompras.setFont(new Font("Swis721 LtEx BT", Font.PLAIN, 18));
		lblCompras.setBounds(140, 11, 94, 34);
		contentPane.add(lblCompras);
		
	}

}
