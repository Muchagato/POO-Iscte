
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public abstract class LineObjectReader<T> {
	private File file;
	
	public LineObjectReader(File file) {
		this.file = file;
	}
	
	public List<T> read() throws FileNotFoundException {
		List<T> list = new ArrayList<>();
		Scanner s = new Scanner(file);
		while (s.hasNextLine())
			list.add(createObject(s.nextLine()));
		s.close();
		return list;
	}
	
	public abstract T createObject(String file);
	
	public static void main(String[] args) {
		File file = new File("estudantes.txt");
		LineObjectReader<Aluno> aReader = new AlunoReader(file);
		List<Aluno> list;
		try {
			list = aReader.read();
			for (Aluno aluno : list) {
				System.out.println(aluno);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}
}
