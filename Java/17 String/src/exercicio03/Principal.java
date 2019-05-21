package exercicio03;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {

		String conjugado = "", ar = "", letra;
		String palavra = JOptionPane.showInputDialog("Informe o verbo");
		int tamanho = palavra.length();

		for (int i = 0; i < tamanho - 2; i++) {
			letra = String.valueOf(palavra.charAt(i));
			conjugado += letra;
		}

		for (int i = tamanho - 2; i < tamanho; i++) {
			ar += String.valueOf(palavra.charAt(i));
		}

		if (ar.equals("ar")) {
			JOptionPane.showMessageDialog(null,
					"Eu " + conjugado + "o" + "\nTu " + conjugado + "as" + "\nEle " + conjugado + "a" + "\nNós "
							+ conjugado + "amos" + "\nVós " + conjugado + "ais" + "\nEles " + conjugado + "am");
		} else {
			JOptionPane.showMessageDialog(null, "Não é verbo!");
		}
	}

}
