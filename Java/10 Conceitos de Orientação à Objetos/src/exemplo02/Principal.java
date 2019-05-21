package exemplo02;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		Calculadora c = new Calculadora();
		
		
		int num1 = Integer.parseInt(JOptionPane.showInputDialog("numero 1"));
		int num2 = Integer.parseInt(JOptionPane.showInputDialog("numero 2"));
		
		c.somar(num1, num2);
		int ResultadoSubtracao = c.subtracao(20, 8);
		System.out.println(ResultadoSubtracao);
	}

}
