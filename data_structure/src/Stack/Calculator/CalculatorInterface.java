package Stack.Calculator;

public interface CalculatorInterface
{
    boolean isNumber(String c);
    int getNextToken(String expression, int beginIndex);
    boolean isPrior(String operator1, String operator2);
    String getPostFix(String infix);
    double Calculate(String Postfix);
}
