package principal;

import java.io.IOException;

import javax.swing.JOptionPane;

import aluno.ListaDeAlunosInscritosNoSistema;
import aluno.Login;

public class PrincipalAluno {
	
	public void interfaceAluno() throws IOException {
		JOptionPane.showMessageDialog(null, "Você está no SysGETI - Perfil Aluno");
		int opc_login = -1;
		int opc = -1;
				
		while(opc_login != 9) {
			opc_login = Integer.parseInt(JOptionPane.showInputDialog("1 - Fazer login" + "\n" + "\n" + "2 - Não sou cadastrado" + "\n" + 
		"3 - Voltar"));
			
			switch(opc_login) {
			case 1: 
			Login login = new Login();
			opc_login = login.run();
			break;
			
			case 2:
			Login cadastro = new Login();
			cadastro.cadastrarCandidato();
			break;
			
			case 3:
			opc = 9;
			opc_login = 9;
			break;
			
			default: JOptionPane.showMessageDialog(null, "Opção Inválida");
			
			
			}
		}
		
		ListaDeAlunosInscritosNoSistema lista_alunos_matriculados = new ListaDeAlunosInscritosNoSistema();		
		
		while(opc != 9) {
			
		opc = Integer.parseInt(JOptionPane.showInputDialog("Selecione:" +  "\n" + "1 - Adicioanr Aluno no Início" + "\n" + "2 - Adicionar"
				+ " aluno no fim" + "\n" + "3 - Remover no início" + "\n" + "4 - Remover no fim" + "\n" + "5 - Adicionar na pos" +
				"\n" + "6 - Mostrar lista" + " \n" + "9 - Finalizar"));
		switch(opc) {
		case 1:
			String nome = JOptionPane.showInputDialog("Nome Completo: ");
			String curso = JOptionPane.showInputDialog("Curso: ");
			int id = (int) (Math.random() * 200)+100;
			lista_alunos_matriculados.inserirInicio(nome, curso, id);
			break;
			
		case 2:
			String nome1 = JOptionPane.showInputDialog("Nome Completo: ");
			String curso1 = JOptionPane.showInputDialog("Curso: ");
			int id1 = (int) (Math.random() * 200)+100;
			lista_alunos_matriculados.inserirFim(nome1, curso1, id1);
			break;
		
		case 3:
			System.out.println(lista_alunos_matriculados.removerInicio());
			break;
			
		case 4: 
		System.out.println(lista_alunos_matriculados.removerFim());
		break;
		
		case 5:
			String nome2 = JOptionPane.showInputDialog("Nome Completo: ");
			String curso2 = JOptionPane.showInputDialog("Curso: ");
			int id2 = (int) (Math.random() * 200)+100;
			int pos = Integer.parseInt(JOptionPane.showInputDialog("Posição para inserir: "));
			lista_alunos_matriculados.inserirPosicao(nome2, curso2, id2, pos);
			break;
		
		case 6:
			String r = lista_alunos_matriculados.mostraLista();
			System.out.println(r);
			break;
			
		case 9:
			JOptionPane.showMessageDialog(null, "FINALIZADO!");
			break;
			
		default: JOptionPane.showMessageDialog(null, "Opção inválida.");
		break;
		}
			
		}
		
	}
	
}
