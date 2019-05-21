package exercicio01;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {

		// Solicita operação
		int operacao = Integer.parseInt(JOptionPane.showInputDialog("Informe a operação:" + "\n1- Soma"
				+ "\n2- Subtração" + "\n3- Multiplicação" + "\n4- Divisão" + "\n5- Seno" + "\n6- Cosseno"
				+ "\n7- Tangente" + "\n8- Log" + "\n9- Raíz Quadrada" + "\n10- Raíz Cúbica"));

		Calculadora calc = new Calculadora();

		double num1 = Integer.parseInt(JOptionPane.showInputDialog("Informe o primeiro número"));
		double num2 = Integer.parseInt(JOptionPane.showInputDialog("Informe o segundo número"));

		switch (operacao) {
		// Soma
		case 1:
			calc.somar(num1, num2);
			break;
		// Subtrai
		case 2:
			calc.subtracao(num1, num2);
			break;
		// Multiplica
		case 3:
			calc.multi(num1, num2);
			break;
		// Divide
		case 4:
			calc.divisao(num1, num2);
			break;
		// Seno
		case 5:
			calc.seno(num1);
			break;
		// Cosseno
		case 6:
			calc.cosseno(num1);
			break;
		// Tangente
		case 7:
			calc.tang(num1);
		}

	}

}
