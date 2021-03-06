package colaborador;

public class Colaborador extends Pessoa {

	// Atributos
	private String cargoColaborador;
	private double salarioColaborador;

	// Construtor
	public Colaborador(String nomePessoa, String emailPessoa, String enderecoPessoa, int idadePessoa,
			String cargoColaborador, double salarioColaborador) {
		super(nomePessoa, emailPessoa, enderecoPessoa, idadePessoa);

		this.cargoColaborador = cargoColaborador;
		this.salarioColaborador = salarioColaborador;

		exibirDadosColaborador();

	}

	// M�todo para exibir os dados do colaborador
	private void exibirDadosColaborador() {
		System.out.println("Cargo: " + cargoColaborador);
		System.out.println("Sal�rio: " + salarioColaborador);
	}

}
