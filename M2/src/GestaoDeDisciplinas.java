public class GestaoDeDisciplinas {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
//		Aluno a = new Aluno(12345, "José Manuel");
//		Aluno b = new Aluno(5321, "Grande Aluno");
//		Aluno c = new Aluno(0001, "Aluno Sem Nota");
//		System.out.println(a);
//		Disciplina d = new Disciplina("Programação", "POO", 50);
//		
//		d.inscrever(a);
//		d.inscrever(b);
//		d.inscrever(c);
//		System.out.println(d);
//		
//		d.desinscrever(a.getNumero());
//		System.out.println(d);
//		
//		d.inscrever(a);
//		d.lancarNota(a.getNumero(), 15);
//		d.lancarNota(b.getNumero(), 20);
//		
//		d.temNota(a.getNumero());
//		
//		d.obterNota(a.getNumero());
//		
//		double media = d.notaMedia();
//		
//		Aluno[] melhores = d.melhoresAlunos();
		
		Disciplina discip = Disciplina.lerDisciplina("POO.txt", "Estudantes.txt");
		discip.writeToFile("POOEscritoPorMim.txt");
		
	}
	
}
