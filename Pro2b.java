//Program to find smallest distance between 2 neighboring numbers in an array

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.lang.Math;

public class Pro2b
{
    public static void main(String[] argv)
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);

        String choice;

        try
        {
            do
            {
                int n, i, j, small_dist, pos = 0;

                System.out.print("\nEnter the number of elements in array : ");
                n = sc.nextInt();

                int[] arr = new int[n];

                for(i = 0; i < n; i++)
                {
                    System.out.print("Enter "+(i+1)+" element : ");
                    arr[i] = sc.nextInt();
                }

                small_dist = Math.abs(arr[0] - arr[1]);

                for(j = 1; j < (arr.length - 1); j++)
                {
                    int dist = Math.abs(arr[j] - arr[j+1]);
                    if(dist < small_dist)
                    {
                        small_dist = dist;
                        pos = j;
                    }
                }

                System.out.print("\nSmallest distance is : "+small_dist);
                System.out.print("\nThe numbers are "+arr[pos]+" and "+arr[pos + 1]+".");

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