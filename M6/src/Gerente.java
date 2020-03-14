
public class Gerente extends Empregado {
	private boolean metSaleGoals;
	
	@Override
	public double getSalario() {
		return getSaleGoals() ? super.getSalario()+200 : super.getSalario();
	}
	
	public void setSaleGoals(boolean value) {
		metSaleGoals = value;
	}
	
	public boolean getSaleGoals() {
		return metSaleGoals;
	}
	
}
