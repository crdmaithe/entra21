package exemplo08;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Principal {

	public static void main(String[] args) {

		// criar um formul�rio
		JFrame formulario = new JFrame();
		formulario.setSize(500, 300);
		formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		formulario.setTitle("Meu oitavo formul�rio");
		formulario.setLocationRelativeTo(null);
		formulario.setLayout(null);

		// TextArea
		JTextArea campo = new JTextArea();
		campo.setBounds(10, 10, 470, 230);

		// Scroll
		JScrollPane barra = new JScrollPane(campo);
		barra.setBounds(10, 10, 470, 230);

		// Adicionar elemento ao formul�rio
		formulario.add(barra);

		// Exibir formul�rio e os componentes
		formulario.setVisible(true);
	}

}
