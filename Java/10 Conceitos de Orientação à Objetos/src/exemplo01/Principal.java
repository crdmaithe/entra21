package exemplo01;

public class Principal {

	public static void main(String[] args) {
		
		//Instanciar
		Carro c1 = new Carro();
		c1.ano = 2019;
		c1.cor = "Azul";
		c1.fabricante = "Hyundai";
		c1.modelo = "HB20";
		c1.exibirDados();
		
		//Segunda Instancia
		Carro c2 = new Carro();
		c2.ano = 2010;
		c2.cor = "Verde";
		c2.fabricante = "Toyota";
		c2.modelo = "Corolla";
		c2.exibirDados();
	}
}
