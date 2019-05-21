package banco;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Principal {

	public static void main(String[] args) {

		// Poli -> Vários
		// Morphus -> Formas
		ChequeEspecial obj = new ChequeEspecial();
		obj.juros(1000);
		obj.mensagem();

	}
	
	//Outro exemplo
	List<String> nome = new ArrayList<String>();
	List<String> emails = new LinkedList<String>();
}
