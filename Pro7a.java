import java.util.Scanner;

class RationalNumber
{
    int result_num, result_den;
    float comp_num1, comp_num2, floating_point;

    void add(int numerator1, int denominator1, int numerator2, int denominator2)
    {
        result_num = (numerator1 * denominator2) + (numerator2 * denominator1);
        result_den = (denominator1 * denominator2);

        System.out.print("\nSum of "+numerator1+"/"+denominator1+" and "+numerator2+"/"+denominator2+" is : "+result_num+"/"+ result_den);
    }

    void sub(int numerator1, int denominator1, int numerator2, int denominator2)
    {
        result_num = (numerator1 * denominator2) - (numerator2 * denominator1);
        result_den = (denominator1 * denominator2);

        if(result_num == 0)
            System.out.print("\nSubtraction of "+numerator1+"/"+denominator1+" and "+numerator2+"/"+denominator2+" is : 0");

        else
            System.out.print("\nSubtraction of "+numerator1+"/"+denominator1+" and "+numerator2+"/"+denominator2+" is : "+result_num+"/"+ result_den);
    }

    void multi(int numerator1, int denominator1, int numerator2, int denominator2)
    {
        result_num = (numerator1 * numerator2);
        result_den = (denominator1 * denominator2);

        System.out.print("\nMultiplication of "+numerator1+"/"+denominator1+" and "+numerator2+"/"+denominator2+" is : "+result_num+"/"+ result_den);
    }

    void div(int numerator1, int denominator1, int numerator2, int denominator2)
    {
        result_num = (numerator1 * denominator2);
        result_den = (denominator1 * numerator2);

        if(result_num == result_den)
            System.out.print("\nSum of "+numerator1+"/"+denominator1+" and "+numerator2+"/"+denominator2+" is : 1");

        else
            System.out.print("\nSum of "+numerator1+"/"+denominator1+" and "+numerator2+"/"+denominator2+" is : "+result_num+"/"+ result_den);
    }

    void compare(int numerator1, int denominator1, int numerator2, int denominator2)
    {
        comp_num1 = numerator1 / (float) denominator1;
        comp_num2 = numerator2 / (float) denominator2;

        if(comp_num1 > comp_num2)
            System.out.print("\n"+numerator1+"/"+denominator1+" is greater than "+numerator2+"/"+denominator2+".");

        if(comp_num1 < comp_num2)
            System.out.print("\n"+numerator1+"/"+denominator1+" is less than "+numerator2+"/"+denominator2+".");

        if(comp_num1 == comp_num2)
            System.out.print("\n"+numerator1+"/"+denominator1+" is equal to "+numerator2+"/"+denominator2+".");
    }

    void change(int numerator, int denominator)
    {
        floating_point = numerator / (float) denominator;

        System.out.print("\n"+numerator+"/"+denominator+" in floating point is : "+floating_point);
    }
}


public class Pro7a
{
    public static void main(String[] args)
    {
        try
        {
            Scanner scanner = new Scanner(System.in);

            RationalNumber rationalNumber = new RationalNumber();

            int numerator1, denominator1, numerator2, denominator2, check1, check2;

            System.out.print("\nEnter the numerator of first number : ");
            numerator1 = scanner.nextInt();

            System.out.print("Enter the denominator of first number : ");
            denominator1 = scanner.nextInt();

            System.out.print("\nEnter the numerator of second number : ");
            numerator2 = scanner.nextInt();

            System.out.print("Enter the denominator of second number : ");
            denominator2 = scanner.nextInt();

            check1 = (numerator1 % denominator1);
            check2 = (numerator2 % denominator2);

            if(check1 != 0 && check2 != 0)
            {
                rationalNumber.add(numerator1, denominator1, numerator2, denominator2);
                rationalNumber.sub(numerator1, denominator1, numerator2, denominator2);
                rationalNumber.multi(numerator1, denominator1, numerator2, denominator2);
                rationalNumber.div(numerator1, denominator1, numerator2, denominator2);
                rationalNumber.compare(numerator1, denominator1, numerator2, denominator2);
                rationalNumber.change(numerator1, denominator1);
                rationalNumber.change(numerator2, denominator2);
                System.out.print("\nAbsolute value of first number : "+Math.abs(numerator1)+"/"+Math.abs(denominator1));
                System.out.print("\nAbsolute value of second number : "+Math.abs(numerator2)+"/"+Math.abs(denominator2));
            }

            if(check1 == 0 || numerator1 == 0)
            {
                System.out.print("\nSorry! The first number you have entered is not rational.");

                System.out.print("\nEnter the numerator of first number : ");
                numerator1 = scanner.nextInt();

                System.out.print("Enter the denominator of first number : ");
                denominator1 = scanner.nextInt();

                rationalNumber.add(numerator1, denominator1, numerator2, denominator2);
                rationalNumber.sub(numerator1, denominator1, numerator2, denominator2);
                rationalNumber.multi(numerator1, denominator1, numerator2, denominator2);
                rationalNumber.div(numerator1, denominator1, numerator2, denominator2);
                rationalNumber.compare(numerator1, denominator1, numerator2, denominator2);
                rationalNumber.change(numerator1, denominator1);
                rationalNumber.change(numerator2, denominator2);
                System.out.print("\nAbsolute value of first number : "+Math.abs(numerator1)+"/"+Math.abs(denominator1));
                System.out.print("\nAbsolute value of second number : "+Math.abs(numerator2)+"/"+Math.abs(denominator2));
            }

            if(check2 == 0 || numerator2 == 0)
            {
                System.out.print("\nSorry! The second number you have entered is not rational.");

                System.out.print("\nEnter the numerator of second number : ");
                numerator2 = scanner.nextInt();

                System.out.print("Enter the denominator of second number : ");
                denominator2 = scanner.nextInt();

                rationalNumber.add(numerator1, denominator1, numerator2, denominator2);
                rationalNumber.sub(numerator1, denominator1, numerator2, denominator2);
                rationalNumber.multi(numerator1, denominator1, numerator2, denominator2);
                rationalNumber.div(numerator1, denominator1, numerator2, denominator2);
                rationalNumber.compare(numerator1, denominator1, numerator2, denominator2);
                rationalNumber.change(numerator1, denominator1);
                rationalNumber.change(numerator2, denominator2);
                System.out.print("\nAbsolute value of first number : "+Math.abs(numerator1)+"/"+Math.abs(denominator1));
                System.out.print("\nAbsolute value of second number : "+Math.abs(numerator2)+"/"+Math.abs(denominator2));
            }
        }

        catch (Exception e)
        {
            System.out.print("\nSomething went wrong! "+e.getMessage()+" Exception occurred.\n\n");
            main(null);
        }
    }
}