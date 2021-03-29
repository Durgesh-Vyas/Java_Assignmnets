//Program for add, sub, div, multi, sq., sq. root, power, mean, GCD

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

class Calculator
{
    static int res, a, b, n, sum = 0;
    static float div;

    static BufferedReader data = new BufferedReader(new InputStreamReader(System.in));

    public static void Add() throws IOException
    {
        System.out.print("\nEnter 1st number : ");
        a = Integer.parseInt(data.readLine());
        System.out.print("Enter 2nd number : ");
        b = Integer.parseInt(data.readLine());
        res = (a+b);
        System.out.println("\t\tAddition of "+a+" and "+b+" is "+res+".\n");
    }


    public static void Sub() throws IOException
    {
        System.out.print("\nEnter 1st number : ");
        a = Integer.parseInt(data.readLine());
        System.out.print("Enter 2nd number : ");
        b = Integer.parseInt(data.readLine());
        res = (a-b);
        System.out.println("\t\tSubtraction of "+a+" and "+b+" is "+res+".\n");
    }


    public static void Multi() throws IOException
    {
        System.out.print("\nEnter 1st number : ");
        a = Integer.parseInt(data.readLine());
        System.out.print("Enter 2nd number : ");
        b = Integer.parseInt(data.readLine());
        res = (a*b);
        System.out.println("\t\tMultiplication of "+a+" and "+b+" is "+res+".\n");
    }


    public static void Div() throws IOException
    {
        System.out.print("\nEnter 1st number : ");
        a = Integer.parseInt(data.readLine());
        System.out.print("Enter 2nd number : ");
        b = Integer.parseInt(data.readLine());
        div = (a/(float)b);
        System.out.println("\t\tDivision of "+a+" and "+b+" is "+div+".\n");
    }


    public static void Square() throws IOException
    {
        System.out.print("\nEnter the number : ");
        a = Integer.parseInt(data.readLine());
        res = a*a;
        System.out.println("\t\t Square of "+a+" is : "+res);
    }


    public static void Mean()
    {
        String data;
        int count = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("\nEnter end after entering all number.");
        System.out.println("Enter the number you want : ");
        while (true)
        {
            data = sc.nextLine();
            if(data.equals("end"))
                break;
            else
            {
                n = Integer.parseInt(data);
                sum = sum + n;
                count = count + 1;
            }
        }

        System.out.println("Mean of the given numbers is : "+sum/(float)count);
    }


    public static int findGCD(int a1, int b1)
    {
        if(a1 == 0)
            return b1;
        if(b1 == 0)
            return a1;
        if(a1 == b1)
            return a1;
        if(a1 > b1)
            return findGCD((a1-b1), b1);
            return findGCD(a1, (b1 - a1));
    }


    public static void GCD() throws IOException
    {

        System.out.print("\nEnter 1st number : ");
        a = Integer.parseInt(data.readLine());
        System.out.print("Enter 2nd number : ");
        b = Integer.parseInt(data.readLine());
        System.out.println("\t\tGCD of "+a+" and "+b+" is : "+findGCD(a,b));
    }
}

public class Pro1b
{
    static int n, a, b;

    public static void main(String[] args)
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);

        try
        {
            while (true)
            {
                System.out.println("\n\tThese are your options : ");
                System.out.println("1) Addition of 2 numbers ");
                System.out.println("2) Subtraction of 2 numbers ");
                System.out.println("3) Multiplication of 2 numbers ");
                System.out.println("4) Division of 2 numbers ");
                System.out.println("5) Square of a number ");
                System.out.println("6) Square  root of a number ");
                System.out.println("7) Power ");
                System.out.println("8) Mean ");
                System.out.println("9) GCD of 2 numbers ");
                System.out.println("10) Exit the program ");
                System.out.print("\t\tPlease enter your choice : ");
                n = sc.nextInt();

                switch (n)
                {
                    case 1: //Addition of 2 numbers
                    {
                        Calculator.Add();
                        break;
                    }

                    case 2: //Subtraction of 2 numbers
                    {
                        Calculator.Sub();
                        break;
                    }

                    case 3: //Multiplication of 2 numbers
                    {
                        Calculator.Multi();
                        break;
                    }

                    case 4: //Division of 2 numbers
                    {
                        Calculator.Div();
                        break;
                    }

                    case 5: //Square of a number
                    {
                        Calculator.Square();
                        break;
                    }

                    case 6: //Square root of a number
                    {
                        System.out.print("\nEnter number whose square root you want to calculate : ");
                        a = Integer.parseInt(in.readLine());
                        System.out.println("\t\tSquare root of "+a+" is : "+Math.sqrt(a)+".\n");
                        break;
                    }

                    case 7: //Power
                    {
                        System.out.print("\nEnter base : ");
                        a = Integer.parseInt(in.readLine());
                        System.out.print("Enter power : ");
                        b = Integer.parseInt(in.readLine());
                        System.out.println("\t\t"+a+"^"+b+" is "+Math.pow(a,b)+".\n");
                        break;
                    }

                    case 8: //Mean
                    {
                        Calculator.Mean();
                        break;
                    }

                    case 9: //GCD of two numbers
                    {
                        Calculator.GCD();
                        break;
                    }

                    case 10: // Exit
                    {
                        System.out.println("Thank You!");
                        System.exit(0);
                    }

                    default:
                        System.out.println("Please enter correct option.");
                }
            }
        }

        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }

    }
}