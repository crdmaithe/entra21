package exemplo03;

public class Pessoa {
	
	//Atributos
	private String nome;
	private int idade;
	
	//Construtor
	public Pessoa(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
		exibirDados();
	}
	
	//M�todo para exibir dados
	private void exibirDados() {
		System.out.println(nome+"\n"+idade);
	}
	
	//M�todo para retornar  a situa��o  da idade
	private void situacaoIdade() {
		int idade = 0;
		System.out.println(idade >= 18 ? "Maior de idade" : "Menor de idade");
	}

}
