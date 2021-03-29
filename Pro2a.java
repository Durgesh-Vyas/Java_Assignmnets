//Program to separate odd and even int and print them

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Pro2a
{
    public static void main(String[] args)
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);

        String choice;

        try
        {
            do
            {
                System.out.print("\nEnter the number of elements you want : ");

                int i, j = 0, k = 0, n;

                n = sc.nextInt();

                int[] even = new int[n];
                int[] odd = new int[n];
                int[] temp = new int[n];

                for(i = 0; i < n; i++)
                {
                    System.out.print("Enter "+(i+1)+" element : ");
                    temp[i] = sc.nextInt();
                }

                for(i = 0; i < n; i++)
                {
                    if(temp[i] % 2 != 0)
                    {
                        odd[j] = temp[i];
                        j++;
                    }
                    else
                    {
                        even[k] = temp[i];
                        k++;
                    }
                }

                System.out.print("\n\t\tOdd numbers entered are : ");
                if(j > 1)
                {
                    for(i = 0; i < (j - 1); i++)
                        System.out.print(odd[i]+", ");
                    System.out.print(odd[j-1]);
                }
                else
                    System.out.print("No odd numbers found!");

                System.out.print("\n\t\tEven numbers entered are : ");
                if(k > 1)
                {
                    for(i = 0; i < (k - 1); i++)
                        System.out.print(even[i]+", ");
                    System.out.print(even[k-1]);
                }
                else
                    System.out.print("No even numbers found!");

                System.out.print("\n\nDo you want to continue? Y or N : ");
                choice = in.readLine();
            }while(!"N".equals(choice));
        }

        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}