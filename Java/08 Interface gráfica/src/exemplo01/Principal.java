package exemplo01;

import java.awt.Frame;

import javax.swing.JFrame;

public class Principal {
	
	public static void main(String[] args) {
		
		//criar um formul�rio
		
		JFrame formulario = new JFrame();
		formulario.setSize(500, 300);
		formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		formulario.setVisible(true);
		formulario.setTitle("Meu primeiro formul�rio");
		formulario.setLocationRelativeTo(null);
		
		
	}

}
