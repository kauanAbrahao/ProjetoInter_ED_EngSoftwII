package entities;

public class Candidato extends Usuario {

	ProcessoSeletivo processo;
	int notaLattes;
	int notaEntrevista;
	int notaFinal;
	int colocacao;
	boolean aprovado;
	
//	Caso precise alterar o construtor:
	
	public Candidato(String nome, String email, int cpf, int rg, int cep, int telefone, String endere�o, String estado,
			String cidade, String login, String senha) {
		super(nome, email, cpf, rg, cep, telefone, endere�o, estado, cidade, login, senha);
	}

	
//	M�todos get e set

	public ProcessoSeletivo getProcesso() {
		return processo;
	}

	public void setProcesso(ProcessoSeletivo processo) {
		this.processo = processo;
	}

	public int getNotaLattes() {
		return notaLattes;
	}

	public void setNotaLattes(int notaLattes) {
		this.notaLattes = notaLattes;
	}

	public int getNotaEntrevista() {
		return notaEntrevista;
	}

	public void setNotaEntrevista(int notaEntrevista) {
		this.notaEntrevista = notaEntrevista;
	}

	public int getNotaFinal() {
		return notaFinal;
	}

	public void setNotaFinal(int notaFinal) {
		this.notaFinal = notaFinal;
	}

	public int getColocacao() {
		return colocacao;
	}

	public void setColocacao(int colocacao) {
		this.colocacao = colocacao;
	}

	public boolean isAprovado() {
		return aprovado;
	}

	public void setAprovado(boolean aprovado) {
		this.aprovado = aprovado;
	}
	
	
	

}
