package boundary;

import java.io.IOException;

import javax.swing.JOptionPane;

import control.InscricaoProcessoController;
import entities.ProcessoSeletivo;

public class InscricaoProcesso {
	
	public void interfaceAluno() throws IOException {
//Não sei se essa parte se aplica, pois fica repetitivo
		JOptionPane.showMessageDialog(null, "== PROCESSOS SELETIVOS EM ABERTO ==");
		int opc_Curso = -1;
		int opc = -1;
		
		
		ProcessoSeletivo processo = new ProcessoSeletivo();
		
		
//Adicionando um menu para a inscrição, porém não sei se não ficaria melhor conecta-lo diretamente com o login 	
		while(opc_Curso != 9) {
			opc_Curso = Integer.parseInt(JOptionPane.showInputDialog("1 - " + processo.getCurso() + "\n" + "2 - voltar"));
			
			switch(opc_Curso) {
			case 1:
			InscricaoProcessoController inscricao = new InscricaoProcessoController();
			opc_Curso = inscricao.inscricao();
			break;
		
			case 2:
			opc = 9;
			opc_Curso = 9;
			break;
			
			default: JOptionPane.showMessageDialog(null, "Opção Inválida");
			
			
			}
		}
	}
}