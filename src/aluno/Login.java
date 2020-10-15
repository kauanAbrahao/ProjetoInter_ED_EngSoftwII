package aluno;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Login {

//	Método vai conferir em Cadastros.txt se o candidato já está matriculado no sistema por meio de login e senha
	public int run() throws FileNotFoundException {
		int r = 0;
		Scanner scan = new Scanner(new File("C:\\Users\\knmar\\eclipse-workspace\\ED_EngSoftwareII_Projeto\\Cadastros.txt"));
		String user_fornecido = JOptionPane.showInputDialog("inserir nome de usuário: ");
		String pass_fornecido = JOptionPane.showInputDialog("Senha:");
		
		while(scan.hasNext()) {
			String user = scan.nextLine();
			String pass = scan.nextLine();
			
			
			if(user_fornecido.equals(user) && pass_fornecido.equals(pass)) {
				JOptionPane.showMessageDialog(null, "Bem-vindo ao SysGETI - Perfil Aluno");
				r = 9;
				break;
			}
		}
		if (r == 0) {
			JOptionPane.showMessageDialog(null, "Usuário ou senha inválidos");
		}
		return r;
	}
	
	public void cadastrar() {
		
	}
}
