import java.util.Stack;

public class ExpressionEvaluator {

    public static void main(String[] args) {
        Stack<Integer> val = new Stack<>();
        Stack<String> op = new Stack<>();

        for (int i = 0; i <  args.length; i++) {
            if (!args[i].equals("(")) {
                if (StringToInt.isInteger(args[i]))
                    val.push(StringToInt.parseInt(args[i]));
                else if (args[i].equals(")")) {
                    int a = val.pop();
                    int b = val.pop();
                    String topOp = op.pop();
                    if (topOp.equals("+"))
                        val.push(a + b);
                    else if (topOp.equals("-"))
                        val.push(a - b);
                    else if (topOp.equals("/"))
                        val.push(a / b);
                    else if (topOp.equals("x"))
                        val.push(a * b);
                } else
                    op.push(args[i]);
            }
        }
        System.out.println(val.firstElement());
    }

}
