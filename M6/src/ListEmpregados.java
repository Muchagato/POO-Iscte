import java.util.ArrayList;
import java.util.List;

public class ListEmpregados {
	private List<Empregado> list = new ArrayList<>();
	
	public void addEmpregado(Empregado e) {
		list.add(e);
	}
	
	public void removeEmpregado(Empregado e) {
		list.remove(e);
	}
	
	public double salarioTotal() {
		double total = 0;
		for (Empregado e : list)
			total += e.getSalario();
		return total;
	}
	
	public static void main(String[] args) {
		Diretor a = new Diretor();
		Gerente b = new Gerente();
		Empregado c = new Empregado();
		ListEmpregados list = new ListEmpregados();
		list.addEmpregado(a);
		a.setLucroMensal(10000); // 2*800+0.01*10000 = 1700
		list.addEmpregado(b); 
		b.setSaleGoals(true); // 800+200 = 1000
		list.addEmpregado(c); // 800
		
		System.out.println(list.salarioTotal()); // 1700 + 1000 + 800 = 3500
	}
}
