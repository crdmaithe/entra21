package Exemplo01;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		//� um tipo de vari�vel que armazena v�rios dados
		String[] nomes = new String[3];
		
		//Pedir os tr�s nomes
		nomes [0] = JOptionPane.showInputDialog("1� nome:");
		nomes [1] = JOptionPane.showInputDialog("2� nome:");
		nomes [2] = JOptionPane.showInputDialog("3� nome:");
		
		//Exibir os tr�s nomes
		String	exibirNomes = nomes[0];
				exibirNomes+= "\n"+nomes[1];
				exibirNomes+= "\n"+nomes[2];
		JOptionPane.showMessageDialog(null, exibirNomes);
	}
}