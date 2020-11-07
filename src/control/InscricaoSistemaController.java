package control;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JOptionPane;

import entities.UsuarioUnico;

public class InscricaoSistemaController {

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
				
				String nome = scan.nextLine();
				String telefone = scan.nextLine();
				String cpf = scan.nextLine();
				UsuarioUnico usuario = UsuarioUnico.getInstance();
				usuario.setCpf(cpf);
				usuario.setNome(nome);
				usuario.setTelefone(telefone);
				break;
			}
		}
		if (r == 0) {
			JOptionPane.showMessageDialog(null, "Usuário ou senha inválidos");
		}
		
		scan.close();
		return r;
	}
	
//	----------------------------------------------------------------------------------------------------
	public void cadastrarCandidato() throws IOException {
		String nome = null;
		String telefone = null;
		String cpf = null;
		String pass_cadastra = null;
		String user_cadastra = JOptionPane.showInputDialog("Escolha um nome de usuário: ");
		boolean sucesso = false;
		
		while(!sucesso) { //Toda a lógica para cadastrar usuário e senha está dentro deste while
			sucesso = cadastraUsuarioSenha(user_cadastra, pass_cadastra);
		}
		cadastraDados(nome, telefone, cpf);
		
				
	}
	
//	--------------------------------------------------------------------------------------------------------
	private boolean cadastraUsuarioSenha(String user_cadastra, String pass_cadastra) throws IOException {
		
		//Cadastra usuário e senha
		pass_cadastra = JOptionPane.showInputDialog("Escolha uma senha: ");
		String confere = JOptionPane.showInputDialog("Confirme a senha: ");
		if (!pass_cadastra.equals(confere)) {
			JOptionPane.showMessageDialog(null, "As senhas estão diferentes. Tente novamente.");
			return false;
		}
		else {
			JOptionPane.showMessageDialog(null, "Login e senha cadastrados com sucesso");
			
		//Grava usuário e senha no arquivo txt
		String dir = System.getProperty("user.dir");
		BufferedWriter gravar = new BufferedWriter(new FileWriter(dir + "//Cadastros.txt", true));
		gravaCadastroSenhaUsuario(dir, gravar, user_cadastra, pass_cadastra);
		return true;
		}
		
	}
//	-------------------------------------------------------------------------------------------------------
	private void cadastraDados(String nome, String telefone, String cpf) throws IOException {
		
		JOptionPane.showMessageDialog(null, "Agora, vamos cadastrar seus dados!");
		boolean valido = false;
		
		//Cadastrar nome
		while(!valido) {
			nome = JOptionPane.showInputDialog("Inserir nome completo: ");
			Pattern patern = Pattern.compile("^[a-zA-Z_ ]*$");
			Matcher match = patern.matcher(nome);
			valido = confereInformacoes(nome, patern, match);
		}
		
		//Cadastrar telefone
		valido = false;
		while(!valido) {
			telefone = JOptionPane.showInputDialog("Inserir telefone (somente números): ");
			Pattern patern = Pattern.compile("^[0-9]*$");
			Matcher match = patern.matcher(telefone);
			valido = confereInformacoes(telefone, patern, match);
		}
		
		//Cadastra cpf
		valido = false;
		while(!valido) {
			cpf = JOptionPane.showInputDialog("Inserir CPF (somente números): ");
			Pattern patern = Pattern.compile("^[0-9]{11}$");
			Matcher match = patern.matcher(cpf);
			valido = confereInformacoes(cpf, patern, match);
			
		}

		//Grava usuário e senha no arquivo txt
		String dir = System.getProperty("user.dir");
		BufferedWriter gravar = new BufferedWriter(new FileWriter(dir + "//Cadastros.txt", true));
		gravaCadastroNomeTelefoneCpf(dir, gravar, nome, telefone, cpf);
		
	}
	
//		---------------------------------------------------------------------------------------------------------
	public boolean confereInformacoes(String validacao, Pattern patern, Matcher match) {
		if (match.find()) {
			JOptionPane.showMessageDialog(null, "Informação cadastrada!");
			return true;
		}
		else {
			JOptionPane.showMessageDialog(null, "Informações inseridas inválidas. Por favor, tente novamente");
			return false;
		}
	}
	
	// ----------------------------------------------------------------------------------------------------------
		public void gravaCadastroSenhaUsuario(String dir, BufferedWriter gravar, String user_cadastra, String pass_cadastra) throws IOException {
			gravar.write(user_cadastra);
			gravar.newLine();
			gravar.write(pass_cadastra);
			gravar.newLine();
			gravar.close();
		}
		//		---------------------------------------------------------------------------------------------------------
		public void gravaCadastroNomeTelefoneCpf(String dir, BufferedWriter gravar, String nome, String telefone, String cpf) throws IOException {
			gravar.write(nome);
			gravar.newLine();
			gravar.write(telefone);
			gravar.newLine();
			gravar.write(cpf);
			gravar.newLine();
			gravar.newLine();
			gravar.close();
		}
	
	
}
