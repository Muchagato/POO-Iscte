
public class Addition implements BinaryOperator {

	@Override
	public String getSymbol() {
		return "+";
	}

	@Override
	public int calculate(int a, int b) {
		return a + b;
	}
	

}
