package boundary;

import java.io.IOException;

import javax.swing.JOptionPane;

public class PrincipalAposLogin {
	
	public void interfaceAlunoAposLogin() throws IOException {
		int opc = -9;
		VerificaProcesso verificaprocesso = new VerificaProcesso();
		InscricaoProcesso inscricaoprocesso = new InscricaoProcesso();
		while(opc!=9) {
			opc = Integer.parseInt(JOptionPane.showInputDialog("== BEM VINDO � PLATAFORMA ALUNO ==" + "\n" + "1 - Inscri��o em Processo Seletivo " + "2 - Consulta"
	+ "Situa��o no Processo Seletivo" + "\n"+ "9 - voltar"));
			if(opc == 1) {
				inscricaoprocesso.interfaceAluno();
			}
			else {
				if(opc == 2) {
					verificaprocesso.consultaInscricao();
				}
				else {
					if (opc != 9) {
						JOptionPane.showMessageDialog(null, "OP��O INV�LIDA");
					}
				}
			}
					 
		}
		
	}
}
