import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

@SuppressWarnings("unused")
public class Aluno {
	private int numero;
	private String nome;
	private int anoMatricula;
	private int anoNascimento;
	
	public Aluno(int numero, String nome, int anoMatricula, int anoNascimento) {
		this.numero = numero;
		this.nome = nome;
		this.anoMatricula = anoMatricula;
		this.anoNascimento = anoNascimento;
	}
	
	public int getNumero() {
		return numero;
	}
		
	public String getNome() {
		return nome;
	}
		
	public int getAnoMatricula() {
		return anoMatricula;
	}
		
	public int getAnoNascimento() {
		return anoNascimento;
	}


	// test function
	public static void main(String[] args) {
		Aluno a1 = new Aluno(1, "Zé", 2019, 2000);
		Aluno a2 = new Aluno(2, "Tiago", 2018, 2000);
		Aluno a3 = new Aluno(3, "Gonçalo", 2020, 2002);
		Aluno a4 = new Aluno(4, "Daniel", 2017, 1998);
		
		Aluno[] array = {a3, a2, a1, a4};
		
		Comparator<Aluno> compNum = new CompNum();
		Comparator<Aluno> compName = new CompName();
		Comparator<Aluno> compBYear = new CompBirthYear();
		
//		Arrays.sort(array, compNum);
//		Arrays.sort(array, compName);
		Arrays.sort(array, compBYear);
			
		for (int i = 0; i < array.length; i++)
			System.out.println(array[i]);
		
//		ArrayList<Aluno> list = new ArrayList<>(Arrays.asList(array));
//		list.sort(compName);
//		System.out.println(list);
	}

	@Override
	public String toString() {
		return "Aluno [numero=" + numero + ", nome=" + nome + ", anoMatricula=" + anoMatricula + ", anoNascimento="
				+ anoNascimento + "]";
	}
}
