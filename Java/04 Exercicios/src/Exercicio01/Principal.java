package Exercicio01;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {

		String cargo = "Informe o cargo: ";
		cargo += "\n1- Gerente";
		cargo += "\n2- Atendente";
		cargo += "\n3- Açougueiro";
		cargo += "\n4- Secretária";
		cargo += "\n5- Almoxarife";
		cargo += "\n6- Padeiro";
		cargo += "\n7- Estagiário";
		int gerente = 0;
		int atendente = 0;
		int acougueiro = 0;
		int secretaria = 0;
		int almoxarife = 0;
		int padeiro = 0;
		int estagiario = 0;

		int cargo1 = 0;

		String nomes;
		int sexo;

		int idades = 0;
		int maiorIdade = 0;
		int menorIdade = 0;
		int fem = 0;
		int masc = 0;

		for (int i = 0; i <= 4; i++) {

			// Obter dados
			nomes = JOptionPane.showInputDialog("Informe o nome: ");
			idades = Integer.parseInt(JOptionPane.showInputDialog("Informe a idade: "));
			sexo = Integer
					.parseInt(JOptionPane.showInputDialog("Informe o sexo: \n" + "1- Feminino\n" + "2-Masculino"));
			cargo1 = Integer.parseInt(JOptionPane.showInputDialog(cargo));

			if (idades < 18) {
				menorIdade += 1;
			}
			if (idades >= 18) {
				maiorIdade += 1;
			}

			switch (sexo) {
			case 1:
				fem++;
				break;
			case 2:
				masc++;
				break;
			}

			switch (cargo1) {
			case 1:
				gerente++;
				break;
			case 2:
				atendente++;
				break;
			case 3:
				acougueiro++;
				break;
			case 4:
				secretaria++;
				break;
			case 5:
				almoxarife++;
				break;
			case 6:
				padeiro++;
				break;
			case 7:
				estagiario++;
				break;
			}

		}
		if (gerente > 0) {
			JOptionPane.showMessageDialog(null, "Gerente: " + gerente);
		}
		if (atendente > 0) {
			JOptionPane.showMessageDialog(null, "Atendente: " + atendente);
		}
		if (acougueiro > 0) {
			JOptionPane.showMessageDialog(null, "Açougueiro: " + acougueiro);
		}
		if (secretaria > 0) {
			JOptionPane.showMessageDialog(null, "Secretária: " + secretaria);
		}
		if (almoxarife > 0) {
			JOptionPane.showMessageDialog(null, "Almoxarife: " + almoxarife);
		}
		if (padeiro > 0) {
			JOptionPane.showMessageDialog(null, "Padeiro: " + padeiro);
		}
		if (estagiario > 0) {
			JOptionPane.showMessageDialog(null, "Estagirio: " + estagiario);
		}

		JOptionPane.showMessageDialog(null, maiorIdade + " são maiores de idade.\n");
		JOptionPane.showMessageDialog(null, fem + " são do sexo feminino.\n" + masc + " são do sexo masculino.");
	}
}