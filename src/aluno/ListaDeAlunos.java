package aluno;

//Lista duplamente encadeada de alunos
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
	
 
	public void inserirInicio(String nome, String curso, int id) {
		Aluno novoaluno = new Aluno();
		
//		Atribuição de nome, curso e id ao aluno
		novoaluno.setNome(nome);
		novoaluno.setCurso(curso);
		novoaluno.setId(id);
		
		novoaluno.anterior = null;
		novoaluno.setProximo(inicio);
		
		if (inicio != null) {
			inicio.setAnterior(novoaluno);
		}
		inicio = novoaluno;
		if (isEmpty()) {
			fim = inicio;
		}
		tamanho++;
	}
	
//	--------------------------------------------------------------------
	
	public String removerInicio() {
		if (isEmpty()) {
			return "Lista vazia, não há elementos para serem retirados";
		}
		String out = inicio.getNome();
		inicio = inicio.getProximo();
		if (inicio != null) {
			inicio.setAnterior(null);
		}
		else {
			fim = null;
		}
		tamanho--;
		return "removido: " + out;
	}
//	---------------------------------------------------------------------
	
	public void inserirFim(String nome, String curso, int id) {
		Aluno novoaluno = new Aluno();
		
//		Atribuição de nome, curso e id ao aluno
		novoaluno.setNome(nome);
		novoaluno.setCurso(curso);
		novoaluno.setId(id);
		
		novoaluno.setProximo(null);
		novoaluno.setAnterior(fim);
		
		if (fim != null) {
			fim.setProximo(novoaluno);
		}
		fim = novoaluno;
		if (isEmpty()) {
			inicio = fim;
		}
		tamanho++;
		
	}
	
//	----------------------------------------------------------------------
	public String removerFim() {
		if (isEmpty()) {
			return "Lista vazia, não há elementos para serem retirados";
		}
		else {
			String out = fim.getNome();
			fim = fim.getAnterior();
			if (fim != null) {
				fim.setProximo(null);
			}
			else {
				inicio = null;
			}
			tamanho--;
			return "removido: " + out; 
		}
		
	}
	
//	-------------------------------------------------------------------
	public void inserirPosicao(String nome, String curso, int id, int pos) { //BUGADO - POINTERS NÃO ESTÃO CERTOS!!! ~ Arrumado
		if (pos <= 0) {
			inserirInicio(nome, curso, id);
		} else if (pos >= tamanho) {
			inserirFim(nome, curso, id);
		} else {
			Aluno aux = inicio;
			for(int i = 0; i < pos-1; i++) {
				aux = aux.getProximo();
			}
			Aluno novoaluno = new Aluno();
			
//			Atribuição de nome, curso e id ao aluno
			novoaluno.setNome(nome);
			novoaluno.setCurso(curso);
			novoaluno.setId(id);
			
			novoaluno.setAnterior(aux);
			novoaluno.setProximo(aux.getProximo());
			aux.proximo = novoaluno;
			novoaluno.proximo.anterior = novoaluno;
			tamanho++;
		}
	}
	
//	----------------------------------------------------------
		
	
//	-----------------------------------------------------------
	public String mostraLista() {
		String r = "";
		Aluno aux = inicio;
		while (aux != null){
			r = r + "\n" + "Nome: " + aux.getNome() +" | Curso: " + aux.getCurso() + " | id# " + aux.getId();
			aux = aux.getProximo();
		}
		return r;
	}
	
	
}
