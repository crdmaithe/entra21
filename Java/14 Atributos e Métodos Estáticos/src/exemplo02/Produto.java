package exemplo02;

public class Produto {

	// Atributo
	private static int contador = 0;

	// Construtor
	public Produto() {
		System.out.println(contador);
		contador++;
	}

}
