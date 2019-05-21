package Exercicio21;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {

		String lista = "\nNome	À vista		A prazo	30 dias		A prazo 60 dias";
		lista += "\nCalça		R$150		R$165				R$180";
		lista += "\nCamisa		R$300	R$330                       R$360";
		lista += "\nCasaco         R$250           R$275                      R$300";
		lista += "\nMeias           R$30            R$33                     R$36";
		lista += "\nPaletó           R$450          R$495                   R$540";

		JOptionPane.showMessageDialog(null, "Escolha um produto" + lista);
	}
}