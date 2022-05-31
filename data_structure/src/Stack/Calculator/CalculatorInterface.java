package Stack.Calculator;

public interface CalculatorInterface
{
    boolean isNumber(char c);
    int getNextToken();
    boolean isPrior(char operator1, char operator2);
    String getPostFix(String infix);
    double Calculate(String Postfix);
}
