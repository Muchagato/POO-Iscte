
import java.io.File;
import java.util.Scanner;

public class AlunoReader extends LineObjectReader<Aluno> {

	public AlunoReader(File file) {
		super(file);
	}

	@Override
	public Aluno createObject(String file) {
		Scanner s = new Scanner(file);
		int numero = s.nextInt();
		String nome = s.nextLine();
		s.close();
		return new Aluno(numero, nome);
	}

}
