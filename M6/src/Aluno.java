
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Aluno {
	private int numero;
	private String nome;
	
	public Aluno(int numero, String nome) {
		this.numero = numero;
		this.nome = nome;
	}

	public int getNumero() {
		return numero;
	}

	public String getNome() {
		return nome;
	}

	@Override
	public String toString() {
		return numero + " " + nome;
	}
	
	public static List<Aluno> lerAlunos(String fn) {
		List<Aluno> lista = new ArrayList<Aluno>();
		
		try {
			Scanner readingChannel = new Scanner(new File(fn));
			
			while (readingChannel.hasNext()) {
				String line = readingChannel.nextLine();
			
				Scanner lineScanner = new Scanner(line);
				
				String num = lineScanner.next(); //3
				String name = lineScanner.nextLine(); //Tito Lívio
				
				Aluno a = new Aluno(Integer.valueOf(num), name);
				lista.add(a);
				
				lineScanner.close();
			}
			readingChannel.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return lista;
	}
}
