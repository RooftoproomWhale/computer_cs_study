package Stack.Calculator;

public class Calculator implements CalculatorInterface
{
    @Override
    public int isNumber(char c) {
        return 0;
    }

    @Override
    public int getNextToken() {
        return 0;
    }

    public int getPriority(char operator)
    {

    }

    @Override
    public int isPrior(char operator1, char operator2) {
        return 0;
    }

    @Override
    public String getPostFix(String infix) {
        return null;
    }

    @Override
    public double Calculate(String postFix)
    {
        for (char c : postFix.toCharArray())
        {

        }
    }
}
