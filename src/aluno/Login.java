package aluno;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Login {

//	Método vai conferir em Cadastros.txt se o candidato já está matriculado no sistema por meio de login e senha
	public int run() throws FileNotFoundException {
		int r = 0;
		String dir = System.getProperty("user.dir");
		Scanner scan = new Scanner(new File(dir + "//Cadastros.txt"));
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
		scan.close();
		return r;
	}
	
	public void cadastrar() throws IOException {
		String pass_cadastra = null;
		String user_cadastra = JOptionPane.showInputDialog("Escolha um nome de usuário: ");
		boolean sucesso = false;
		
		while(!sucesso) {
			pass_cadastra = JOptionPane.showInputDialog("Escolha uma senha: ");
			String confere = JOptionPane.showInputDialog("Confirme a senha: ");
			if (!pass_cadastra.equals(confere)) {
				JOptionPane.showMessageDialog(null, "As senhas estão diferentes. Tente novamente.");
			}
			else {
				JOptionPane.showMessageDialog(null, "Cadastrado com sucesso!");
				sucesso = true;
			}
		}
		String dir = System.getProperty("user.dir");
		BufferedWriter gravar = new BufferedWriter(new FileWriter(dir + "//Cadastros.txt"));
		gravar.write(user_cadastra);
		gravar.newLine();
		gravar.write(pass_cadastra);
		gravar.newLine();
		gravar.close();
	}
}
