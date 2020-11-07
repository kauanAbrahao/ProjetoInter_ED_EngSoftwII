package boundary;

import java.io.IOException;

import javax.swing.JOptionPane;

import control.InscricaoSistemaController;

public class InscricaoSistema {
	
	public void interfaceAluno() throws IOException {
		JOptionPane.showMessageDialog(null, "Você está no SysGETI - Perfil Aluno");
		int opc_login = -1;
		int opc = -1;
		
				
		while(opc_login != 9) {
			opc_login = Integer.parseInt(JOptionPane.showInputDialog("1 - Fazer login" + "\n" + "\n" + "2 - Não sou cadastrado" + "\n" + 
		"3 - Voltar"));
			
			switch(opc_login) {
			case 1: 
			InscricaoSistemaController login = new InscricaoSistemaController();
			opc_login = login.run();
			break;
			
			case 2:
			InscricaoSistemaController cadastro = new InscricaoSistemaController();
			cadastro.cadastrarCandidato();
			break;
			
			case 3:
			opc = 9;
			opc_login = 9;
			break;
			
			default: JOptionPane.showMessageDialog(null, "Opção Inválida");
			
			
			}
		}		
		
		
		PrincipalAposLogin boundary_principal_apos_login = new PrincipalAposLogin();
		boundary_principal_apos_login.interfaceAlunoAposLogin();
			
		
		
	}
	
}
