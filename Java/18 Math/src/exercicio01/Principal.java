package exercicio01;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {

		// Solicita opera��o
		int operacao = Integer.parseInt(JOptionPane.showInputDialog("Informe a opera��o:" + "\n1- Soma"
				+ "\n2- Subtra��o" + "\n3- Multiplica��o" + "\n4- Divis�o" + "\n5- Seno" + "\n6- Cosseno"
				+ "\n7- Tangente" + "\n8- Log" + "\n9- Ra�z Quadrada" + "\n10- Ra�z C�bica"));

		Calculadora calc = new Calculadora();

		double num1 = Integer.parseInt(JOptionPane.showInputDialog("Informe o primeiro n�mero"));
		double num2 = Integer.parseInt(JOptionPane.showInputDialog("Informe o segundo n�mero"));

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
