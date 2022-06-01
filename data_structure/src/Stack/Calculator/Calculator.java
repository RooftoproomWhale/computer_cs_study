package Stack.Calculator;

import Stack.LinkedList.LinkedListStack;

import static Stack.Calculator.Type.*;

public class Calculator implements CalculatorInterface
{
    String[] Numbers = {"0","1","2","3","4","5","6","7","8","9","."};

    @Override
    public boolean isNumber(String c) {

        for (String number : Numbers) {
            if (number.equals(c)) return true;
        }

        return false;
    }

    @Override
    public int getNextToken(String expression, int beginIndex) {

        for(int i = beginIndex + 1; i < expression.length(); i++)
        {
            if(!Type.equals(String.valueOf(expression.charAt(beginIndex))))
            {
                if (Type.equals(String.valueOf(expression.charAt(i))) || expression.charAt(i) == ' ')
                {
                    return i;
                }
            }
            else
            {
                return beginIndex + 1;
            }

        }


        return expression.length();
    }

    public int getPriority(String operator, boolean inStack)
    {
        int priority = -1;
        if (operator.equals(LEFT_PARENTHESIS.getOperator()))
        {
            priority = inStack ? 3 : 0;
        }
        else if (operator.equals(MULTIPLY.getOperator()) || operator.equals(DIVIDE.getOperator()))
        {
            priority = 1;
        }
        else if (operator.equals(PLUS.getOperator()) || operator.equals(MINUS.getOperator()))
        {
            priority = 2;
        }

        return priority;
    }

    @Override
    public boolean isPrior(String operatorInStack, String operatorInToken)
    {
        return getPriority(operatorInStack, true) > getPriority(operatorInToken, false);
    }

    @Override
    public String getPostFix(String infix)
    {
        StringBuilder sbPostfix = new StringBuilder();
        LinkedListStack<String> stack = new LinkedListStack<String>();
        int beginIndex = 0, endIndex;

        //for (char c : infix.toCharArray())
        while(beginIndex < infix.length())
        {
            endIndex = getNextToken(infix, beginIndex);
            String token = infix.substring(beginIndex, endIndex);

            beginIndex = endIndex;
            if(token.equals(RIGHT_PARENTHESIS.getOperator()))
            {
                while(!stack.isEmpty())
                {
                    String popped = stack.pop().getData();
                    if(LEFT_PARENTHESIS.getOperator().equals(popped))
                    {
                        break;
                    }
                    else
                    {
                        sbPostfix.append(popped);
                    }
                }
            }
            else if (Type.equals(token))
            {
                while(!stack.isEmpty() && !isPrior(stack.top().getData(),token))
                {
                    String popped = stack.pop().getData();
                    if(!popped.equals(LEFT_PARENTHESIS.getOperator()))
                        sbPostfix.append(popped);
                }
                stack.push(token);

            }
            else
            {
                sbPostfix.append(token);
                sbPostfix.append(" ");
            }
        }
        while(stack.getSize() > 0)
        {
            sbPostfix.append(stack.pop().getData());
        }
        return sbPostfix.toString();
    }

    @Override
    public double Calculate(String postFix)
    {
        LinkedListStack<Double> stack = new LinkedListStack<Double>();
        double result = 0;
        int beginIndex = 0, endIndex;

        while(beginIndex < postFix.length())
        {
            endIndex = getNextToken(postFix, beginIndex);
            String token = postFix.substring(beginIndex, endIndex);
            System.out.println(token);
            beginIndex = endIndex;
            if(token.equals(" ")) continue;
            if(Type.equals(token))
            {
                double operator1, operator2, tempResult = 0;

                operator2 = stack.pop().getData();
                operator1 = stack.pop().getData();

                if(PLUS.getOperator().equals(token)) tempResult = operator1 + operator2;
                else if(MINUS.getOperator().equals(token)) tempResult = operator1 - operator2;
                else if(MULTIPLY.getOperator().equals(token)) tempResult = operator1 * operator2;
                else if(DIVIDE.getOperator().equals(token)) tempResult = operator1 / operator2;

                stack.push(tempResult);
            }
            else
            {

                stack.push(Double.valueOf(token));
            }
        }

        return stack.pop().getData();
    }
}
