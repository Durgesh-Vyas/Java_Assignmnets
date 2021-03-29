//Program to convert an ArrayList to array

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Pro2e
{
    public static void main(String[] args)
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);

        String choice;
        int i, n;

        try
        {
            do
            {
                System.out.print("\nEnter the number of elements in ArrayList : ");
                n = sc.nextInt();

                ArrayList<String> list = new ArrayList<>(n);

                for(i = 0; i < n; i++)
                {
                    System.out.print("Enter "+(i+1)+ " element : ");
                    list.add(in.readLine());
                }

                System.out.print("\n\nArrayList you inputted is : "+list);

                String[] array = new String[list.size()];

                list.toArray(array);

                System.out.print("\nAfter converting ArrayList to Array : ");
                for(String item : array)
                    System.out.print(item+"   ");

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