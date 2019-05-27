package acao;

import javax.swing.SpinnerNumberModel;
import javax.swing.table.DefaultTableModel;

import beans.Loja;
import dados.Dados;
import formularios.CadastroColab;
import formularios.CadastroProd;

public class AcaoProd {
	
	public static int quant;

	// Cadastrar
	public void cadastrar(Loja loja) {
		Dados.arrayProdutos.add(loja);
	}

	// Selecionar
	public DefaultTableModel selecionar() {

		DefaultTableModel produtos = new DefaultTableModel();
		produtos.addColumn("Produto");
		produtos.addColumn("Código");
		produtos.addColumn("Preço");
		produtos.addColumn("Quantidade");
		produtos.addColumn("Departamento");

		for (int indice = 0; indice < Dados.arrayProdutos.size(); indice++) {
			produtos.addRow(new Object[] { Dados.arrayProdutos.get(indice).getProduto(),
					Dados.arrayProdutos.get(indice).getCodigo(), Dados.arrayProdutos.get(indice).getPreco(),
					Dados.arrayProdutos.get(indice).getQuantidade(),
					Dados.arrayProdutos.get(indice).getDepartamento() });

		}
		return produtos;
	}

	// Adiciona os valores na tabela
	public void valores() {

		AcaoProd a = new AcaoProd();
		Loja loja = new Loja();

		loja.setProduto(CadastroProd.textProduto.getText());
		loja.setCodigo(CadastroProd.textCodigo.getText());
		loja.setPreco(CadastroProd.textPreco.getText());
		loja.setDepartamento(CadastroProd.comboDepart.getSelectedItem().toString());
		quant = Integer.parseInt(CadastroProd.spinnerQtd.getValue().toString());

		loja.setQuantidade(quant);

		// Cadastra o usuário
		cadastrar(loja);

	}

	public void limparCampos() {
		// Limpar os campos
		CadastroProd.textProduto.setText("");
		CadastroProd.textCodigo.setText("");
		CadastroProd.textPreco.setText("");

		// Focus
		CadastroProd.textProduto.requestFocus();

	}
	
	// Exclusão
		public void excluir(int indice) {
			Dados.arrayProdutos.remove(indice);
		}

	// Alteração / Atualização
	public void alterar(int indice, Loja loja) {
		Dados.arrayProdutos.set(indice, loja);
	}

}
