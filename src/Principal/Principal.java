package Principal;

import javax.swing.JOptionPane;

public class Principal {
	

	public static void main(String[] args) {
		PrincipalAluno aluno = new PrincipalAluno();
		PrincipalGTI gti = new PrincipalGTI();
		int opc = -1;
		while(opc != 0) {	
		opc = Integer.parseInt(JOptionPane.showInputDialog("Selecionar interface: " + "\n" + "1 - Aluno" + "\n" + "2 - GTI"));
		
		switch(opc) {
		case 1: aluno.exemplo();
		
		case 2: gti.exemplo();
		
		default: JOptionPane.showMessageDialog(null, "Inserir valor v�lido");
		
		}
		}
	
	}
}

// Criar um objeto Aluno
// Criar uma lista din�mica de Alunos (inscritos no Sistema e candidatos)
// Intera��o entre Aluno e GTI
// Crirar um objeto ProcessoSeletivo (data, descri��o, etc);
