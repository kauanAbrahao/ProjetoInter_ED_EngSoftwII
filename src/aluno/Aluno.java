package aluno;

public class Aluno {
	private String nome;
	private String telefone;
	private String cpf;
	private boolean deferido = false;
	private double notaCurriculo;
	private double notaEntrevista;
	private double notaFinal;
	boolean classificado;
	Aluno proximo;
	Aluno anterior;
	// Temos que definir quais atributos o Objeto Aluno terá.



//	Métodos get e set
	
	
	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}



	public Aluno getProximo() {
		return proximo;
	}



	public void setProximo(Aluno proximo) {
		this.proximo = proximo;
	}



	public Aluno getAnterior() {
		return anterior;
	}



	public void setAnterior(Aluno anterior) {
		this.anterior = anterior;
	}
	
}


