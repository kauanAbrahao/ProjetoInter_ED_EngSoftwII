package control;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JOptionPane;

import entities.UsuarioUnico;

public class VerificaProcessoController {
	public int run() throws FileNotFoundException {
		
	int r = 0;
	String dir = System.getProperty("user.dir");
	Scanner scan = new Scanner(new File(dir + "//ProcessoIA.txt"));
	
	UsuarioUnico usuario = UsuarioUnico.getInstance();
	String cpf = usuario.getCpf();
	
	String status = scan.nextLine();
	while(scan.hasNext()) {
		String teste = scan.nextLine();
		if(teste.contains(cpf)) {
			scan.nextLine();
			scan.nextLine();
			status = scan.nextLine();
			System.out.println("Situação do candidato CPF#" + usuario.getCpf());
			System.out.println(status);
			break;
		}
		
	}
	
		scan.close();
		return r;
	}

}