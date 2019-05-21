package Exercicio20;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {

		// estados
		String estado = "\n1- Santa Catarina";
		estado += "\n2- São Paulo";
		estado += "\n3- Rio de Janeiro";

		// cidades
		String sc = "\n1- Blumenau";
		sc += "\n2- Florianópolis";
		sc += "\n3- Joinville";

		String sp1 = "\n1- São Paulo";
		sp1 += "\n2- Guarulhos";
		sp1 += "\n3- Campinas";

		String rj1 = "\n1 - Rio de Janeiro";
		rj1 += "\n2- São Gonçalo";
		rj1 += "\n3- Duque de Caxias";

		// Curiosidades sobre as cidades
		String bnu = "\nCuriosidade sobre a cidade: possui o único cemitério de gatos do mundo.";
		String flp = "\nCuriosidade sobre a cidade: já foi considerada, várias vezes, uma das melhores cidades para morar no Brasil.";
		String jnv = "\nCuriosidade sobre a cidade: é considerada a capital brasileira da Dança.";

		String sp = "\nCuriosidade sobre a cidade: é a maior cidade do país.";
		String gru = "\nCuriosidade sobre a cidade: possui a maior avenida principal do mundo: a Via Dutra (BR116).";
		String camp = "\nCuriosidade sobre a cidade: são recolhidas, diariamente, cerca de 1.300 toneladas de resíduos na coleta domiciliar";

		String rj = "\nCuriosidade sobre a cidade: tem o recorde mundial de público em uma partida de futebol.";
		String sg = "\nCuriosidade sobre a cidade: tem o maior tapete de sal da América Latina.";
		String dc = "\nCuriosidade sobre a cidade: comemora-se o dia municipal da cultura.";

		// Escolha do estado
		int resposta = Integer.parseInt(JOptionPane.showInputDialog("Escolha um estado:" + estado));

		// Escolha da cidade de SC
		switch (resposta) {
		case 1:

			int cidade1 = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma cidade de Santa Catarina: " + sc));

			switch (cidade1) {
			case 1:
				JOptionPane.showMessageDialog(null, "Você escolheu Blumenau: " + bnu);
				break;
			case 2:
				JOptionPane.showMessageDialog(null, "Você escolheu Florianópolis: " + flp);
				break;
			case 3:
				JOptionPane.showMessageDialog(null, "Você escolheu Joinville: " + jnv);
				break;
			}
			break;

		// Escolha da cidade de SP
		case 2:

			int cidade2 = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma cidade de São Paulo: " + sp1));

			switch (cidade2) {
			case 1:
				JOptionPane.showMessageDialog(null, "Você escolheu São Paulo: " + sp);
				break;
			case 2:
				JOptionPane.showMessageDialog(null, "Você escolheu Guarulhos: " + gru);
				break;
			case 3:
				JOptionPane.showMessageDialog(null, "Você escolheu Campinas: " + camp);
				break;
			}
			break;
		// Escolha da cidade do RJ
		case 3:

			int cidade3 = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma cidade de Rio de Janeiro: " + rj1));

			switch (cidade3) {
			case 1:
				JOptionPane.showMessageDialog(null, "Você escolheu Rio de Janeiro: " + rj);
				break;
			case 2:
				JOptionPane.showMessageDialog(null, "Você escolheu São Gonçalo: " + sg);
				break;
			case 3:
				JOptionPane.showMessageDialog(null, "Você escolheu Duque de Caxias: " + dc);
				break;
			}
			break;
		}
	}
}