package Stack.Calculator;

public enum Type
{
    LEFT_PARENTHESIS("("),
    RIGHT_PARENTHESIS(")"),
    PLUS("+"),MINUS("-"),
    MULTIPLY("*"),DIVIDE("/");
    //SPACE(' ');

    final private String operator;
    Type(String c) {
        this.operator = c;
    }

    public String getOperator() {
        return operator;
    }
    public static boolean equals(String s)
    {
        for (Type t : Type.values())
        {
            if(t.getOperator().equals(s)) return true;
        }
        return false;
    }


}
