public class Inscricao {
	private Aluno aluno;
	private int nota;
	
	public Inscricao(Aluno aluno, int nota) {
		this.aluno = aluno;
		this.nota = nota;
	}

	public Aluno getAluno() {
		return aluno;
	}

	public int getNota() {
		return nota;
	}

	@Override
	public String toString() {
		return "Inscricao [aluno=" + aluno + ", nota=" + nota + "]";
	}

	public void setNota(int nota) {
		this.nota = nota;
	}

	
}
