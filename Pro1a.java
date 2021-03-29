import java.io.*;
import java.util.Scanner;

public class Pro1a
{
    public static void fibonacci(int k)
    {
        int  sum, i, a = 0, b = 1;

        if (k == 0)
        System.out.println("First terms of Fibonacci series is : " + a);
        else if (k > 1)
        {
            System.out.println("First " + k + " terms of Fibonacci series are: ");
            for (i = 0; i < k; i++)
            {
                System.out.print(a+"   ");
                sum = a + b;
                a = b;
                b = sum;
            }
        }
        else
            {
                System.out.println("Enter positive number.");
            }

    }
    public static void main(String[] args)
    {
        InputStreamReader rd = new InputStreamReader(System.in);
        DataInputStream in = new DataInputStream(System.in);

        int n ;
        Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(rd);
        Console c = System.console();
        String ch, username;

        try
        {
            System.out.print("Enter username : ");
            username = br.readLine();

            System.out.print("Please enter the password : ");
            char[] password = c.readPassword();
            String pass = String.valueOf(password);

            System.out.println("Welcome "+username);
            if(pass.equals("Create159!#"))
            {
                do
                {
                    System.out.println("\nEnter the length of fibonacci series ");
                    n = sc.nextInt();
                    fibonacci(n);
                    System.out.println("\n\nDo you want you continue? Y or N");
                    ch = in.readLine();
                }while (!"N".equals(ch));
            }
            else
            {
                System.out.print("Sorry wrong password entered.");
            }

        }

        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }

    }
}