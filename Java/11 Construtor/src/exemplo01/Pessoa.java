package exemplo01;

public class Pessoa {
	
	//Construtor #1
	Pessoa(){
		System.out.println("Olá");
	}
	
	//Construtor #2
	Pessoa(String nome){
		System.out.println("Olá "+nome);
	}
	
	//Construtor #3
	Pessoa (String nome, int idade){
		System.out.println("Olá " + nome+", você tem "+idade+" anos.");
	}

}
