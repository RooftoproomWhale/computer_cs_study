package Stack.LinkedList;

public class Test_LinkedListStack
{
    public static void main(String[] args)
    {
        int count = 0;

        LinkedListStack<String> stack = new LinkedListStack<>();

        stack.push("abc");
        stack.push("def");
        stack.push("efg");
        stack.push("hij");

        count = stack.getSize();
        System.out.println("Size: " + count + ", Top: " + stack.top().getData());

        for (int i = 0; i < count; i++)
        {
            if(stack.isEmpty())
                break;

            System.out.print("popped: " + stack.pop().getData());

            if(!stack.isEmpty())
                System.out.println(", Current Top: " + stack.top().getData());
            else
                System.out.println(", Stack is Empty.");
        }
    }
}
