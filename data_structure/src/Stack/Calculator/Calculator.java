package Stack.Calculator;

import Stack.LinkedList.LinkedListStack;

import static Stack.Calculator.CalculatorInterface.Type.*;

public class Calculator implements CalculatorInterface
{
    char[] Numbers = {'0','1','2','3','4','5','6','7','8','9','.'};

    @Override
    public boolean isNumber(char c) {

        for (char number : Numbers) {
            if (number == c) return true;
        }

        return false;
    }

    @Override
    public int getNextToken(String expression) {
        int i = 0;

        for(i = 0; )
        {

        }

        return 0;
    }

    public int getPriority(char operator, boolean inStack)
    {
        int priority = -1;
        if (operator == LEFT_PARENTHESIS.getOperator())
        {
            priority = inStack ? 3 : 0;
        }
        else if (operator == MULTIPLY.getOperator() || operator == DIVIDE.getOperator())
        {
            priority = 1;
        }
        else if (operator == PLUS.getOperator() || operator == MINUS.getOperator())
        {
            priority = 2;
        }

        return priority;
    }

    @Override
    public boolean isPrior(char operatorInStack, char operatorInToken)
    {
        return getPriority(operatorInStack, true) > getPriority(operatorInToken, false);
    }

    @Override
    public String getPostFix(String infix)
    {
        StringBuilder sbPostfix = new StringBuilder();
        LinkedListStack<Character> stack = new LinkedListStack<Character>();

        for (char c : infix.toCharArray())
        {
            if(c == RIGHT_PARENTHESIS.getOperator())
            {
                while(!stack.isEmpty())
                {
                    Character popped = stack.pop().getData();
                    if(LEFT_PARENTHESIS.getOperator() == popped)
                    {
                        break;
                    }
                    else
                    {
                        sbPostfix.append(popped);
                    }
                }
            }
            else if (Type.equals(c))
            {
                while(!stack.isEmpty() && !isPrior(stack.top().getData(),c))
                {
                    Character popped = stack.pop().getData();
                    if(popped != LEFT_PARENTHESIS.getOperator())
                        sbPostfix.append(popped);
                }
                stack.push(c);
            }
            else
            {
                sbPostfix.append(c);
                sbPostfix.append(" ");
            }
        }

        return sbPostfix.toString();
    }

    @Override
    public double Calculate(String postFix)
    {
        LinkedListStack<Character> stack = new LinkedListStack<Character>();
        double result = 0;
        for (char c : postFix.toCharArray())
        {
            if(c == ' ') continue;
            if(Type.equals(c))
            {
                double operator1, operator2, tempResult = 0;

                operator2 = stack.pop().getData();
                operator1 = stack.pop().getData();

                if(PLUS.getOperator() == c) tempResult = operator1 + operator2;
                else if(MINUS.getOperator() == c) tempResult = operator1 - operator2;
                else if(MULTIPLY.getOperator() == c) tempResult = operator1 * operator2;
                else if(DIVIDE.getOperator() == c) tempResult = operator1 / operator2;

                stack.push((char) tempResult);
            }
            else
            {
                stack.push(c);
            }
        }

        return stack.pop().getData();
    }
}
