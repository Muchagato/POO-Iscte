import java.util.Comparator;

public class CompBirthYear implements Comparator<Aluno> {

	@Override
	public int compare(Aluno o1, Aluno o2) {
		if (o1.getAnoNascimento() == o2.getAnoNascimento()) {
			if (o1.getAnoMatricula() == o2.getAnoMatricula())
				return o1.getNome().compareToIgnoreCase(o2.getNome());
			return o2.getAnoMatricula()-o1.getAnoMatricula();
		}
		return o2.getAnoNascimento()-o1.getAnoNascimento();
	}
}
