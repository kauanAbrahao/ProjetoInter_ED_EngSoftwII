package entities;

public class UsuarioUnico {
	private  static UsuarioUnico instance = null;
	private  String nome;
	private  String telefone;
	private  String cpf;

	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	//	Aqui é onde a mágica acontece
	public static UsuarioUnico getInstance() {
		if(instance == null) {
			instance = new UsuarioUnico();
		}
		return instance;
	}


}
