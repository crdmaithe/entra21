package exercicio01;

import javax.swing.JOptionPane;

public class Calculadora {

	// Soma
	void somar(double numero1, double numero2) {
		System.out.println(numero1 + numero2);
	}

	// Subtra��o
	void subtracao(double numero1, double numero2) {
		System.out.println(numero1 - numero2);
	}

	// Multiplica��o
	void multi(double numero1, double numero2) {
		System.out.println(numero1 * numero2);
	}

	// Divis�o
	void divisao(double numero1, double numero2) {
		System.out.println(numero1 / numero2);
	}

	// Seno
	public double seno(double numero1) {
		return Math.sin(numero1);
	}
	// Cosseno
	public void cosseno(double numero1) {
		double cos1 = Math.cos(numero1);		
		System.out.println(cos1);
	}

	// Tangente
	public void tang(double numero1) {
		double tang = Math.tan(numero1);
		System.out.println(tang);
	}

	// Log

	// Ra�z Quadrada

	// Ra�z C�bida

}
