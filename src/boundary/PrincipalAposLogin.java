package boundary;

import java.io.IOException;

import javax.swing.JOptionPane;

public class PrincipalAposLogin {
	
	public void interfaceAlunoAposLogin() throws IOException {
		
		//FAZER A TELA PARA ESCOLHER OQ O ALUNO QUER FAZER. 1 - SE INSCREVER EM UM PROCESSO ou 2 - VERIFICAR SITUACAO NO PROCESSO JÁ INSCRITo
		
		InscricaoProcesso boundary_inscricao_processo = new InscricaoProcesso();
		boundary_inscricao_processo.interfaceAluno();
		
	}
}
