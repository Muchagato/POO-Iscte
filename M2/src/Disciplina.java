import java.util.List;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Disciplina {

	private static final int NA = -1;
	private String nome;
	private String sigla;
	private int capacidade;
	private List<Inscricao> inscricoes = new ArrayList<Inscricao>();

	public Disciplina(String nome, String sigla, int capacidade) {
		super();
		this.nome = nome;
		this.sigla = sigla;
		this.capacidade = capacidade;
	}

	public String getNome() {
		return nome;
	}

	public String getSigla() {
		return sigla;
	}

	public int getCapacidade() {
		return capacidade;
	}

	public void inscrever(Aluno a) {
		Inscricao i = new Inscricao(a, NA);
		inscricoes.add(i);

	}

	public void desinscrever(int numero) {
		Inscricao i = procurarPorNumero(numero);
		if (i != null)
			inscricoes.remove(i);
	}

	private Inscricao procurarPorNumero(int numero) {
		for (Inscricao i : inscricoes)
			if (i.getAluno().getNumero() == numero)
				return i;
		return null;
	}

	@Override
	public String toString() {
		return "Disciplina [nome=" + nome + ", sigla=" + sigla + ", capacidade=" + capacidade + ", inscricoes="
				+ inscricoes + "]";
	}

	public void lancarNota(int numero, int nota) {
		Inscricao i = procurarPorNumero(numero);
		if (i != null)
			i.setNota(nota);
	}

	public boolean temNota(int numero) {
		Inscricao i = procurarPorNumero(numero);
		return i != null && i.getNota() != NA;
	}

	public int obterNota(int numero) {
		Inscricao i = procurarPorNumero(numero);
		if (temNota(numero))
			return i.getNota();
		return NA;
	}

	public double notaMedia() {
		double acum = 0;
		int totalNotas = 0;
		for (Inscricao i : inscricoes) {
			if (temNota(i.getAluno().getNumero())) {
				acum += i.getNota();
				totalNotas++;
			}
		}
		return acum / totalNotas;
	}

	public Aluno[] melhoresAlunos() {
		if (inscricoes.size() == 0)
			return new Aluno[0];
		// Nota Máxima
		int max = 0;
		for (Inscricao i : inscricoes) {
			if (i.getNota() > max)
				max = i.getNota();
		}

		List<Aluno> listaMelhores = new ArrayList<Aluno>();
		for (Inscricao i : inscricoes) {
			if (i.getNota() == max)
				listaMelhores.add(i.getAluno());
		}
		Aluno[] melhores = new Aluno[listaMelhores.size()];
		return listaMelhores.toArray(melhores);
	}

	public static Disciplina lerDisciplina(String disc, String est) {
		try {
			Scanner readingChannel = new Scanner(new File(disc));
			String nome = readingChannel.nextLine();
			String sigla = disc.replace(".txt", "");
			int capacidade = 50;
			Disciplina d = new Disciplina(nome, sigla, capacidade);
			
			List<Aluno> alunos = Aluno.lerAlunos(est);
			
			int numAluno = Integer.parseInt(readingChannel.next());
			for (Aluno aluno : alunos) {
				if (numAluno == aluno.getNumero()) {
					d.inscrever(aluno);
					d.lancarNota(numAluno, d.getNotaFromFile(readingChannel.next()));
					if (!readingChannel.hasNext()) {
						readingChannel.close();
						break;
					}
					numAluno = Integer.parseInt(readingChannel.next());
				}
			}
			return d;
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	private int getNotaFromFile(String s) {
		if (s.equals("NA"))
			return NA;
		else
			return Integer.parseInt(s);
	}
	
	public void writeToFile(String fn) {
		try {
			PrintWriter writer = new PrintWriter(new File(fn));
			writer.println(nome);
			for (Inscricao inscricao : inscricoes) {
				writer.print(inscricao.getAluno().getNumero() + " ");
				if (inscricao.getNota() == -1)
					writer.println("NA");
				else
					writer.println(inscricao.getNota());
			}
			writer.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
}