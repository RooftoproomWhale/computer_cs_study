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
        public static boolean equals(char c)
        {
            for (Type t : Type.values())
            {
                if(t.getOperator() == c) return true;
            }
            return false;
        }


    }

    boolean isNumber(char c);
    int getNextToken();
    boolean isPrior(char operator1, char operator2);
    String getPostFix(String infix);
    double Calculate(String Postfix);
}
