package boundary;

import java.io.IOException;

import javax.swing.JOptionPane;

import control.InscricaoProcessoController;
import control.InscricaoSistemaController;
import entities.ListaDeAlunosInscritosNoSistema;

public class InscricaoProcesso {
	
	public void interfaceAluno() throws IOException {
//N�o sei se essa parte se aplica, pois fica repetitivo
		JOptionPane.showMessageDialog(null, "Voc� est� no SysGETI - Perfil Aluno");
		int opc_Curso = -1;
		int opc = -1;
//Adicionando um menu para a inscri��o, por�m n�o sei se n�o ficaria melhor conecta-lo diretamente com o login 	
		while(opc_Curso != 9) {
			opc_Curso = Integer.parseInt(JOptionPane.showInputDialog("1 - Inscri��o" + "\n" + "\n" + "2 - Voltar"));
			
			switch(opc_Curso) {
			case 1: 
			InscricaoProcessoController inscricao = new InscricaoProcessoController();
			opc_Curso = inscricao.run();
			break;
		
			case 2:
			opc = 9;
			opc_Curso = 9;
			break;
			
			default: JOptionPane.showMessageDialog(null, "Op��o Inv�lida");
			
			
			}
		}
	}
}