package aluno;

public class ListaDeAlunos {
	Aluno inicio;
	Aluno fim;
	int tamanho;
	
	public boolean isEmpty() {
		if (tamanho == 0) {
			return true;
		}
		else {
			return false;
		}
	}
	
//	----------------------------------------------------------------------
	
	//Por enquanto, só coloquei o nome para cada Aluno. 
	public void inserirInicio(String nome) {
		Aluno novoaluno = new Aluno();
		novoaluno.setNome(nome);
		novoaluno.anterior = null;
		novoaluno.setProximo(inicio);
		
		if (inicio != null) {
			inicio.setAnterior(novoaluno);
		}
		
		if (isEmpty()) {
			fim = inicio;
		}
		tamanho++;
	}
	
//	--------------------------------------------------------------------
	
	public String retirarInicio() {
		if (isEmpty()) {
			return "Lista vazia, não há elementos para serem retirados";
		}
		String out = inicio.getNome();
		inicio.setAnterior(inicio.getProximo());
		if (inicio != null) {
			inicio.setAnterior(null);
		}
		else {
			fim = null;
		}
		tamanho--;
		return out;
	}
//	---------------------------------------------------------------------
	//Por enquanto, só coloquei o nome para cada Aluno.
	public void inserirFim(String nome, int id) {
		Aluno novoaluno = new Aluno();
		novoaluno.setNome(nome);
		novoaluno.setProximo(null);
		novoaluno.setAnterior(fim);
		
		if(isEmpty()) {
			inicio = fim;
		}
		else {
			fim.setProximo(novoaluno);
		}
		fim = novoaluno;
		tamanho++;
		
	}
	
//	----------------------------------------------------------------------
}
