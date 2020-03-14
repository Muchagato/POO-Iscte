
public class Diretor extends Empregado {
	private double lucroMensal;
	
	@Override
	public double getSalario() {
		return 2*super.getSalario() + 0.01*lucroMensal;
	}
	
	public void setLucroMensal(double value) {
		lucroMensal = value;
	}

}
