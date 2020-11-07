package boundary;

import java.io.IOException;

import javax.swing.JOptionPane;

public class Principal {
	public static void main(String[] args) throws IOException {
		InscricaoSistema boundary_inscricao_sistema = new InscricaoSistema();
		int opc = -1;
		
		while (opc!= 9) {
			opc = Integer.parseInt(JOptionPane.showInputDialog("Bem vindo ao SysGETI" + "\n" + "1 - Plataforma Aluno" + 
					"\n" + "2 - Plataforma CRA" + "\n" + "3 - Plataforma CPS " + "\n" + "\n" + "9 - Finalizar"));
			
			switch(opc) {
			case 1: boundary_inscricao_sistema.interfaceAluno();
			break;
			case 2: //;
			case 3: //;
			case 9: JOptionPane.showMessageDialog(null, "Finalizado");
			break;
			default: JOptionPane.showMessageDialog(null, "Opção inválida, tente novamente");
			}
			
		}
		
		
		
	}
}

