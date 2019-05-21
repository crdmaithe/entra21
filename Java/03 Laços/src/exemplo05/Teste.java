package exemplo05;

import javax.swing.JOptionPane;

public class Teste {

	public static void main(String[] args) {
		
		
		int sexo, masculino=0, feminino=0;
		int continuar = 0;
		
		do {
			sexo = Integer.parseInt(JOptionPane.showInputDialog("1Masculino\n2)Feminino"));
			if(sexo == 1) {
				masculino++;
			}else {
				feminino++;
			}
			
			continuar = Integer.parseInt(JOptionPane.showInputDialog("Continuar?\n1)Sim 2)Não"));
			
		}while(continuar != 2);
		

	}

}
