package Exemplo01;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		//É um tipo de variável que armazena vários dados
		String[] nomes = new String[3];
		
		//Pedir os três nomes
		nomes [0] = JOptionPane.showInputDialog("1º nome:");
		nomes [1] = JOptionPane.showInputDialog("2º nome:");
		nomes [2] = JOptionPane.showInputDialog("3º nome:");
		
		//Exibir os três nomes
		String	exibirNomes = nomes[0];
				exibirNomes+= "\n"+nomes[1];
				exibirNomes+= "\n"+nomes[2];
		JOptionPane.showMessageDialog(null, exibirNomes);
	}
}