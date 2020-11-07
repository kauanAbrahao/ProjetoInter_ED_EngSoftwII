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

public class InscricaoProcessoController {

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
	
//	----------------------------------------------------------------------------------------------------
	public void inscricao() throws IOException {
		String curso = "";
		String curriculo = "";
		String documentos = "";
		
		cadastraDados(curso, curriculo, documentos);
				
	}
	

//	-------------------------------------------------------------------------------------------------------
	private void cadastraDados(String curso, String curriculo, String documentos ) throws IOException {
		
		JOptionPane.showMessageDialog(null, "Agora, vamos cadastrar seus dados!");
		boolean valido = false;
		
		//Cadastrar curso
		while(!valido) {
			curso = JOptionPane.showInputDialog("Inserir o nome do curso: ");
			Pattern patern = Pattern.compile("^[a-zA-Z_ ]*$");
			Matcher match = patern.matcher(curso);
			valido = confereInformacoes(curso, patern, match);
		}
		
		//Cadastrar curriculo
		valido = false;
		while(!valido) {
			curriculo = JOptionPane.showInputDialog("Coloque o link para seu curriculo lattes: ");
			Pattern patern = Pattern.compile("^[a-zA-Z_ ]*$");
			Matcher match = patern.matcher(curriculo);
			valido = confereInformacoes(curriculo, patern, match);
		}
		
		//Cadastra documentos
		valido = false;
		while(!valido) {
			documentos = JOptionPane.showInputDialog("Coloque os seus documentos: ");
			Pattern patern = Pattern.compile("^[a-zA-Z_ ]*$");
			Matcher match = patern.matcher(documentos);
			valido = confereInformacoes(documentos, patern, match);
			
		}

		//Grava Curso curriculo e documentos
		String dir = System.getProperty("user.dir");
		BufferedWriter gravar = new BufferedWriter(new FileWriter(dir + "//Processo.txt", true));
		gravaProcesso(dir, gravar, curso, curriculo, documentos);		
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
	
//		---------------------------------------------------------------------------------------------------------
	public void gravaProcesso(String dir, BufferedWriter gravar, String curso, String curriculo, String documentos) throws IOException {
		gravar.write(curso);
		gravar.newLine();
		gravar.write(curriculo);
		gravar.newLine();
		gravar.write(documentos);
		gravar.newLine();
		gravar.newLine();
		gravar.close();
		}
}
