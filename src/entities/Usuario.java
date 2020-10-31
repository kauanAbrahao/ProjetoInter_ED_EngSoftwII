package entities;

public class Usuario {
	private String nome;
	private String email;
	private int cpf;
	private int rg;
	private int cep;
	private int telefone;
	private String endere�o;
	private String estado;
	private String cidade;
	private String login;
	private String senha;
	
	
	public Usuario(String nome, String email, int cpf, int rg, int cep, int telefone, String endere�o, String estado,
			String cidade, String login, String senha) {
		this.nome = nome;
		this.email = email;
		this.cpf = cpf;
		this.rg = rg;
		this.cep = cep;
		this.telefone = telefone;
		this.endere�o = endere�o;
		this.estado = estado;
		this.cidade = cidade;
		this.login = login;
		this.senha = senha;
	}
	
	
	//	M�todo get e set
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getCpf() {
		return cpf;
	}
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	public int getRg() {
		return rg;
	}
	public void setRg(int rg) {
		this.rg = rg;
	}
	public int getCep() {
		return cep;
	}
	public void setCep(int cep) {
		this.cep = cep;
	}
	public int getTelefone() {
		return telefone;
	}
	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
	public String getEndere�o() {
		return endere�o;
	}
	public void setEndere�o(String endere�o) {
		this.endere�o = endere�o;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
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
	

}


