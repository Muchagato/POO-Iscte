import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class ExpressionEvaluator {
	private List<BinaryOperator> operators;
	
	public ExpressionEvaluator(List<BinaryOperator> operators) {
		this.operators = operators;
	}

	public static void main(String[] args) {
		List<BinaryOperator> operators = new ArrayList<>();
		operators.add(new Addition());
		operators.add(new Power());
		ExpressionEvaluator calc = new ExpressionEvaluator(operators);
		String[] expression = {"(", "(", "2", "^", "8", ")", "+", "2", ")"};
		
		int r = calc.evaluate(expression);
		System.out.println(r); // 258
	}

	private int evaluate(String[] args) {
		Stack<Integer> valStack = new Stack<>();
		Stack<String> opStack = new Stack<>();
		for (int i = 0; i < args.length; i++) {
			if (!args[i].equals("(")) {
				if (isInteger(args[i]))
					valStack.push(Integer.parseInt(args[i]));
				else if (args[i].equals(")")) {
					int a = valStack.pop();
					int b = valStack.pop();
					String topOp = opStack.pop();
					for (BinaryOperator operator : operators) {
						if (operator.getSymbol().equals(topOp))
							valStack.push(operator.calculate(a, b));
					}
				}
				else
					opStack.push(args[i]);
			}
		}
		return valStack.firstElement();
	}
	
    private static boolean isInteger(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) < '0' || str.charAt(i) > '9')
                return false;
        }
        return true;
    }
}
