package banco;

public class Cheque {

	// M�todo de juros
	public void juros(double valor) {
		System.out.println("Taxa do cheque: " + valor * 0.05);

	}

	// M�todo de mensagem
	public void mensagem() {
		System.out.println("Voc� reescreveu ");
	}

}