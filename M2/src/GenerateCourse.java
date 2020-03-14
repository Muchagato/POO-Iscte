import java.util.List;

public class GenerateCourse {

	public static void main(String[] args) {
		String initials = getInitials(args[0]);
		Disciplina d = new Disciplina(args[0], initials, 50);
		List<Aluno> estudantes = Aluno.lerAlunos(args[1]);
		for (Aluno aluno : estudantes) {
			d.inscrever(aluno);
		}
		
		d.writeToFile(initials + ".txt");
	}

	private static String getInitials(String s) {
		String[] words = s.split(" ");
		String initials = "";
		for (int i = 0; i < words.length; i++) {
			if (words[i].charAt(0) == words[i].toUpperCase().charAt(0))
				initials += words[i].charAt(0);
		}
		return initials;
	}
	
}
