//Program to find the second smallest element in an array

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Pro2c
{
    static int[]  arr;
    static int i, n, j, temp;

    public static int sec_small(int[] arr ,int  n)
    {
        for(i = 0; i < n; i++)
        {
            for(j = (i +1); j < n; j++)
            {
                if(arr[i] > arr[j])
                {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr[1];
    }

    public static void main(String[] args)
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);

        String choice;

        try
        {
            do
            {

                System.out.print("\nEnter the number of elements in array : ");
                n = sc.nextInt();

                arr = new int[n];

                for(i = 0; i < n; i++)
                {
                    System.out.print("Enter "+(i+1)+" element : ");
                    arr[i] = sc.nextInt();
                }

                System.out.print("\n\nArray you have inputted is : ");
                for(i = 0; i < n; i++)
                    System.out.print(arr[i]+"  ");

                System.out.print("\n\nSecond smallest element in the array is : "+sec_small(arr, n));

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