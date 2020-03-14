
public class Power implements BinaryOperator {

	@Override
	public String getSymbol() {
		return "^";
	}

	@Override
	public int calculate(int a, int b) {
		return (int) Math.pow(b, a);
	}

}
