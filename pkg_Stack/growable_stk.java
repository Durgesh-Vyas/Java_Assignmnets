package pkg_Stack;

import java.util.stream.IntStream;

public class growable_stk implements IntStack
{
    private int[] stk;
    private int top;

    growable_stk(int size)
    {
        stk = new int[size];
        top = -1;
    }

    public void push(int item)
    {
        if(top == (stk.length - 1))
        {
            System.out.print("Stack Overflown!");

            int[] t = new int[(stk.length * 2)];

            IntStream.range(0, stk.length).forEach(i -> t[i] = stk[i]);

            stk = t;
        }
        stk[++top] = item;
    }

    public int pop()
    {
        if(top < 0)
        {
            System.out.print("Stack Underflow!");
            return 0;
        }
        else
            return stk[top--];
    }
}