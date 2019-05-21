package acao;

import javax.swing.table.DefaultTableModel;

import beans.Jogos;
import dados.Dados;

public class Acao {

	// Cadastro
	public void cadastrar(Jogos j) {
		Dados.arrayJogos.add(j);
	}

	// Seleção
	public DefaultTableModel selecionar() {

		DefaultTableModel modelo = new DefaultTableModel();
		modelo.addColumn("Nome");
		modelo.addColumn("Gênero");
		modelo.addColumn("Plataforma");
		modelo.addColumn("Classificação");
		modelo.addColumn("Valor");

		for (int indice = 0; indice < Dados.arrayJogos.size(); indice++) {
			modelo.addRow(new Object[] { Dados.arrayJogos.get(indice).getNomeJogo(),
					Dados.arrayJogos.get(indice).getGenero(), Dados.arrayJogos.get(indice).getPlataforma(),
					Dados.arrayJogos.get(indice).getClassif(), Dados.arrayJogos.get(indice).getValorJogo() });

		}
		return modelo;
	}

	// Alteração / Atualização
	public void alterar(int indice, Jogos j) {
		Dados.arrayJogos.set(indice, j);
	}

	// Exclusão
	public void excluir(int indice) {
		Dados.arrayJogos.remove(indice);
	}

}
