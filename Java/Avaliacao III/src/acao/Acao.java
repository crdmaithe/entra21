package acao;

import javax.swing.table.DefaultTableModel;

import beans.Salario;
import dados.Dados;

public class Acao {

	// CRUD - Creat, Read, Update and Delete / Criar, ler, atualizar e excluir

	// Cadastro
	public void cadastrar(Salario s) {
		Dados.arraySalario.add(s);
	}

	// Seleção
	public DefaultTableModel selecionar() {

		DefaultTableModel modelo = new DefaultTableModel();
		modelo.addColumn("Colaborador");
		modelo.addColumn("Salário Líquido");

		for (int indice = 0; indice < Dados.arraySalario.size(); indice++) {
			modelo.addRow(new Object[] { Dados.arraySalario.get(indice).getColaborador(),
					Dados.arraySalario.get(indice).getSalarioL() });

		}
		return modelo;
	}

}
