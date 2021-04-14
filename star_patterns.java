import java.util.*;

public class star_patterns
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int size;

        System.out.print("Enter the size : ");
        size = sc.nextInt();

        for(int i = 0; i < size; i++)
        {
            for(int j = 0; j <= i; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("=========================================================\n");

        for(int i = 0; i <= 4; i++)
        {
            for(int j = 4; j >= i; j--)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("=========================================================\n");

        for(int i = 0; i <= 4; i++)
        {
            for(int j = 0; j <= i; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i = 0; i < 4; i++)
        {
            for(int j = 3; j >= i; j--)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("=========================================================\n");

        for(int i = 0; i < 4; i++)
        {
            for(int j = 4; j >= i; j--)
            {
                System.out.print(" ");
            }
            for(int k = 0; k <= i; k++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}