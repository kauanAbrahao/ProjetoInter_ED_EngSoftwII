package aluno;

public class Aluno {
	private String nome;
	private String curso;
	private int id;
	private double nota;
	Aluno proximo;
	Aluno anterior;
	// Temos que definir quais atributos o Objeto Aluno ter�.



//	M�todos get e set
	
	
	public String getNome() {
		return nome;
	}



	public String getCurso() {
		return curso;
	}



	public void setCurso(String curso) {
		this.curso = curso;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public double getNota() {
		return nota;
	}



	public void setNota(double nota) {
		this.nota = nota;
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


