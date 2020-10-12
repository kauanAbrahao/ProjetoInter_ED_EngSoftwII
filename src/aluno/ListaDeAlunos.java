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
	
	//Por enquanto, só coloquei o nome para cada Aluno. 
	public void inserirInicio(String nome) {
		Aluno novoaluno = new Aluno();
		novoaluno.setNome(nome);
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
	public void inserirFim(String nome) {
		Aluno novoaluno = new Aluno();
		novoaluno.setNome(nome);
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
			return out; 
		}
		
	}
	
//	-------------------------------------------------------------------
	public void inserirPosicao(String nome, int pos) { //BUGADO - POINTERS NÃO ESTÃO CERTOS!!!
		if (pos <= 0) {
			inserirInicio(nome);
		} else if (pos >= tamanho) {
			inserirFim(nome);
		} else {
			Aluno aux = inicio;
			Aluno aux2 = aux;
			for(int i = 0; i < pos-1; i++) {
				aux = aux.getProximo();
			}
			Aluno novoaluno = new Aluno();
			novoaluno.setNome(nome);
			novoaluno.setAnterior(aux);
			novoaluno.setProximo(aux.getProximo());
			aux.setProximo(novoaluno);
			aux2 = novoaluno.getProximo();
			aux2.setProximo(novoaluno);
			tamanho++;
		}
	}
	
//	-----------------------------------------------------------
	public String mostraLista() {
		String r = "";
		Aluno aux = inicio;
		while (aux != null){
			r = r + "\n" + aux.getNome();
			aux = aux.getProximo();
		}
		return r;
	}
	
	
}
