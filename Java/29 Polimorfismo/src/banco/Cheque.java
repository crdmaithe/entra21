package banco;

public class Cheque {

	// Método de juros
	public void juros(double valor) {
		System.out.println("Taxa do cheque: " + valor * 0.05);

	}

	// Método de mensagem
	public void mensagem() {
		System.out.println("Você reescreveu ");
	}

}
