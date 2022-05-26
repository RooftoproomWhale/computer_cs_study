package Stack.Calculator;

public interface CalculatorInterface
{
    enum Type
    {
        LEFT_PARENTHESIS('('),
        RIGHT_PARENTHESIS(')'),
        PLUS('+'),MINUS('-'),
        MULTIPLY('*'),DIVIDE('/'),
        SPACE(' ');

        final private char operator;
        Type(char c) {
            this.operator = c;
        }

        public char getOperator() {
            return operator;
        }
    }

    int isNumber(char c);
    int getNextToken();
    int isPrior(char operator1, char operator2);
    String getPostFix(String infix);
    double Calculate(String Postfix);
}
