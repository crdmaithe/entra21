package exemplo02;

public class Curso {

	//Atributos
	private String nomeCurso, areaCurso;
	public String getNomeCurso() {
		return nomeCurso;
	}
	
	//Get e Set
	public void setNomeCurso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}
	public String getAreaCurso() {
		return areaCurso;
	}
	public void setAreaCurso(String areaCurso) {
		this.areaCurso = areaCurso;
	}
	public double getValorCurso() {
		return valorCurso;
	}
	public void setValorCurso(double valorCurso) {
		this.valorCurso = valorCurso;
	}
	private double valorCurso;
}
