package pkg_Stack;

public class fixed_stk implements IntStack
{
    private final int[] stk;
    private int top;

    fixed_stk(int size)
    {
        stk = new int[size];
        top = -1;
    }

    public void push(int item)
    {
        if(top == (stk.length - 1))
        {
            System.out.print("Stack Overflown!");
        }
        else
            stk[++top] = item;
    }

    public int pop()
    {
        if(top < 0)
        {
            System.out.print("\nStack Underflow!");
            return 0;
        }
        else
            return stk[top--];
    }
}