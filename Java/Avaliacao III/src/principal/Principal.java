package principal;

import formularios.Formulario;

public class Principal {

	public static void main(String[] args) {
		// Inst�nciar um objeto de classe
		Formulario f = new Formulario();
		f.setVisible(true);
		f.setSize(670, 580);
		f.setLocationRelativeTo(null);
	}

}