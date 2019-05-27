package formularios;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import acao.AcaoCliente;
import acao.AcaoProd;
import beans.Loja;
import dados.Dados;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JScrollPane;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTable;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Carrinho extends JFrame {

	private JPanel contentPane;
	private JTable table;

	AcaoCliente acaoCliente = new AcaoCliente();

	public Carrinho() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 642, 426);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblCarrinhoDeCompras = new JLabel("Carrinho de compras");
		lblCarrinhoDeCompras.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblCarrinhoDeCompras.setBounds(206, 11, 192, 38);
		contentPane.add(lblCarrinhoDeCompras);

		JLabel lblFrete = new JLabel("Frete Fixo: ");
		lblFrete.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblFrete.setBounds(370, 267, 77, 16);
		contentPane.add(lblFrete);

		JLabel lblTotal = new JLabel("Total:");
		lblTotal.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblTotal.setBounds(370, 294, 46, 14);
		contentPane.add(lblTotal);

		JLabel lblPrecoFrete = new JLabel("R$ 15,00");
		lblPrecoFrete.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblPrecoFrete.setBounds(549, 269, 67, 14);
		contentPane.add(lblPrecoFrete);

		JLabel lblCompraTotal = new JLabel("");
		lblCompraTotal.setBounds(549, 295, 46, 14);
		contentPane.add(lblCompraTotal);
		lblCompraTotal.setText(String.valueOf(acaoCliente.total));

		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(12, 60, 604, 177);
		contentPane.add(scrollPane_1);

		table = new JTable();

		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {

				// Obter o índice da tabela
				CadastroProd.indice = table.getSelectedRow();

				// Adicionar o valor do indice no atributo
				CadastroProd.codigoProd = CadastroProd.indice;

				// Selecionando dados do curso
				CadastroProd.textProduto.setText(table.getValueAt(CadastroProd.indice, 0).toString());
				table.getValueAt(CadastroProd.indice, 1);
				CadastroProd.textPreco.setText(table.getValueAt(CadastroProd.indice, 2).toString());

			}
		});

		AcaoCliente a = new AcaoCliente();
		scrollPane_1.setColumnHeaderView(table);
		table.setModel(a.selecionar());
		scrollPane_1.setViewportView(table);
		
		JButton btnFinalizarACompra = new JButton("Finalizar a compra");
		btnFinalizarACompra.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JOptionPane.showMessageDialog(null, ""+acaoCliente.total);
			}
		});
		btnFinalizarACompra.setBounds(387, 342, 145, 34);
		contentPane.add(btnFinalizarACompra);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				setVisible(false);
				
			}
		});
		btnVoltar.setBounds(107, 342, 145, 34);
		contentPane.add(btnVoltar);

	}
}
