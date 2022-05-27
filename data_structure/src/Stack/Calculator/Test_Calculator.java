package Stack.Calculator;

public class Test_Calculator
{
    public static void main(String[] args)
    {
        Calculator calculator = new Calculator();

        String postfix = calculator.getPostFix("1+3.334/(4.28*(110-7729))");
        System.out.println(postfix);
        String result = String.valueOf(calculator.Calculate(postfix));
        System.out.println(result);
    }

}
