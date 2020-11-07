package entities;

public class Usuario {
	Usuario anterior;
	Usuario proximo;
	private String nome;
	private String cpf;
	private String telefone;
	private String login;
	private String senha;
	private int rg;
	
	
	
	public Usuario(String nome, String telefone, String cpf) {
		this.nome = nome;
		this.telefone = telefone;
		this.cpf = cpf;
	}
	
	public Usuario() {
		
	}
	
	
	//	Método get e set
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public int getRg() {
		return rg;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}

	public Usuario getAnterior() {
		return anterior;
	}

	public void setAnterior(Usuario anterior) {
		this.anterior = anterior;
	}

	public Usuario getProximo() {
		return proximo;
	}

	public void setProximo(Usuario proximo) {
		this.proximo = proximo;
	}
	

}


