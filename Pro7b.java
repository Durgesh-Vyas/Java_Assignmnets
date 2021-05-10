import java.util.Scanner;

class MyExcep extends Exception
{
    String message;

    MyExcep(String str)
    {
        message = str;
    }

    @Override
    public String toString()
    {
        return ("This is a : "+message);
    }
}


public class Pro7b
{
    static void factorial(int num)
    {
        try
        {
            int a , b = 1;


            if(num >= 0 && num <= 12)
            {
                for(a = 1; a <= num ; a++)
                {
                    b = b * a;
                }
                System.out.println("Factorial of "+num+" is : " +b);
            }

            if(num < 0 || num > 12)
                throw new MyExcep("Custom Exception.\n");
        }

        catch(MyExcep excep)
        {
            System.out.print(excep);
        }

        catch(NumberFormatException n)
        {
            System.out.print("\nNumber format exception has occured!");
        }
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int[] array;
        int n = Integer.parseInt(args[0]);

        array = new int[n];

        for(int i = 0; i < n; i++)
        {
            System.out.print("\nEnter "+(i + 1)+" number : ");
            array[i] = scanner.nextInt();

            factorial(array[i]);
        }
    }
}