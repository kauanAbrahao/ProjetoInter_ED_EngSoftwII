package control;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JOptionPane;

public class InscricaoProcessoController {

	
//	----------------------------------------------------------------------------------------------------
	public int inscricao() throws IOException {
		
		return 9;
		
				
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
