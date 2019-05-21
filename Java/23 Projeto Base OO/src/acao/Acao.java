package acao;

import javax.swing.table.DefaultTableModel;

import beans.Curso;
import dados.Dados;

public class Acao {

	// CRUD - Creat, Read, Update and Delete / Criar, ler, atualizar e excluir

	// Cadastro
	public void cadastrar(Curso c) {
		Dados.arrayCursos.add(c);
	}

	// Seleção
	public DefaultTableModel selecionar() {

		DefaultTableModel modelo = new DefaultTableModel();
		modelo.addColumn("Curso");
		modelo.addColumn("Área");

		for (int indice = 0; indice < Dados.arrayCursos.size(); indice++) {
			modelo.addRow(new Object[] { Dados.arrayCursos.get(indice).getNomeCurso(),
					Dados.arrayCursos.get(indice).getAreaCurso(), });

		}
		return modelo;
	}

	// Alteração / Atualização
	public void alterar(int indice, Curso c) {
		Dados.arrayCursos.set(indice, c);
	}

	// Exclusão
	public void excluir(int indice) {
		Dados.arrayCursos.remove(indice);
	}
}