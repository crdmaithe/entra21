package acao;

import javax.swing.table.DefaultTableModel;
import beans.Loja;
import dados.Dados;
import formularios.CadastroColab;

public class AcaoColab {

	// Cadastrar
	public void cadastrar(Loja loja) {
		Dados.arrayColab.add(loja);
	}

	// Selecionar
	public DefaultTableModel selecionar() {

		DefaultTableModel colaborador = new DefaultTableModel();
		colaborador.addColumn("Nome");
		colaborador.addColumn("E-mail");
		colaborador.addColumn("Telefone");

		for (int indice = 0; indice < Dados.arrayColab.size(); indice++) {
			colaborador.addRow(new Object[] { Dados.arrayColab.get(indice).getNome(),
					Dados.arrayColab.get(indice).getEmail(), Dados.arrayColab.get(indice).getTelefone() });

		}
		return colaborador;
	}

	// Alteração / Atualização
	public void alterar(int indice, Loja loja) {
		Dados.arrayColab.set(indice, loja);
	}

	// Exclusão
	public void excluir(int indice) {
		Dados.arrayColab.remove(indice);
	}

	// Adiciona os valores na tabela
	public void valores() {

		AcaoColab a = new AcaoColab();
		Loja loja = new Loja();

		loja.setNome(CadastroColab.textNome.getText());
		loja.setEmail(CadastroColab.textEmail.getText());
		loja.setTelefone(CadastroColab.textTelef.getText());

		// Cadastra o usuário
		a.cadastrar(loja);

	}

	//Reset os campos
	public void limparCampos() {
		// Limpar os campos
		CadastroColab.textNome.setText("");
		CadastroColab.textEmail.setText("");
		CadastroColab.textTelef.setText("");

		// Focus
		CadastroColab.textNome.requestFocus();

	}

}
