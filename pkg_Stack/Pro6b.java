package pkg_Stack;

public class Pro6b
{
    public static void main(String[] args)
    {
        fixed_stk f = new fixed_stk(4);

        System.out.print("\nFixed stack : ");
        f.push(2);
        f.push(4);
        f.push(6);
        f.push(8);
        f.push(10);

        System.out.print("\n\t\t\t"+f.pop());
        System.out.print("\n\t\t\t"+f.pop());
        System.out.print("\n\t\t\t"+f.pop());
        System.out.print("\n\t\t\t"+f.pop());
        System.out.print("\n\t\t\t"+f.pop());

        System.out.print("\n\nGrowable stack : ");
        growable_stk g = new growable_stk(5);

        g.push(1);
        g.push(3);
        g.push(5);
        g.push(7);
        g.push(9);
        g.push(11);

        System.out.print("\n\t\t\t"+g.pop());
        System.out.print("\n\t\t\t"+g.pop());
        System.out.print("\n\t\t\t"+g.pop());
        System.out.print("\n\t\t\t"+g.pop());
        System.out.print("\n\t\t\t"+g.pop());
        System.out.print("\n\t\t\t"+g.pop());
    }
}