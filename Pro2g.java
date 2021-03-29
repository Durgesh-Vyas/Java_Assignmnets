//Menu driven program for Quick and Bubble Sort using ArrayList

import java.util.ArrayList;
import java.util.Scanner;

public class Pro2g
{
    static int i, size, choice, temp;

    public static void BubbleSort(ArrayList<Integer> array)
    {
        boolean flag = true;

        while(flag)
        {
            flag = false;

            for(i = 0; i < (array.size() -1); i++)
            {
                if(array.get(i).compareTo(array.get(i + 1)) > 0)
                {
                    temp = array.get(i);
                    array.set(i, array.get(i+1));
                    array.set((i + 1), temp);
                    flag = true;
                }
            }
        }
    }


    public static int partition(ArrayList<Integer> array, int beg, int end)
    {
        int left, right, flag = 0;

        i = left = beg;
        right = end;

        while(flag != 1)
        {
            while(array.get(i) <= array.get(right) && (i != right))
                right-- ;

            if(i == right)
                flag = 1;

            else if(array.get(i) > array.get(right))
            {
                temp = array.get(i);
                array.set(i, array.get(right));
                array.set(right, temp);
                i = right;
            }
            if(flag != 1)
            {
                while(array.get(i) >= array.get(left) && (i != left))
                    left++ ;
                if(i == left)
                    flag = 1;
                else if(array.get(i) < array.get(left))
                {
                    temp = array.get(i);
                    array.set(i, array.get(left));
                    array.set(left, temp);
                    i = left;
                }
            }
        }

        return i;
    }


    public static void QuickSort(ArrayList<Integer> array, int beg, int end)
    {
        if(beg < end)
        {
            i = partition(array, beg, end);
            QuickSort(array, beg, i - 1);
            QuickSort(array, i + 1, end);
        }
    }


    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        try
        {
            while(true)
            {
                System.out.print("\n\n\tThese are your options : \n");
                System.out.println("1) Bubble Sort.");
                System.out.println("2) Quick Sort.");
                System.out.println("3) Exit.");
                System.out.print("\t\tPlease enter your choice : ");

                choice = sc.nextInt();

                switch(choice)
                {
                    case 1:
                    {

                        System.out.print("\n\nEnter the numbers of elements in ArrayList : ");
                        size = sc.nextInt();

                        ArrayList<Integer> list = new ArrayList<>(size);

                        for(i = 0; i < size; i++)
                        {
                            System.out.print("Enter "+(i+1)+ " element : ");
                            list.add(sc.nextInt());
                        }

                        BubbleSort(list);

                        System.out.print("\n\t\tSorted ArrayList : "+list);
                        break;
                    }

                    case 2:
                    {

                        System.out.print("\n\nEnter the numbers of elements in ArrayList : ");
                        size = sc.nextInt();

                        ArrayList<Integer> list = new ArrayList<>(size);

                        for(i = 0; i < size; i++)
                        {
                            System.out.print("Enter "+(i+1)+ " element : ");
                            list.add(sc.nextInt());
                        }

                        QuickSort(list, 0, size -1);

                        System.out.print("\n\t\tSorted ArrayList : "+list);
                        break;
                    }

                    case 3:
                    {
                        System.exit(0);
                        break;
                    }

                    default:
                        System.out.println("Please enter a valid choice.");
                }
            }
        }

        catch (Exception e)
        {
            System.out.print(e.getMessage());
        }
    }
}