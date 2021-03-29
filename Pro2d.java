//Program to convert an array to ArrayList

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Pro2d
{
    public static void main(String[] args)
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);

        String[] array;
        int i, n;
        String choice;

        try
        {
            do
            {
                System.out.print("\nEnter the number of elements in array : ");
                n = sc.nextInt();

                array = new String[n];

                for(i = 0; i < n; i++)
                {
                    System.out.print("Enter "+(i+1)+" element : ");
                    array[i] = in.readLine();
                }

                System.out.print("\n\nArray you inputted is : ");
                for (i = 0; i < n; i++)
                    System.out.print(array[i]+"   ");

                ArrayList<String> arr = new ArrayList<>(Arrays.asList(array));

                System.out.print("\nAfter converting Array to ArrayList : "+arr);

                System.out.print("\n\nDo you want to continue? Y or N : ");
                choice = in.readLine();
            }while(!"N".equals(choice));
        }

        catch(Exception e)
        {
            System.out.print(e.getMessage());
        }
    }
}