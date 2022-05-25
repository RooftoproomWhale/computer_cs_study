package Stack.Array;

public class Test_ArrayStack
{
    public static void main(String[] args)
    {
        ArrayStack<Integer> arrayStack = new ArrayStack<>(10);

        arrayStack.push(3);
        arrayStack.push(37);
        arrayStack.push(11);
        arrayStack.push(12);

        System.out.println("Capacity : " + arrayStack.getCapacity() +
                ", Size: " + arrayStack.getSize() +
                ", Top: " + arrayStack.top());

        for (int i = 0; i < 4; i++)
        {
            if(arrayStack.isEmpty())
                break;

            System.out.print("Popped: " + arrayStack.pop());

            if(!arrayStack.isEmpty())
                System.out.println(", Current Top: " + arrayStack.top());
            else
                System.out.println(", Stack is Empty");
        }
    }
}
