//Find a peak element in array

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Pro2f
{
    public static void main(String[] args)
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);

        String choice;
        int i, n;
        int [] array;

        try
        {
            do
            {
                System.out.print("\nEnter the number of elements in array : ");
                n = sc.nextInt();

                array = new int[n + 2];

                array[0] = Integer.MIN_VALUE;
                array[n + 1] = Integer.MAX_VALUE;

                for(i = 0; i < n; i++)
                {
                    System.out.print("Enter "+(i+1)+" element : ");
                    array[i] = sc.nextInt();
                }

                System.out.print("\n\nArray you inputted is : ");
                for(i = 0; i < n; i++)
                    System.out.print(array[i]+"   ");

                System.out.println("\nAll peak elements are : ");
                for(i = 1 ; i <= n; i++)
                {
                    if(array[i - 1] < array[i] && array[i] > array[i + 1])
                        System.out.println(array[i]+ " at position : "+(i+1));
                }

                System.out.print("\n\nDo you want continue? Y or N : ");
                choice = in.readLine();
            }while(!"N".equals(choice));
        }

        catch(Exception e)
        {
            System.out.print(e.getMessage());
        }
    }
}