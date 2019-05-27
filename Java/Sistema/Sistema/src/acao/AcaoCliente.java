package acao;

import javax.swing.table.DefaultTableModel;

import dados.Dados;
import formularios.CadastroProd;

public class AcaoCliente {

	public static double total;

	// Selecionar
	public DefaultTableModel selecionar() {

		DefaultTableModel produtos = new DefaultTableModel();
		produtos.addColumn("Produto");
		produtos.addColumn("Quantidade");
		produtos.addColumn("Preço");

		for (int indice = 0; indice < Dados.arrayProdutos.size(); indice++) {
			produtos.addRow(new Object[] { Dados.arrayProdutos.get(indice).getProduto(),
					Dados.arrayProdutos.get(indice).getQuantidade(), Dados.arrayProdutos.get(indice).getPreco() });

		}
		return produtos;
	}

	// Total
	public static void total() {
		total = (((Integer.parseInt(Dados.arrayCarrinho.get(CadastroProd.indice).getPreco()) * (AcaoProd.quant)) + 15));
	}
}
