package Prova01;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {

		// String com as questões
		String qst01 = "Questão 01:";
		qst01 += "\nA capital do Brasil é Brasília? ";

		String qst02 = "Questão 02:";
		qst02 += "\nA capital de Santa Catarina é Florianópolis?";

		String qst03 = "Questão 03:";
		qst03 += "\nO dia da indenpendência do Brasil é dia 2 de setembro?";

		String qst04 = "Questão 04:";
		qst04 += "\nA maior cidade do país é Rio de Janeiro?";

		String qst05 = "Questão 05:";
		qst05 += "\nA capital do estado Rio de Janeiro é Rio de Janeiro?";

		String nome;
		int idade = 0;
		String sexo = "feminino" + "masculino";
		int certa = 0;
		int errada = 0;

		int ate17 = 0;
		int entre18e30 = 0;
		int entre31e50 = 0;
		int acima50 = 0;

		int fem = 0;
		int masc = 0;

		int verificarContinuar;
		boolean continuar = true;

		// Pergunta se haverá algum canditado para responder as questões
		int rpst0 = JOptionPane.showConfirmDialog(null, "Haverá algum candidato para responder as questões?");

		do {
			// Caso sim, ele pede as informações
			switch (rpst0) {
			case 0:
				nome = JOptionPane.showInputDialog("Informe seu nome:");
				if (nome.equals("")) {
					JOptionPane.showInputDialog("Informe um nome:");
				}
				idade = Integer.parseInt(JOptionPane.showInputDialog("Informe sua idade:"));

				if (idade < 8 || idade > 100) {
					JOptionPane
							.showInputDialog("Idade inválida. Somente entre 8 e 100 anos." + "\nInforme a nova idade:");
					if (idade >= 8 && idade <= 17) {
						ate17++;
					} else if (idade >= 18) {
						entre18e30++;
					} else if (idade >= 31) {
						entre31e50++;
					} else if (idade >= 51) {
						acima50++;
					}
				}

				else {
					sexo = JOptionPane.showInputDialog("Informe o sexo:");
					if (sexo.equals("feminino")) {
						fem++;
					} else {
						masc++;
					}
				}

				// Primeira pergunta
				int rpst01 = JOptionPane.showConfirmDialog(null, qst01);
				switch (rpst01) {
				case 0:
					certa++;
					break;
				case 1:
					errada++;
					break;
				}

				// Segunda pergunta
				int rpst02 = JOptionPane.showConfirmDialog(null, qst02);
				switch (rpst02) {
				case 0:
					certa++;
					break;
				case 1:
					errada++;
					break;
				}
				// Terceira pergunta
				int rpst03 = JOptionPane.showConfirmDialog(null, qst03);
				switch (rpst03) {
				case 0:
					errada++;
					break;
				case 1:
					certa++;
					break;
				}

				// Quarta pergunta
				int rpst04 = JOptionPane.showConfirmDialog(null, qst04);
				switch (rpst04) {
				case 0:
					errada++;
					break;
				case 1:
					certa++;
					break;
				}

				// Quinta pergunta
				int rpst05 = JOptionPane.showConfirmDialog(null, qst05);
				switch (rpst05) {
				case 0:
					certa++;
					break;
				case 1:
					errada++;
					break;
				}
				// Verifica se quer continuar
				verificarContinuar = JOptionPane.showConfirmDialog(null, "Haverá mais algum jogador:");
				if (verificarContinuar != 0) {
					continuar = false;
				}
				break;
			// Caso responda não, fala "que pena" e fecha o programa
			case 1:
				JOptionPane.showMessageDialog(null, "Que pena :(");
				break;

			// Caso cancele, ele cancela o jogo
			case 2:
				JOptionPane.showMessageDialog(null, "Você cancelou o jogo");
				break;
			// Caso encerre o jogo, ele diz "Você saiu"
			default:
				JOptionPane.showMessageDialog(null, "Você saiu");
			}
		} while (continuar == true);

		JOptionPane.showMessageDialog(null, "Quantidade de respostas certas: " + certa);

		if (continuar == false) {
			JOptionPane.showMessageDialog(null, "Quantidade homens que participaram:\n" + masc
					+ "\nQuantidade de mulheres que participaram:\n" + fem);
			JOptionPane.showMessageDialog(null, "Quantidade de pessoas até 17 anos: " + ate17 + "\nEntre 18 e 30 anos: "
					+ entre18e30 + "\nEntre 31 e 50: " + entre31e50 + "\nAcima de 50: " + acima50);
		}

	}

}
